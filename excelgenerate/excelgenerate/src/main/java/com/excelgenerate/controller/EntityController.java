package com.excelgenerate.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.excelgenerate.service.EntityService;

@RestController
public class EntityController {
	
	@Autowired
	private EntityService entityservice;
	
	@GetMapping("/exportToExcel")
	public String exportToExcel(@RequestParam String excelFilePath)
	{
		try
		{
			entityservice.exportDataToExcel(excelFilePath);
			return "Data exported to excel";
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return "Error exporting data to excel";
		}
	}
	

}
