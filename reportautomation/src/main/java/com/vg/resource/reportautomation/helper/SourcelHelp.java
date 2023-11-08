package com.vg.resource.reportautomation.helper;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
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
		//List<VGSourceEntity> list = new ArrayList<>();
		
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
				sourceExcelData.setVGCrewId((formatter.formatCellValue(row.getCell(requiredHeaders.get("VG Crew Id"))));
				sourceExcelData.setResourceName(formatter.formatCellValue(row.getCell(requiredHeaders.get("Resource Name"))));
				sourceExcelData.setLevel(formatter.formatCellValue(row.getCell(requiredHeaders.get("Level"))));
				sourceExcelData.setJobRole(formatter.formatCellValue(row.getCell(requiredHeaders.get("Job Role"))));
				sourceExcelData.setPrimaryskill(formatter.formatCellValue(row.getCell(requiredHeaders.get("Primary Skill"))));
				sourceExcelData.setPo(formatter.formatCellValue(row.getCell(requiredHeaders.get("PO"))));
				sourceExcelData.setSowId(formatter.formatCellValue(row.getCell(requiredHeaders.get("SOW Id"))));
				sourceExcelData.setHours(formatter.formatCellValue(row.getCell(requiredHeaders.get("Hours"))));
				sourceExcelData.setHourlyRate(formatter.formatCellValue(row.getCell(requiredHeaders.get("Hourly Rate"))));
				sourceExcelData.setAmount(formatter.formatCellValue(row.getCell(requiredHeaders.get("Amount"))));
				sourceExcelData.setRoleStartDate((Date)row.getCell(requiredHeaders.get("Role Start Date")));
				sourceExcelData.setRoleEndDate((Date)row.getCell(requiredHeaders.get("Role End Date")));
				sourceExcelData.setTotalContractAmount(formatter.formatCellValue(row.getCell(requiredHeaders.get("Total Contract Amount"))));
				sourceExcelData.setComment(formatter.formatCellValue(row.getCell(requiredHeaders.get("Comment"))));
				sourceExcelData.setStatus(formatter.formatCellValue(row.getCell(requiredHeaders.get("Status"))));
				sourceExcelData.setExhibit_type(formatter.formatCellValue(row.getCell(requiredHeaders.get("Exhibit Type"))));
				sourceExcelData.setResourc_type(formatter.formatCellValue(row.getCell(requiredHeaders.get("Resource Type"))));
				sourceExcelData.setPaymentType(formatter.formatCellValue(row.getCell(requiredHeaders.get("Payment Type"))));
				sourceExcelData.setSowStartDate((Date)row.getCell(requiredHeaders.get("SOW Start Date")));
				sourceExcelData.setSowEndDate((Date)row.getCell(requiredHeaders.get("SOW End Date")));
				sourceExcelData.setLocationVg(formatter.formatCellValue(row.getCell(requiredHeaders.get("VG Location"))));
				
				
				
				
				list.add(sourceExcelData);
			}

			int rowNumber =0;
			Iterator<Row> iterator = sheet.iterator();
			
			
			
			
			/*Workbook workbook = new XSSFWorkbook(is);
			Sheet sheet = workbook.getSheetAt(0);
			
			int rowNumber =0;
			Iterator<Row> iterator = sheet.iterator();
			
			while(iterator.hasNext())
			{
				Row row = iterator.next();
				if(rowNumber == 0)
				{
					rowNumber++;
					continue;
				}
				
				Iterator<Cell> cells = row.iterator();
				int cellId = 0;
				VGSourceEntity sourcedata = new VGSourceEntity();
				while(cells.hasNext())

				{

					Cell cell = cells.next();
					switch(cellId)
					{
					case 0:
						cell.setCellType(CellType.STRING);
						sourcedata.setGGId(cell.getStringCellValue());
						break;
					case 1:
						cell.setCellType(CellType.NUMERIC);
						sourcedata.setVGCrewId(cell.getNumericCellValue());
						break;
					case 2:
						cell.setCellType(CellType.STRING);
						sourcedata.setResourceName(cell.getStringCellValue());
						break;
					case 3:
						cell.setCellType(CellType.STRING);
						sourcedata.setLevel(cell.getStringCellValue());
						break;
					case 4:
						cell.setCellType(CellType.STRING);
						sourcedata.setJobRole(cell.getStringCellValue());
						break;
					case 5:
						cell.setCellType(CellType.STRING);
						sourcedata.setPrimaryskill(cell.getStringCellValue());
						break;
					case 6:
						cell.setCellType(CellType.STRING);
						sourcedata.setPo(cell.getStringCellValue());
						break;
					case 7:
						cell.setCellType(CellType.NUMERIC);
						sourcedata.setSowId((int)cell.getNumericCellValue());
						break;
					case 8:
						cell.setCellType(CellType.STRING);
						sourcedata.setHours(cell.getStringCellValue());
						break;
					case 9:
						cell.setCellType(CellType.STRING);
						sourcedata.setHourlyRate(cell.getStringCellValue());
						break;
					case 10:
						cell.setCellType(CellType.STRING);
						sourcedata.setAmount(cell.getStringCellValue());
						break;
					case 11:
						cell.setCellType(CellType.NUMERIC);
						sourcedata.setRoleStartDate(cell.getDateCellValue());
						break;
					case 12:
						cell.setCellType(CellType.NUMERIC);
						sourcedata.setRoleEndDate(cell.getDateCellValue());
						break;
					case 13:
						cell.setCellType(CellType.STRING);
						sourcedata.setTotalContractAmount(cell.getStringCellValue());
						break;
					case 14:
						cell.setCellType(CellType.STRING);						
						sourcedata.setComment(cell.getStringCellValue());
						break;
					case 15:
						cell.setCellType(CellType.STRING);						
						sourcedata.setStatus(cell.getStringCellValue());
						break;
					case 16:
						cell.setCellType(CellType.STRING);						
						sourcedata.setExhibit_type(cell.getStringCellValue());
						break;
					case 17:
						cell.setCellType(CellType.STRING);						
						sourcedata.setResourc_type(cell.getStringCellValue());
						break;	
					case 18:
						cell.setCellType(CellType.NUMERIC);						
						sourcedata.setSowStartDate(cell.getDateCellValue());
						break;
					case 19:
						cell.setCellType(CellType.NUMERIC);						
						sourcedata.setSowEndDate(cell.getDateCellValue());
						break;
					case 20:						
						sourcedata.setPaymentType(cell.getStringCellValue());
						break;
					case 21:						
						sourcedata.setLocationVg(cell.getStringCellValue());
						break;					
					default:
						break;
					}
					cellId++;
				}
				list.add(sourcedata);				
			}
			workbook.close(); */
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}
}
