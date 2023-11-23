package com.vg.resource.reportautomation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import com.vg.resource.reportautomation.entity.VGVdiDetailEntity;
import com.vg.resource.reportautomation.helper.VGVdiDetailHelper;
import com.vg.resource.reportautomation.service.vgVdiDetailService;

public class VGVdiDetailsController {
	@Autowired
	private vgVdiDetailService vgvdiDetailService;
	
	
	@PostMapping(path="/upload/excel",consumes=MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<?> upload(@RequestPart("file") MultipartFile file)
	{
		if(VGVdiDetailHelper.checkExcelFormat(file))
		{
			this.vgvdiDetailService.save(file);
			return ResponseEntity.status(HttpStatus.OK).body("Successfull");
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Upload Excel file only");
	}

	@GetMapping("/data")
	public List<VGVdiDetailEntity> getAllData()
		{
			return this.vgvdiDetailService.getAllData();
		}



}
