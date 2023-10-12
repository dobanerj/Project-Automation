package com.excel.demo.project.helper;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import com.excel.demo.project.entity.SourceData;
import com.excel.demo.project.repo.SourcingRepo;



public class SourceHelper {
	@Autowired
	private SourcingRepo sourcingRepo;
	
	public static boolean checkExcelFormat(MultipartFile file)
	{
		String contentType = file.getContentType();
		if(contentType.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"))
		{
			return true;
		}
		return false;
	}
	
	public static List<SourceData> convertExceltoList(InputStream is)
	{
		List<SourceData> list = new ArrayList<>();
		try {
			
			Workbook workbook = new XSSFWorkbook(is);
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
				SourceData sourcedata = new SourceData();
				while(cells.hasNext())
				{
					Cell cell = cells.next();
					switch(cellId)
					{
					case 0:
						cell.setCellType(CellType.NUMERIC);
						sourcedata.setGGId((int)cell.getNumericCellValue());
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
						sourcedata.setSkill(cell.getStringCellValue());
						break;		
					case 6:
						cell.setCellType(CellType.STRING);
						sourcedata.setPo(cell.getStringCellValue());
						break;
					case 7:
						cell.setCellType(CellType.STRING);
						sourcedata.setSowId(cell.getStringCellValue());
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
						cell.setCellType(CellType.STRING);
						sourcedata.setRoleStartDate(cell.getStringCellValue());
						break;
					case 12:
						cell.setCellType(CellType.STRING);
						sourcedata.setRoleEndDate(cell.getStringCellValue());
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
					default:
						break;
					
					}
					cellId++;
				}
				list.add(sourcedata);				
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return list;
	}

}