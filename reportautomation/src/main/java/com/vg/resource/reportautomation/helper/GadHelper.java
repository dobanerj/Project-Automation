package com.vg.resource.reportautomation.helper;

import java.io.InputStream;
import java.util.ArrayList;
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

	public static List<vgGadEntity> convertExceltoList(InputStream is)
	{
		List<vgGadEntity> list = new ArrayList<>();
		Map<String, Integer> requiredHeaders = new HashMap<>();
		try {
			DataFormatter formatter = new DataFormatter();
			Workbook workbook = new XSSFWorkbook(is);
			Sheet sheet = workbook.getSheetAt(0);
			
			for (Cell cell : sheet.getRow(0)) {
				requiredHeaders.put(cell.getStringCellValue().trim(), cell.getColumnIndex());

			}
			for (int i = 1; i <= sheet.getLastRowNum(); i++) {
				Row row = sheet.getRow(i);
				vgGadEntity vggadEntity = new vgGadEntity();
				vggadEntity.setGgid(formatter.formatCellValue(row.getCell(requiredHeaders.get("GGID"))));
				vggadEntity.setLi_lrId(formatter.formatCellValue(row.getCell(requiredHeaders.get("LI/LR ID"))));
				vggadEntity.setCapEmailid(formatter.formatCellValue(row.getCell(requiredHeaders.get("Cap Email id"))));
				vggadEntity.setGraderevised(formatter.formatCellValue(row.getCell(requiredHeaders.get("Grade revised"))));
				vggadEntity.setLocalgrade(formatter.formatCellValue(row.getCell(requiredHeaders.get("Local Grade"))));
				vggadEntity.setRegion(formatter.formatCellValue(row.getCell(requiredHeaders.get("Region"))));
				vggadEntity.setRegionRevised(formatter.formatCellValue(row.getCell(requiredHeaders.get("Region Revised"))));
				//vggadEntity.setGadCostCenter(formatter.formatCellValue(row.getCell(requiredHeaders.get("GAD Cost Center"))));
				vggadEntity.setProjectCode(Double.parseDouble(formatCellValue(row.getCell(requiredHeaders.get("Project Code")))));
				vggadEntity.setProjectName(formatter.formatCellValue(row.getCell(requiredHeaders.get("Project Name"))));
				vggadEntity.setPractice(formatter.formatCellValue(row.getCell(requiredHeaders.get("Practice"))));
				vggadEntity.setSbu(formatter.formatCellValue(row.getCell(requiredHeaders.get("SBU"))));
				vggadEntity.setFs_non_fs(formatter.formatCellValue(row.getCell(requiredHeaders.get("FS/Non FS/SubK"))));
				vggadEntity.setBuPortfolio(formatter.formatCellValue(row.getCell(requiredHeaders.get("BU Portfolios"))));
				vggadEntity.setLob(formatter.formatCellValue(row.getCell(requiredHeaders.get("LOB"))));
				vggadEntity.setDe(formatter.formatCellValue(row.getCell(requiredHeaders.get("DE"))));
				vggadEntity.setEm(formatter.formatCellValue(row.getCell(requiredHeaders.get("EM"))));
				vggadEntity.setSubPractise(formatter.formatCellValue(row.getCell(requiredHeaders.get("Sub Practice"))));
				vggadEntity.setLocation(formatter.formatCellValue(row.getCell(requiredHeaders.get("Location"))));
				//vggadEntity.setLob(formatter.formatCellValue(row.getCell(requiredHeaders.get("CURRENT STATUS")))); not in excel
				//vggadEntity.setDe(formatter.formatCellValue(row.getCell(requiredHeaders.get("END DATE (R2D2)"))));not in excel
				//vggadEntity.setSupervisor(formatter.formatCellValue(row.getCell(requiredHeaders.get("Supervisor FULL NAME"))));not in excel
				list.add(vggadEntity);
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

	private static String formatCellValue(Cell cell) {
		// TODO Auto-generated method stub
		return null;
	}
}
	