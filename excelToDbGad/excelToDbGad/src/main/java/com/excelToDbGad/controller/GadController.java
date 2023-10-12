package com.excelToDbGad.controller;

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

import com.excelToDbGad.entity.GadData;
import com.excelToDbGad.helper.GadHelper;
import com.excelToDbGad.service.GadService;

@RestController
public class GadController {
	
	@Autowired
	private GadService gadService;
	
	@PostMapping(path="/upload/excel",consumes=MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<?> upload(@RequestPart("file") MultipartFile file)
	{
		if(GadHelper.checkExcelFormat(file))
		{
			this.gadService.save(file);
			return ResponseEntity.status(HttpStatus.OK).body("Successfull");
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Upload Excel file only");
	}
	
	
	@GetMapping("/data")
	public List<GadData> getAllData()
		{
			return this.gadService.getAllData();
		}

}
