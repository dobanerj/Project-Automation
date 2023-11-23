package com.vg.resource.reportautomation.controller;

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

import com.vg.resource.reportautomation.entity.VGSourceEntity;
import com.vg.resource.reportautomation.helper.SourcelHelp;
import com.vg.resource.reportautomation.service.SourceService;

@RestController
public class SourceController {
	@Autowired
	private SourceService sourcService;
	
	
	@PostMapping(path="/upload/excel",consumes=MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<?> upload(@RequestPart("file") MultipartFile file)
	{
		if(SourcelHelp.checkExcelFormat(file))
		{
			this.sourcService.save(file);
			return ResponseEntity.status(HttpStatus.OK).body("Successfull");
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Upload Excel file only");
	}
	
	
	@GetMapping("/data")
	public List<VGSourceEntity> getAllData()
		{
			return this.sourcService.getAllData();
		}

}
