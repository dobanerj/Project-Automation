package com.excelgenerate.service;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excelgenerate.entity.EntityData;
import com.excelgenerate.repo.EntityRepo;

@Service
public class EntityService {
	
	@Autowired
	private EntityRepo entityRepo;
	
	public void exportDataToExcel(String excelFilePath) throws FileNotFoundException, IOException
	{
		
		List<EntityData> data = entityRepo.findAll();
		 
		Workbook workbook =new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("vg_source");	
		
		int rowNum = 0;
		Row headerRow = sheet.createRow(rowNum++);
		
		headerRow.createCell(0).setCellValue("ggid");
		headerRow.createCell(1).setCellValue("vgid");
		headerRow.createCell(2).setCellValue("comment");
		headerRow.createCell(3).setCellValue("hourly_rate");
		headerRow.createCell(4).setCellValue("hours");
		headerRow.createCell(5).setCellValue("jobrole");
		headerRow.createCell(6).setCellValue("level");
		headerRow.createCell(7).setCellValue("po");
		headerRow.createCell(8).setCellValue("resource_name");
		headerRow.createCell(9).setCellValue("role_enddt");
		headerRow.createCell(10).setCellValue("role_strtdt");
		headerRow.createCell(11).setCellValue("skill");
		headerRow.createCell(12).setCellValue("sowid");
		headerRow.createCell(13).setCellValue("status");
		headerRow.createCell(14).setCellValue("contract_amount");
		headerRow.createCell(15).setCellValue("amount");
		
		for(EntityData value : data)
		{
			Row row = sheet.createRow(rowNum++);
			row.createCell(0).setCellValue(value.getgGId());
			row.createCell(1).setCellValue(value.getvGCrewId());
			row.createCell(2).setCellValue(value.getComment());
			row.createCell(3).setCellValue(value.getHourlyRate());
			row.createCell(4).setCellValue(value.getHours());
			row.createCell(5).setCellValue(value.getJobRole());
			row.createCell(6).setCellValue(value.getLevel());
			row.createCell(7).setCellValue(value.getPo());
			row.createCell(8).setCellValue(value.getResourceName());
			row.createCell(9).setCellValue(value.getRoleEndDate());
			row.createCell(10).setCellValue(value.getRoleStartDate());
			row.createCell(11).setCellValue(value.getSkill());
			row.createCell(12).setCellValue(value.getSowId());
			row.createCell(13).setCellValue(value.getStatus());
			row.createCell(14).setCellValue(value.getTotalContractAmount());
			row.createCell(15).setCellValue(value.getAmount());
			
		}
		
		try(FileOutputStream outputStream = new FileOutputStream(excelFilePath)) 
		{
			workbook.write(outputStream);
		}
	
		
	}

}
