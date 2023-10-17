package com.vggadsourcingcmd.project.service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.vggadsourcingcmd.project.entity.sourcingExcelEntity;
import com.vggadsourcingcmd.project.repo.sourcingExcelRepo;

@Service
public class DatabaseToExcelSourcingService {
	
	@Autowired
	private sourcingExcelRepo sourcingexcelRepo;
	
	public void generateExcel() throws IOException {
		List<sourcingExcelEntity> excels =sourcingexcelRepo.findAll();
		Workbook workbook=new XSSFWorkbook();
		Sheet sheet=workbook.createSheet("Sourcing excel Info");
		Row row=sheet.createRow(0);
		row.createCell(0).setCellValue("GGId");
		row.createCell(1).setCellValue("VGCrewId");
		row.createCell(2).setCellValue("ResourceName");
		row.createCell(3).setCellValue("Level");
		row.createCell(4).setCellValue("JobRole");
		row.createCell(5).setCellValue("Primaryskill");
		row.createCell(6).setCellValue("PO");
		row.createCell(7).setCellValue("SOWId");
		row.createCell(8).setCellValue("Hours");
		row.createCell(9).setCellValue("HourlyRate");
		row.createCell(10).setCellValue("Amount");
		row.createCell(11).setCellValue("RoleStartDate");
		row.createCell(12).setCellValue("RoleEndDate");
		row.createCell(13).setCellValue("TotalContractAmount");
		row.createCell(14).setCellValue("Comment");
		row.createCell(15).setCellValue("Status");
	
		
		int dataRowIndex =1 ;
		for(sourcingExcelEntity excel : excels) {
			Row dataRow=sheet.createRow(dataRowIndex);
			dataRow.createCell(0).setCellValue(excel.getgGId());
			dataRow.createCell(1).setCellValue(excel.getvGCrewId());
			dataRow.createCell(2).setCellValue(excel.getResourceName());
			dataRow.createCell(3).setCellValue(excel.getLevel());
			dataRow.createCell(4).setCellValue(excel.getJobRole());
			dataRow.createCell(5).setCellValue(excel.getPrimaryskill());
			dataRow.createCell(6).setCellValue(excel.getPo());
			dataRow.createCell(7).setCellValue(excel.getSowId());
			dataRow.createCell(8).setCellValue(excel.getHours());
			dataRow.createCell(9).setCellValue(excel.getHourlyRate());
			dataRow.createCell(10).setCellValue(excel.getAmount());
			dataRow.createCell(11).setCellValue(excel.getRoleStartDate());
			dataRow.createCell(12).setCellValue(excel.getRoleEndDate());
			dataRow.createCell(13).setCellValue(excel.getTotalContractAmount());
			dataRow.createCell(14).setCellValue(excel.getComment());
			dataRow.createCell(15).setCellValue(excel.getStatus());
			
			dataRowIndex++;
		}
		FileOutputStream file=new FileOutputStream("C:\\Users\\SGHOSH31\\Videos\\github upload\\Project-Automation\\vgGadSourcingcmd\\target\\sourcingexcel.xlsx");
		workbook.write(file);
		workbook.close();
		file.close();
		
	}
}
