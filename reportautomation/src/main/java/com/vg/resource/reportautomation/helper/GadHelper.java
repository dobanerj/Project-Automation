package com.vg.resource.reportautomation.helper;

import java.io.InputStream;
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

import com.vg.resource.reportautomation.entity.VGNonFSEntity;
import com.vg.resource.reportautomation.entity.vgGadEntity;
import com.vg.resource.reportautomation.util.ReportUtil;

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

	public static List<vgGadEntity> convertExceltoList(InputStream is)
	{
		List<vgGadEntity> list = new ArrayList<>();
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
					//System.out.println("row--"+row);
					if(row!=null){
					vgGadEntity vggadEntity = new vgGadEntity();
					
					vggadEntity.setGgid(formatter.formatCellValue(row.getCell(requiredHeaders.get(ReportUtil.HC_REPORT_GG_ID))));
					vggadEntity.setLi_lrId(formatter.formatCellValue(row.getCell(requiredHeaders.get("LI/LR ID"))));
					vggadEntity.setCapEmailid(formatter.formatCellValue(row.getCell(requiredHeaders.get("CAP EMAIL ID"))));
					vggadEntity.setGraderevised(formatter.formatCellValue(row.getCell(requiredHeaders.get("GRADE REVISED"))));
					vggadEntity.setLocalgrade(formatter.formatCellValue(row.getCell(requiredHeaders.get("LOCAL GRADE"))));
					vggadEntity.setRegion(formatter.formatCellValue(row.getCell(requiredHeaders.get("REGION"))));
					vggadEntity.setRegionRevised(formatter.formatCellValue(row.getCell(requiredHeaders.get("REGION REVISED"))));
					//vggadEntity.setGadCostCenter(formatter.formatCellValue(row.getCell(requiredHeaders.get("GAD COST CENTER"))));
					vggadEntity.setProjectCode(formatter.formatCellValue(row.getCell(requiredHeaders.get("PROJECT NUMBER"))));
					vggadEntity.setProjectName(formatter.formatCellValue(row.getCell(requiredHeaders.get("PROJECT NAME"))));
					vggadEntity.setPractice(formatter.formatCellValue(row.getCell(requiredHeaders.get("PRACTICE"))));
					vggadEntity.setSbu(formatter.formatCellValue(row.getCell(requiredHeaders.get("SBU"))));
					vggadEntity.setFs_non_fs(formatter.formatCellValue(row.getCell(requiredHeaders.get("FS/NON FS/SUBK"))));
					vggadEntity.setBuPortfolio(formatter.formatCellValue(row.getCell(requiredHeaders.get("BU PORTFOLIOS"))));
					vggadEntity.setLob(formatter.formatCellValue(row.getCell(requiredHeaders.get("LOB"))));
					vggadEntity.setDe(formatter.formatCellValue(row.getCell(requiredHeaders.get("DE"))));
					vggadEntity.setEm(formatter.formatCellValue(row.getCell(requiredHeaders.get("EM"))));
					vggadEntity.setSubPractise(formatter.formatCellValue(row.getCell(requiredHeaders.get("SUB PRACTICE"))));
					vggadEntity.setLocation(formatter.formatCellValue(row.getCell(requiredHeaders.get("LOCATION"))));
					vggadEntity.setSupervisor(formatter.formatCellValue(row.getCell(requiredHeaders.get("SUPERVISOR FULL NAME"))));
					list.add(vggadEntity);
					}
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}

	
}
	
