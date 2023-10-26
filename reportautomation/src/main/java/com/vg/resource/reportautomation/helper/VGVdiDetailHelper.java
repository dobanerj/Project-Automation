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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import com.vg.resource.reportautomation.entity.VGVdiDetailEntity;
import com.vg.resource.reportautomation.repo.vgVdiDetailRepo;

public class VGVdiDetailHelper {
	@Autowired
	private vgVdiDetailRepo vdiRepo;
	
	public static boolean checkExcelFormat(MultipartFile file)
	{
		String contentType = file.getContentType();
		if(contentType.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"))
		{
			return true;
		}
		return false;
	}
	
	public static List<VGVdiDetailEntity> convertExceltoList(InputStream is)
	{
		List<VGVdiDetailEntity> list = new ArrayList<>();
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
				VGVdiDetailEntity vdidata = new VGVdiDetailEntity();
				while(cells.hasNext())

				{

					Cell cell = cells.next();
					switch(cellId)
					{
					case 0:
						cell.setCellType(CellType.STRING);
						vdidata.setGgid(cell.getStringCellValue());
						break;
					case 1:
						cell.setCellType(CellType.STRING);
						vdidata.setVendor(cell.getStringCellValue());
						break;
					case 2:
						cell.setCellType(CellType.STRING);
						vdidata.setId(cell.getStringCellValue());
						break;
					case 3:
						cell.setCellType(CellType.STRING);
						vdidata.setResource_name(cell.getStringCellValue());
						break;
					case 4:
						cell.setCellType(CellType.STRING);
						vdidata.setCg_email_id(cell.getStringCellValue());
						break;
					case 5:
						cell.setCellType(CellType.STRING);
						vdidata.setVg_email_id(cell.getStringCellValue());
						break;
					case 6:
						cell.setCellType(CellType.STRING);
						vdidata.setVdi_name(cell.getStringCellValue());
						break;
					case 7:
						cell.setCellType(CellType.STRING);
						vdidata.setOdc_location(cell.getStringCellValue());
						break;
					case 8:
						cell.setCellType(CellType.STRING);
						vdidata.setStatus(cell.getStringCellValue());
						break;
					case 9:
						cell.setCellType(CellType.NUMERIC);
						vdidata.setLwd(cell.getDateCellValue());
						break;
					case 10:
						cell.setCellType(CellType.STRING);
						vdidata.setComments(cell.getStringCellValue());
						break;
					
					default:
						break;
					}
					cellId++;
				}
				list.add(vdidata);				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}
}
