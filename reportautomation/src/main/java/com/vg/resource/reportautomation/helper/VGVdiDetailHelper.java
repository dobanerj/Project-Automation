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

import com.vg.resource.reportautomation.entity.VGVdiDetailEntity;

public class VGVdiDetailHelper {
	
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
			Iterator<Row> iterator = sheet.iterator();
			
			while(iterator.hasNext())
			{
				Row row = iterator.next();
				if(row.getRowNum() == 0)
				{					
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
					
					case 2:
						cell.setCellType(CellType.STRING);					
							vdidata.setVdi_ggid(cell.getStringCellValue());
						break;
					
					case 1:
						cell.setCellType(CellType.STRING);				
						vdidata.setId(cell.getStringCellValue());
						break;
					case 3:
						vdidata.setResource_name(cell.getStringCellValue());
						break;
					case 4:
						vdidata.setCg_email_id(cell.getStringCellValue());
						break;
					case 5:
						vdidata.setVg_email_id(cell.getStringCellValue());
						break;
					case 6:
						vdidata.setVdi_name(cell.getStringCellValue());
						break;
					case 7:
						vdidata.setOdc_location(cell.getStringCellValue());
						break;
					case 8:
						vdidata.setStatus(cell.getStringCellValue());
						break;
					case 9:
						cell.setCellType(CellType.NUMERIC);
						vdidata.setLwd(cell.getDateCellValue());
						break;
					case 10:
						vdidata.setComments(cell.getStringCellValue());
						break;
					
					default:
						break;
					}
					cellId++;
				}
				list.add(vdidata);				
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
