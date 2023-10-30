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
import com.vg.resource.reportautomation.util.ReportUtil;
import com.vg.resource.reportautomation.util.ReportUtilHelper;



@Service
public class ReportService {
	
	public void generateExcel() throws IOException, SQLException {
		List<ReportHelper> data = ReportUtilHelper.readPostgres();
		FileOutputStream outputStream = null;
	    try (Workbook workbook = new XSSFWorkbook()) {
		File file = new File("C:/Users/anghosal/OneDrive - Capgemini/Desktop/HCReport.xlsx");
		file.getParentFile().mkdirs(); // Will create parent directories if not exists
		file.createNewFile();	
		CellStyle style=workbook.createCellStyle();
		CellStyle styleBlue=workbook.createCellStyle();
		CellStyle styleORG=workbook.createCellStyle();
	    Sheet sheet = workbook.createSheet("Data");
		int colIndex = 0;
	 	Row row=sheet.createRow(0);  

	 	
	 	ReportUtilHelper.createOrangeCell(colIndex++,row,styleORG).setCellValue(ReportUtil.HC_REPORT_SR_NO);
		ReportUtilHelper.createRedCell(colIndex++,row,style).setCellValue(ReportUtil.HC_REPORT_CREW_ID);
	 	
		ReportUtilHelper.createOrangeCell(colIndex++,row,styleORG).setCellValue(ReportUtil.HC_REPORT_LI_LR_ID);
		ReportUtilHelper.createRedCell(colIndex++,row,style).setCellValue(ReportUtil.HC_REPORT_GG_ID);
		ReportUtilHelper.createRedCell(colIndex++,row,style).setCellValue(ReportUtil.HC_REPORT_RESOURCE_NAME);
		ReportUtilHelper.createRedCell(colIndex++,row,style).setCellValue(ReportUtil.HC_REPORT_CAP_EMAIL_ID);
		ReportUtilHelper.createOrangeCell(colIndex++,row,styleORG).setCellValue(ReportUtil.HC_REPORT_VG_EMAIL);
		ReportUtilHelper.createRedCell(colIndex++,row,style).setCellValue(ReportUtil.HC_REPORT_CG_MANAGER);

		ReportUtilHelper.createOrangeCell(colIndex++,row,styleORG).setCellValue(ReportUtil.HC_REPORT_VG_MANAGER);
		ReportUtilHelper.createRedCell(colIndex++,row,style).setCellValue(ReportUtil.HC_REPORT_LEVEL);
		ReportUtilHelper.createBlueCell(colIndex++,row,style).setCellValue(ReportUtil.HC_REPORT_GRADE_REVISED);
		ReportUtilHelper.createBlueCell(colIndex++,row,style).setCellValue(ReportUtil.HC_REPORT_LOCAL_GRADE);
		ReportUtilHelper.createBlueCell(colIndex++,row,style).setCellValue(ReportUtil.HC_REPORT_REGION);
		ReportUtilHelper.createBlueCell(colIndex++,row,style).setCellValue(ReportUtil.HC_REPORT_REGION_REVISED);
		ReportUtilHelper.createBlueCell(colIndex++,row,style).setCellValue(ReportUtil.HC_REPORT_GAD_COST_CENTER);
		ReportUtilHelper.createBlueCell(colIndex++,row,style).setCellValue(ReportUtil.HC_REPORT_PROJECT_CODE);

		ReportUtilHelper.createBlueCell(colIndex++,row,styleBlue).setCellValue(ReportUtil.HC_REPORT_PROJECT_NAME);
		ReportUtilHelper.createRedCell(colIndex++,row,styleBlue).setCellValue(ReportUtil.HC_REPORT_JOB_ROLE);
		ReportUtilHelper.createRedCell(colIndex++,row,styleBlue).setCellValue(ReportUtil.HC_REPORT_SKILL);
		ReportUtilHelper.createBlueCell(colIndex++,row,styleBlue).setCellValue(ReportUtil.HC_REPORT_PRACTICE);
		ReportUtilHelper.createBlueCell(colIndex++,row,styleBlue).setCellValue(ReportUtil.HC_REPORT_SUB_PRACTICE);
		ReportUtilHelper.createRedCell(colIndex++,row,style).setCellValue(ReportUtil.HC_REPORT_PO);
		ReportUtilHelper.createRedCell(colIndex++,row,style).setCellValue(ReportUtil.HC_REPORT_SOW_NAME);
		ReportUtilHelper.createRedCell(colIndex++,row,style).setCellValue(ReportUtil.HC_REPORT_SOW_ID);

		ReportUtilHelper.createRedCell(colIndex++,row,style).setCellValue(ReportUtil.HC_REPORT_SOW_START_DATE);
		ReportUtilHelper.createRedCell(colIndex++,row,style).setCellValue(ReportUtil.HC_REPORT_SOW_END_DATE);
		ReportUtilHelper.createRedCell(colIndex++,row,style).setCellValue(ReportUtil.HC_REPORT_EXHIBIT_TYPE);
		ReportUtilHelper.createRedCell(colIndex++,row,style).setCellValue(ReportUtil.HC_REPORT_RESOURCE_TYPE);
		ReportUtilHelper.createRedCell(colIndex++,row,style).setCellValue(ReportUtil.HC_REPORT_HOURS);
		ReportUtilHelper.createRedCell(colIndex++,row,style).setCellValue(ReportUtil.HC_REPORT_HOURLY_RATE);
		ReportUtilHelper.createRedCell(colIndex++,row,style).setCellValue(ReportUtil.HC_REPORT_AMOUNT);

		ReportUtilHelper.createRedCell(colIndex++,row,style).setCellValue(ReportUtil.HC_REPORT_ROLE_START_DATE);
		ReportUtilHelper.createRedCell(colIndex++,row,style).setCellValue(ReportUtil.HC_REPORT_ROLE_END_DATE);
		ReportUtilHelper.createRedCell(colIndex++,row,style).setCellValue(ReportUtil.HC_REPORT_LOCATION);
		ReportUtilHelper.createRedCell(colIndex++,row,style).setCellValue(ReportUtil.HC_REPORT_LOCATION_VG);
		ReportUtilHelper.createRedCell(colIndex++,row,style).setCellValue(ReportUtil.HC_REPORT_TOTAL_CONTRACT_AMOUNT);
		ReportUtilHelper.createRedCell(colIndex++,row,style).setCellValue(ReportUtil.HC_REPORT_PAYMENT_TYPE);
		ReportUtilHelper.createRedCell(colIndex++,row,style).setCellValue(ReportUtil.HC_REPORT_COMMENT);

		ReportUtilHelper.createBlueCell(colIndex++,row,styleBlue).setCellValue(ReportUtil.HC_REPORT_SBU);
		ReportUtilHelper.createBlueCell(colIndex++,row,styleBlue).setCellValue(ReportUtil.HC_REPORT_LOB);
		ReportUtilHelper.createBlueCell(colIndex++,row,styleBlue).setCellValue(ReportUtil.HC_REPORT_DE);
		ReportUtilHelper.createBlueCell(colIndex++,row,styleBlue).setCellValue(ReportUtil.HC_REPORT_EM);
		ReportUtilHelper.createBlueCell(colIndex++,row,styleBlue).setCellValue(ReportUtil.HC_REPORT_CURRENT_STATUS);
		ReportUtilHelper.createBlueCell(colIndex++,row,styleBlue).setCellValue(ReportUtil.HC_REPORT_BU_PORTFOLIOS);
		ReportUtilHelper.createBlueCell(colIndex++,row,styleBlue).setCellValue(ReportUtil.HC_REPORT_END_DATE_R2D2);
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