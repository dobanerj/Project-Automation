package com.vg.resource.reportautomation.helper;
 
import java.io.InputStream;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;
import com.vg.resource.reportautomation.entity.VGNonFSEntity;
import com.vg.resource.reportautomation.repo.vgNonFSRepo;
 
public class NonFSHelp {
	@Autowired
	private vgNonFSRepo noFSExcelRepo;
	public static boolean checkExcelFormat(MultipartFile file)
	{
		String contentType = file.getContentType();
		if(contentType.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"))
		{
			return true;
		}
		return false;
	}
	public static List<VGNonFSEntity> convertExceltoList(InputStream is)
	{
		List<VGNonFSEntity> list = new ArrayList<>();
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
				VGNonFSEntity noFSExceldata = new VGNonFSEntity();
				noFSExceldata.setEmpID(formatter.formatCellValue(row.getCell(requiredHeaders.get("Emp ID"))));
				noFSExceldata.setLob(formatter.formatCellValue(row.getCell(requiredHeaders.get("LOB"))));
				noFSExceldata.setEmpName(formatter.formatCellValue(row.getCell(requiredHeaders.get("Emp Name"))));
				noFSExceldata.setEmpEmailId(formatter.formatCellValue(row.getCell(requiredHeaders.get("Emp email ID"))));
				noFSExceldata.setProjectcode(formatter.formatCellValue(row.getCell(requiredHeaders.get("Project code "))));
				noFSExceldata.setProjectname(formatter.formatCellValue(row.getCell(requiredHeaders.get("Project name"))));
				//noFSExceldata.setStartDate((Date)row.getCell(requiredHeaders.get("ODC Location"))); not in excel
				//noFSExceldata.setEndDate((Date) row.getCell(requiredHeaders.get("LWD"))); not in excel
				//noFSExceldata.setRegion(formatter.formatCellValue(row.getCell(requiredHeaders.get("Status"))));	
				//noFSExceldata.setLocation(formatter.formatCellValue(row.getCell(requiredHeaders.get("Status"))));	
				//noFSExceldata.setRevisedRegion(formatter.formatCellValue(row.getCell(requiredHeaders.get("Status"))));		
				list.add(noFSExceldata);
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
