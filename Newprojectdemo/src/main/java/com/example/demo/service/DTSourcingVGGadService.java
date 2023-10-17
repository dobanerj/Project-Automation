package com.example.demo.service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import java.sql.SQLException;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import com.example.demo.helper.reportHelper;
import com.example.demo.util.ReportUtilHelper;

@Service
public class DTSourcingVGGadService {
	
	public void generateExcel() throws IOException, SQLException {
		List<reportHelper> data = ReportUtilHelper.readPostgres();
		FileOutputStream outputStream = null;
	    try (Workbook workbook = new XSSFWorkbook()) {
		File file = new File("C:/Users/dobanerj/Documents/Report/HCReport.xlsx");
		file.getParentFile().mkdirs(); // Will create parent directories if not exists
		file.createNewFile();	
	    Sheet sheet = workbook.createSheet("Data");
	 	Row row=sheet.createRow(0);
		row.createCell(0).setCellValue("GGID");
		row.createCell(1).setCellValue("LI/LR ID");
		row.createCell(2).setCellValue("Per_nr");
		row.createCell(3).setCellValue("LOCAL GRADE");
		row.createCell(4).setCellValue("REGION");
		row.createCell(5).setCellValue("PROJECT CODE");
		row.createCell(6).setCellValue("Practice");
		row.createCell(7).setCellValue("Sub_practice");
		row.createCell(8).setCellValue("Bu_portfolios");
		row.createCell(9).setCellValue("Amount");
		row.createCell(10).setCellValue("Comment");
		row.createCell(11).setCellValue("HourlyRate");
		row.createCell(12).setCellValue("Hours");
		row.createCell(13).setCellValue("Job_role");
		row.createCell(14).setCellValue("Level");
		row.createCell(15).setCellValue("Po");
		row.createCell(16).setCellValue("Primaryskill");
		row.createCell(17).setCellValue("Resource_name");
		row.createCell(18).setCellValue("Role_end_date");
		row.createCell(19).setCellValue("Role_start_date");
		row.createCell(20).setCellValue("Sow_id");
		row.createCell(21).setCellValue("Status");
		row.createCell(22).setCellValue("Total_contract_amount");
		row.createCell(23).setCellValue("Vgcrew_id");

		int dataRowIndex =1 ;
		 for (reportHelper excel1 : data){
			Row dataRow=sheet.createRow(dataRowIndex++);
			dataRow.createCell(0).setCellValue(excel1.getGgid());
			dataRow.createCell(1).setCellValue(excel1.getLi_lr_id());
			dataRow.createCell(2).setCellValue(excel1.getPer_nr());
			dataRow.createCell(3).setCellValue(excel1.getLocal_grade());
			dataRow.createCell(4).setCellValue(excel1.getRegion());
			dataRow.createCell(5).setCellValue(excel1.getProject_name());
			dataRow.createCell(6).setCellValue(excel1.getPractice());
			dataRow.createCell(7).setCellValue(excel1.getSub_practice());
			dataRow.createCell(8).setCellValue(excel1.getBu_portfolios());
			dataRow.createCell(9).setCellValue(excel1.getAmount());
			dataRow.createCell(10).setCellValue(excel1.getComment());
			dataRow.createCell(11).setCellValue(excel1.getHourly_rate());
			dataRow.createCell(12).setCellValue(excel1.getHours());
			dataRow.createCell(13).setCellValue(excel1.getJob_role());
			dataRow.createCell(14).setCellValue(excel1.getLevel());
			dataRow.createCell(15).setCellValue(excel1.getPo());
			dataRow.createCell(16).setCellValue(excel1.getPrimaryskill());
			dataRow.createCell(17).setCellValue(excel1.getResource_name());
			dataRow.createCell(18).setCellValue(excel1.getRole_end_date());
			dataRow.createCell(19).setCellValue(excel1.getRole_start_date());
			dataRow.createCell(20).setCellValue(excel1.getSow_id());
			dataRow.createCell(21).setCellValue(excel1.getStatus());
			dataRow.createCell(22).setCellValue(excel1.getTotal_contract_amount());
			dataRow.createCell(23).setCellValue(excel1.getVgcrew_id());
		}
		try 
		 {	
            outputStream = new FileOutputStream(file,false); 
			workbook.write(outputStream);
			 
         } catch (IOException e) {
             e.printStackTrace();
         }finally{
			workbook.close();
			outputStream.close();
		 }
     } catch (IOException e) {
         e.printStackTrace();
     }
 }
}
