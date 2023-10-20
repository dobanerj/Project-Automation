package com.vg.resource.reportautomation.service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import java.sql.SQLException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import com.vg.resource.reportautomation.helper.ReportHelper;
import com.vg.resource.reportautomation.util.ReportUtilHelper;



@Service
public class ReportService {
	
	public void generateExcel() throws IOException, SQLException {
		List<ReportHelper> data = ReportUtilHelper.readPostgres();
		FileOutputStream outputStream = null;
	    try (Workbook workbook = new XSSFWorkbook()) {
		File file = new File("C:/Users/dobanerj/Documents/Report/HCReport.xlsx");
		file.getParentFile().mkdirs(); // Will create parent directories if not exists
		file.createNewFile();	
		CellStyle style=workbook.createCellStyle();
		CellStyle styleBlue=workbook.createCellStyle();
		CellStyle styleORG=workbook.createCellStyle();
	    Sheet sheet = workbook.createSheet("Data");
		int colIndex = 0;
	 	Row row=sheet.createRow(0);        
		ReportUtilHelper.createOrangeCell(colIndex++,row,styleORG).setCellValue("SR.No");
		ReportUtilHelper.createRedCell(colIndex++,row,style).setCellValue("CrewId");
		ReportUtilHelper.createOrangeCell(colIndex++,row,styleORG).setCellValue("LI/LR ID");
		ReportUtilHelper.createRedCell(colIndex++,row,style).setCellValue("GGID");
		ReportUtilHelper.createRedCell(colIndex++,row,style).setCellValue("Resource Name");
		ReportUtilHelper.createRedCell(colIndex++,row,style).setCellValue("Cap Email id");
		ReportUtilHelper.createOrangeCell(colIndex++,row,styleORG).setCellValue("VG Email");
		ReportUtilHelper.createRedCell(colIndex++,row,style).setCellValue("CG Manager(Sup Name)");

		ReportUtilHelper.createOrangeCell(colIndex++,row,styleORG).setCellValue("VG Manager");
		ReportUtilHelper.createRedCell(colIndex++,row,style).setCellValue("Level");
		ReportUtilHelper.createBlueCell(colIndex++,row,style).setCellValue("Grade revised");
		ReportUtilHelper.createBlueCell(colIndex++,row,style).setCellValue("Local Grade");
		ReportUtilHelper.createBlueCell(colIndex++,row,style).setCellValue("Region");
		ReportUtilHelper.createBlueCell(colIndex++,row,style).setCellValue("Region Revised");
		ReportUtilHelper.createBlueCell(colIndex++,row,style).setCellValue("GAD Cost Center");
		ReportUtilHelper.createBlueCell(colIndex++,row,style).setCellValue("Project Code");

		ReportUtilHelper.createBlueCell(colIndex++,row,styleBlue).setCellValue("Project Name");
		ReportUtilHelper.createRedCell(colIndex++,row,styleBlue).setCellValue("Job Title/Role (Please use drop down selection)");
		ReportUtilHelper.createRedCell(colIndex++,row,styleBlue).setCellValue("Skill");
		ReportUtilHelper.createBlueCell(colIndex++,row,styleBlue).setCellValue("Practice");
		ReportUtilHelper.createBlueCell(colIndex++,row,styleBlue).setCellValue("Sub-Practice");
		ReportUtilHelper.createRedCell(colIndex++,row,style).setCellValue("PO#");
		ReportUtilHelper.createRedCell(colIndex++,row,style).setCellValue("SOW Name");
		ReportUtilHelper.createRedCell(colIndex++,row,style).setCellValue("Sow Id");

		ReportUtilHelper.createRedCell(colIndex++,row,style).setCellValue("SOW Start date");
		ReportUtilHelper.createRedCell(colIndex++,row,style).setCellValue("SOW End date");
		ReportUtilHelper.createRedCell(colIndex++,row,style).setCellValue("Exhibit Type");
		ReportUtilHelper.createRedCell(colIndex++,row,style).setCellValue("Resource Type");
		ReportUtilHelper.createRedCell(colIndex++,row,style).setCellValue("Hours");
		ReportUtilHelper.createRedCell(colIndex++,row,style).setCellValue("Hourly Rate");
		ReportUtilHelper.createRedCell(colIndex++,row,style).setCellValue("Amount");

		ReportUtilHelper.createRedCell(colIndex++,row,style).setCellValue("Role Start date");
		ReportUtilHelper.createRedCell(colIndex++,row,style).setCellValue("Role End date");
		ReportUtilHelper.createRedCell(colIndex++,row,style).setCellValue("Location");
		ReportUtilHelper.createRedCell(colIndex++,row,style).setCellValue("Location VG");
		ReportUtilHelper.createRedCell(colIndex++,row,style).setCellValue("Total Contract Amount");
		ReportUtilHelper.createRedCell(colIndex++,row,style).setCellValue("Payment Type");
		ReportUtilHelper.createRedCell(colIndex++,row,style).setCellValue("Commect(If Any)");

		ReportUtilHelper.createBlueCell(colIndex++,row,styleBlue).setCellValue("SBU");
		ReportUtilHelper.createBlueCell(colIndex++,row,styleBlue).setCellValue("LOB");
		ReportUtilHelper.createBlueCell(colIndex++,row,styleBlue).setCellValue("DE");
		ReportUtilHelper.createBlueCell(colIndex++,row,styleBlue).setCellValue("EM");
		ReportUtilHelper.createBlueCell(colIndex++,row,styleBlue).setCellValue("Current Status");
		ReportUtilHelper.createBlueCell(colIndex++,row,styleBlue).setCellValue("BU Portfolios");
		ReportUtilHelper.createBlueCell(colIndex++,row,styleBlue).setCellValue("End Date (R2D2");
		int index=1;
		int dataRowIndex =1 ;
		 for (ReportHelper excel1 : data){
			Row dataRow=sheet.createRow(dataRowIndex++);
			dataRow.createCell(0).setCellValue(index++);
			dataRow.createCell(1).setCellValue(excel1.getVgcrew_id());
			dataRow.createCell(2).setCellValue(excel1.getLi_lr_id());
			dataRow.createCell(3).setCellValue(excel1.getGgid());
			dataRow.createCell(4).setCellValue(excel1.getResource_name());
			dataRow.createCell(5).setCellValue("");
			dataRow.createCell(6).setCellValue("");
			dataRow.createCell(7).setCellValue("");
			dataRow.createCell(8).setCellValue("");
			dataRow.createCell(9).setCellValue(excel1.getLevel());
			dataRow.createCell(10).setCellValue(excel1.getPo());
			dataRow.createCell(11).setCellValue(excel1.getPrimaryskill());
			dataRow.createCell(12).setCellValue(excel1.getResource_name());
			dataRow.createCell(13).setCellValue(excel1.getRole_end_date());
			dataRow.createCell(14).setCellValue(excel1.getPo());
			dataRow.createCell(15).setCellValue(excel1.getPrimaryskill());
			dataRow.createCell(16).setCellValue(excel1.getResource_name());
			dataRow.createCell(17).setCellValue(excel1.getRole_end_date());
			dataRow.createCell(18).setCellValue(excel1.getPo());
			dataRow.createCell(19).setCellValue(excel1.getPrimaryskill());
			dataRow.createCell(20).setCellValue(excel1.getResource_name());
			dataRow.createCell(21).setCellValue(excel1.getRole_end_date());
			dataRow.createCell(22).setCellValue(excel1.getResource_name());
			dataRow.createCell(23).setCellValue(excel1.getRole_end_date());
			dataRow.createCell(24).setCellValue(excel1.getRole_start_date());
			dataRow.createCell(25).setCellValue(excel1.getSow_id());
			dataRow.createCell(26).setCellValue(excel1.getStatus());
			dataRow.createCell(27).setCellValue(excel1.getTotal_contract_amount());
			dataRow.createCell(28).setCellValue((excel1).getVgcrew_id());
		}
		try 
		 {	
            outputStream = new FileOutputStream(file,false); 
			workbook.write(outputStream);
			 
         } catch (IOException e) {
             e.printStackTrace();
         }finally{
			workbook.close();
			if(outputStream !=null)
				outputStream.close();
		 }
     } catch (IOException e) {
         e.printStackTrace();
     }
 }
}