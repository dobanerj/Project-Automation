package com.vg.resource.reportautomation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.vg.resource.reportautomation.entity.VGNonFSEntity;
import com.vg.resource.reportautomation.entity.VGVdiDetailEntity;
import com.vg.resource.reportautomation.entity.vgGadEntity;
import com.vg.resource.reportautomation.helper.NonFSHelp;
import com.vg.resource.reportautomation.service.NonFSService;

@RestController
public class NonFsController {
	@Autowired
	private NonFSService nonFSService;
	
	
	@PostMapping(path="/upload/excel/nonfs",consumes=MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<?> upload(@RequestPart("file") MultipartFile file)
	{
		if(NonFSHelp.checkExcelFormat(file))
		{
			this.nonFSService.save(file);
			return ResponseEntity.status(HttpStatus.OK).body("Successfull");
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Upload Excel file only");
	}

	@GetMapping("/nonfsdata")
	public List<VGNonFSEntity> getAllData()
		{
			return this.nonFSService.getAllData();
		}
	@GetMapping("/vgGadByGGID/{empID}")  
	private VGNonFSEntity getNonFs(@PathVariable("empID") String ggid)   
	{  
		return nonFSService.getNonFsById(ggid);
	}  

	@DeleteMapping("/DeleteVgGad/{empID}")  
	private void deleteGGID(@PathVariable("empID") String ggid)   
	{  
		nonFSService.delete(ggid);  
	}  
	
	@PutMapping("NonFs/updateData")
	public VGNonFSEntity updateData(@RequestBody VGNonFSEntity vgNonFSEntity) {
		return nonFSService.savevgNonFSEntity(vgNonFSEntity);
	}
}
