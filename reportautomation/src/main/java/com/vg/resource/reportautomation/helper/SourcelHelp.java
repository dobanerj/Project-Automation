package com.vg.resource.reportautomation.helper;

import java.io.InputStream;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
<<<<<<< HEAD
=======
import java.util.Iterator;
>>>>>>> 39cdd8ca841ce4080e355d907b173f5c2a1e1c2f
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
<<<<<<< HEAD
=======
import org.apache.poi.ss.usermodel.CellType;
>>>>>>> 39cdd8ca841ce4080e355d907b173f5c2a1e1c2f
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
			try (Workbook workbook = new XSSFWorkbook(is)) {
				Sheet sheet = workbook.getSheetAt(0);				
				for (Cell cell : sheet.getRow(sheet.getFirstRowNum())) {
					requiredHeaders.put(cell.getStringCellValue().toUpperCase().trim(), cell.getColumnIndex());
				}
				for (int i = 1; i <= sheet.getLastRowNum(); i++) {
					Row row = sheet.getRow(i);
					VGSourceEntity sourceExcelData = new VGSourceEntity();
					sourceExcelData.setGGId(formatter.formatCellValue(row.getCell(requiredHeaders.get("VG CREW ID"))));
					sourceExcelData.setResourceName(formatter.formatCellValue(row.getCell(requiredHeaders.get("RESOURCE NAME"))));
					sourceExcelData.setLevel(formatter.formatCellValue(row.getCell(requiredHeaders.get("LEVEL"))));
					sourceExcelData.setJobRole(formatter.formatCellValue(row.getCell(requiredHeaders.get("JOB TITLE/ROLE (PLEASE USE DROP DOWN SELECTION)"))));
					sourceExcelData.setPrimaryskill(formatter.formatCellValue(row.getCell(requiredHeaders.get("PRIMARY SKILLS"))));
					sourceExcelData.setPo(formatter.formatCellValue(row.getCell(requiredHeaders.get("PO#"))));
					if(!(formatter.formatCellValue(row.getCell(requiredHeaders.get("SOW ID"))).isEmpty() || 
					 formatter.formatCellValue(row.getCell(requiredHeaders.get("SOW ID"))).equals("TBD")))
					sourceExcelData.setSowId(Integer.valueOf(formatter.formatCellValue(row.getCell(requiredHeaders.get("SOW ID")))));
					sourceExcelData.setHours(formatter.formatCellValue(row.getCell(requiredHeaders.get("HOURS"))));
					sourceExcelData.setHourlyRate(formatter.formatCellValue(row.getCell(requiredHeaders.get("HOURLY RATE"))));
					sourceExcelData.setAmount(formatter.formatCellValue(row.getCell(requiredHeaders.get("AMOUNT"))));
					sourceExcelData.setRoleStartDate(formatter.formatCellValue(row.getCell(requiredHeaders.get("ROLE START DATE"))));
					sourceExcelData.setRoleEndDate(formatter.formatCellValue(row.getCell(requiredHeaders.get("ROLE END DATE"))));
					sourceExcelData.setTotalContractAmount(formatter.formatCellValue(row.getCell(requiredHeaders.get("TOTAL CONTRACT AMOUNT"))));
					sourceExcelData.setComment(formatter.formatCellValue(row.getCell(requiredHeaders.get("COMMENTS (IF ANY)"))));
					//sourceExcelData.setStatus(formatter.formatCellValue(row.getCell(requiredHeaders.get("STATUS"))));
					sourceExcelData.setExhibit_type(formatter.formatCellValue(row.getCell(requiredHeaders.get("EXHIBIT TYPE"))));
					sourceExcelData.setResourc_type(formatter.formatCellValue(row.getCell(requiredHeaders.get("RESOURCE TYPE"))));
					sourceExcelData.setPaymentType(formatter.formatCellValue(row.getCell(requiredHeaders.get("PAYMENT TYPE"))));
					sourceExcelData.setSowStartDate(formatter.formatCellValue(row.getCell(requiredHeaders.get("SOW START DATE"))));
					sourceExcelData.setSowEndDate(formatter.formatCellValue(row.getCell(requiredHeaders.get("SOW END DATE"))));
					//sourceExcelData.setLocationVg(formatter.formatCellValue(row.getCell(requiredHeaders.get("VG LOCATION")))); 					
					list.add(sourceExcelData);
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}
<<<<<<< HEAD
}
=======
	
}
>>>>>>> 39cdd8ca841ce4080e355d907b173f5c2a1e1c2f
