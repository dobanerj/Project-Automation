package com.example.demo.helper;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entity.NoFSExcelEntity;
import com.example.demo.entity.repo.NoFSExcelRepo;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class NoFSExcelHelp {
	@Autowired
	private NoFSExcelRepo noFSExcelRepo;
	public static boolean checkExcelFormat(MultipartFile file)
	{
		String contentType = file.getContentType();
		if(contentType.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"))
		{
			return true;
		}
		return false;
	}
	
	public static List<NoFSExcelEntity> convertExceltoList(InputStream is)
	{
		List<NoFSExcelEntity> list = new ArrayList<>();
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
				NoFSExcelEntity noFSExceldata = new NoFSExcelEntity();
				while(cells.hasNext())

				{

					Cell cell = cells.next();
					switch(cellId)
					{
					case 0:
						cell.setCellType(CellType.STRING);
						noFSExceldata.setMonth(cell.getStringCellValue());
						break;
					case 1:
						cell.setCellType(CellType.STRING);
						noFSExceldata.setAccountName(cell.getStringCellValue());
						break;
					case 2:
						cell.setCellType(CellType.STRING);
						noFSExceldata.setLob(cell.getStringCellValue());
						break;
					case 3:
						cell.setCellType(CellType.NUMERIC);
						noFSExceldata.setEmpID((int)cell.getNumericCellValue());
						break;
					case 4:
						cell.setCellType(CellType.STRING);
						noFSExceldata.setEmpName(cell.getStringCellValue());
						break;
					case 5:
						cell.setCellType(CellType.STRING);
						noFSExceldata.setEmpEmailId(cell.getStringCellValue());
						break;
					case 6:
						cell.setCellType(CellType.STRING);
						noFSExceldata.setEmpUserID(cell.getStringCellValue());
						break;
					case 7:
						cell.setCellType(CellType.STRING);
						noFSExceldata.setDesignation(cell.getStringCellValue());
						break;
					case 8:
						cell.setCellType(CellType.STRING);
						noFSExceldata.setProjectcode(cell.getStringCellValue());
						break;
					case 9:
						cell.setCellType(CellType.STRING);
						noFSExceldata.setProjectname(cell.getStringCellValue());
						break;
					case 10:
						cell.setCellType(CellType.NUMERIC);
						noFSExceldata.setStartDate(cell.getDateCellValue());
						break;
					case 11:
						cell.setCellType(CellType.NUMERIC);
						noFSExceldata.setEndDate(cell.getDateCellValue());
						break;
					case 12:
						cell.setCellType(CellType.STRING);
						noFSExceldata.setRegion(cell.getStringCellValue());
						break;
					case 13:
						cell.setCellType(CellType.STRING);
						noFSExceldata.setLocation(cell.getStringCellValue());
						break;
					case 14:
						cell.setCellType(CellType.STRING);
						noFSExceldata.setRevisedRegion(cell.getStringCellValue());
						break;
					case 15:
						cell.setCellType(CellType.STRING);
						noFSExceldata.setLbs(cell.getStringCellValue());
						break;
					default:
						break;

					}
					cellId++;
				}
				list.add(noFSExceldata);				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}
	
}
