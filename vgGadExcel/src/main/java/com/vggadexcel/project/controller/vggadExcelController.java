package com.vggadexcel.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.vggadexcel.project.entity.VgGadExcel;
import com.vggadexcel.project.helper.vgGadHelper;
import com.vggadexcel.project.service.vgGadExcelService;

@RestController
public class vggadExcelController {
	@Autowired
	private vgGadExcelService vggadexcelservice;
	
	
	@PostMapping(path="/upload/excel",consumes=MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<?> upload(@RequestPart("file") MultipartFile file)
	{
		if(vgGadHelper.checkExcelFormat(file))
		{
			this.vggadexcelservice.save(file);
			return ResponseEntity.status(HttpStatus.OK).body("Excel file upload Successfull");
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Upload Excel file only");
	}
	
	
	@GetMapping("/data")
	public List<VgGadExcel> getAllData()
		{
			return this.vggadexcelservice.getAllData();
		}
}
