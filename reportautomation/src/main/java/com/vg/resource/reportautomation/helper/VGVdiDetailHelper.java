package com.vg.resource.reportautomation.helper;

import java.io.InputStream;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
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
				VGVdiDetailEntity vdidata = new VGVdiDetailEntity();
				//vdidata.setVdi_ggid(formatter.formatCellValue(row.getCell(requiredHeaders.get("GGID"))));
				//vdidata.setId(formatter.formatCellValue(row.getCell(requiredHeaders.get("ID"))));
				vdidata.setResource_name(formatter.formatCellValue(row.getCell(requiredHeaders.get("Resource Name"))));
				//vdidata.setVg_email_id(formatter.formatCellValue(row.getCell(requiredHeaders.get("VG Email ID"))));
				vdidata.setVdi_name(formatter.formatCellValue(row.getCell(requiredHeaders.get("VDI name"))));
				vdidata.setOdc_location(formatter.formatCellValue(row.getCell(requiredHeaders.get("ODC Location"))));
				vdidata.setStatus(formatter.formatCellValue(row.getCell(requiredHeaders.get("Status"))));
				//vdidata.setLwd((Date) row.getCell(requiredHeaders.get("LWD")));	
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
