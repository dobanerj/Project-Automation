package com.vg.resource.reportautomation.helper;

import java.io.InputStream;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import com.vg.resource.reportautomation.entity.VGNonFSEntity;
import com.vg.resource.reportautomation.entity.VGSourceEntity;



public class SourcelHelp {
	
	
	public static boolean checkExcelFormat(MultipartFile file)
	{
		String contentType = file.getContentType();
		if(contentType.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"))
		{
			return true;
		}
		return false;
	}
	
	public static List<VGSourceEntity> convertExceltoList(InputStream is)
	{
		List<VGSourceEntity> list = new ArrayList<>();
		Map<String, Integer> requiredHeaders = new HashMap<>();
		try {
			DataFormatter formatter = new DataFormatter();
			Workbook workbook = new XSSFWorkbook(is);
			Sheet sheet = workbook.getSheetAt(0);
			for (Cell cell : sheet.getRow(0)) {
				requiredHeaders.put(cell.getStringCellValue(), cell.getColumnIndex());
			}
			for (int i = 1; i <= sheet.getLastRowNum(); i++) {
				Row row = sheet.getRow(i);
				VGSourceEntity sourceExcelData = new VGSourceEntity();
				sourceExcelData.setGGId(formatter.formatCellValue(row.getCell(requiredHeaders.get("GGID"))));
				sourceExcelData.setResourceName(formatter.formatCellValue(row.getCell(requiredHeaders.get("Resource Name"))));
				sourceExcelData.setLevel(formatter.formatCellValue(row.getCell(requiredHeaders.get("Level"))));
				sourceExcelData.setJobRole(formatter.formatCellValue(row.getCell(requiredHeaders.get("Job Title/Role (Please use drop down selection)"))));
				//sourceExcelData.setPrimaryskill(formatter.formatCellValue(row.getCell(requiredHeaders.get("PRIMARY SKILLS"))));
				sourceExcelData.setPo(formatter.formatCellValue(row.getCell(requiredHeaders.get("PO#"))));
				//sourceExcelData.setSowId(Integer.getInteger(formatter.formatCellValue(row.getCell(requiredHeaders.get("SOW ID")))));
				sourceExcelData.setHours(formatter.formatCellValue(row.getCell(requiredHeaders.get("Hours"))));
				sourceExcelData.setHourlyRate(formatter.formatCellValue(row.getCell(requiredHeaders.get("Hourly Rate"))));
				sourceExcelData.setAmount(formatter.formatCellValue(row.getCell(requiredHeaders.get("Amount"))));
				//sourceExcelData.setRoleStartDate((Date)row.getCell(requiredHeaders.get("Role Start Date")));
				//sourceExcelData.setRoleEndDate((Date)row.getCell(requiredHeaders.get("Role End Date")));
				sourceExcelData.setTotalContractAmount(formatter.formatCellValue(row.getCell(requiredHeaders.get("Total Contract Amount"))));
				sourceExcelData.setComment(formatter.formatCellValue(row.getCell(requiredHeaders.get("Comments (if any)"))));
				//sourceExcelData.setStatus(formatter.formatCellValue(row.getCell(requiredHeaders.get("Status"))));
				sourceExcelData.setExhibit_type(formatter.formatCellValue(row.getCell(requiredHeaders.get("Exhibit Type"))));
				sourceExcelData.setResourc_type(formatter.formatCellValue(row.getCell(requiredHeaders.get("Resource Type"))));
				sourceExcelData.setPaymentType(formatter.formatCellValue(row.getCell(requiredHeaders.get("Payment Type"))));
				//sourceExcelData.setSowStartDate((Date)row.getCell(requiredHeaders.get("SOW Start Date")));
				//sourceExcelData.setSowEndDate((Date)row.getCell(requiredHeaders.get("SOW End Date")));
				//sourceExcelData.setLocationVg(formatter.formatCellValue(row.getCell(requiredHeaders.get("VG Location")))); not in excel

				
				list.add(sourceExcelData);
			}

			int rowNumber =0;
			Iterator<Row> iterator = sheet.iterator();
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}
	
}
