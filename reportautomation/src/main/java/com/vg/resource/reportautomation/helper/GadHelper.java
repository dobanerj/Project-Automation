package com.vg.resource.reportautomation.helper;

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
import org.springframework.web.multipart.MultipartFile;

import com.vg.resource.reportautomation.entity.vgGadEntity;

public class GadHelper {	
	
	public static boolean checkExcelFormat(MultipartFile file)
	{
		String contentType = file.getContentType();
		if(contentType!=null && contentType.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"))
		{
			return true;
		}
		return false;
	}
	
	/**
	 * @param is
	 * @return
	 */
	public static List<vgGadEntity> convertExceltoList(InputStream is)
	{
		List<vgGadEntity> list = new ArrayList<>();
		try {
			
			Workbook workbook = new XSSFWorkbook(is);
			Sheet sheet = workbook.getSheetAt(0);
			
			int rowNumber =0;
			Iterator<Row> iterator = sheet.iterator();
			
			while(iterator.hasNext())
			{
				Row row = iterator.next();
				
				//To skip Header Row
				if(rowNumber == 0)
				{
					rowNumber++;
					continue;
				}
				
				Iterator<Cell> cells = row.iterator();
				int cellId = 0;
				vgGadEntity VgGadExcel = new vgGadEntity();
				while(cells.hasNext())
				{
					Cell cell = cells.next();
					switch(cellId)
					{
					case 0:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setLi_lrId(cell.getStringCellValue());
						break;
					case 1:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setGgid(cell.getStringCellValue());
						break;
					case 2:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setCapEmailid(cell.getStringCellValue());
						break;
					case 3:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setGraderevised(cell.getStringCellValue());
						break;
					case 4:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setLocalgrade(cell.getStringCellValue());
						break;
					case 5:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setRegion(cell.getStringCellValue());
						break;
					case 6:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setRegionRevised(cell.getStringCellValue());
						break;
						
					case 7:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setGadCostCenter(cell.getStringCellValue());
						break;
					case 8:
						cell.setCellType(CellType.NUMERIC);
						VgGadExcel.setProjectCode(cell.getNumericCellValue());
						break;
					case 9:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setProjectName(cell.getStringCellValue());
						break;
					case 10:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setPractice(cell.getStringCellValue());
						break;
					case 11:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setSbu(cell.getStringCellValue());
						break;
					case 12:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setFs_non_fs(cell.getStringCellValue());
						break;
					case 13:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setBuPortfolio(cell.getStringCellValue());
						break;
					case 14:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setLob(cell.getStringCellValue());
						break;
					case 15:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setDe(cell.getStringCellValue());
						break;
					case 16:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setEm(cell.getStringCellValue());
						break;	
					case 17:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setCurrentStatus(cell.getStringCellValue());
						break;
					case 18:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setEndDateR2d2(cell.getStringCellValue());
						break;
					case 19:
						cell.setCellType(CellType.STRING);						
						VgGadExcel.setSubPractise(cell.getStringCellValue());
						break;
					case 20:
						cell.setCellType(CellType.STRING);						
						VgGadExcel.setLocation(cell.getStringCellValue());
						break;	
					default:
						break;
					
					}
					cellId++;
				}
				list.add(VgGadExcel);				
			}
			workbook.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		return list;
	}
}