package com.vg.resource.reportautomation.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Color;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;

import com.vg.resource.reportautomation.helper.ReportHelper;


public class ReportUtilHelper {
    public  static List<ReportHelper> readPostgres() throws SQLException{
		try{
			Class.forName("org.postgresql.Driver");
		}catch(ClassNotFoundException e){
			System.out.println("Where psql JDBC jar?"
			+ "include library path!");
			e.printStackTrace();
			
		}
		Connection connection = null;
		Statement stmt = null;
		List<ReportHelper> listOfReport = new ArrayList<>(); 
		ReportHelper helper = null;
		try{
			connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/ReportAutomation", "postgres", "admin");
			stmt = connection.createStatement();
            System.out.println(ReportUtil.query);
			ResultSet rs = stmt.executeQuery(ReportUtil.query);
			while(rs.next()){
				helper = new ReportHelper();
				helper.setGgid(rs.getString("GGID"));
                helper.setLi_lr_id(rs.getString("LI_LR_ID"));
                //helper.setPer_nr(rs.getDouble("PERNR"));
                helper.setLocal_grade(rs.getString("LOCAL_GRADE"));
                helper.setRegion(rs.getString("REGION"));
                helper.setProject_name(rs.getString("PROJECT_NAME"));
                helper.setPractice(rs.getString("PRACTICE"));
                helper.setSub_practice(rs.getString("SUB_PRACTICE"));
                helper.setBu_portfolios(rs.getString("BU_PORTFOLIO")); 
                helper.setAmount(rs.getString("AMOUNT"));
                helper.setComment(rs.getString("COMMENTS"));
                helper.setHourly_rate(rs.getString("HOURLY_RATE"));
                helper.setHours(rs.getString("HOURS"));
                helper.setJob_role(rs.getString("JOB_ROLE"));
                helper.setLevel(rs.getString("LEVEL"));
                helper.setPo(rs.getString("PO")); 
                helper.setPrimaryskill(rs.getString("PRIMARY_SKILL"));
                helper.setResource_name(rs.getString("RESOURCE_NAME"));
                helper.setRole_end_date(rs.getString("ROLE_END_DATE"));
                helper.setRole_start_date(rs.getString("ROLE_START_DATE"));
                helper.setSow_id(rs.getString("SOW_ID"));
                helper.setStatus(rs.getString("CURRENT_STATUS"));
                helper.setTotal_contract_amount(rs.getString("TOTAL_CONTRACT_AMOUNT"));
                helper.setVgcrew_id(rs.getDouble("VG_CREW_ID"));
                helper.setLob(rs.getString("LOB"));
                helper.setDe_name(rs.getString("DE"));
                helper.setEm_name(rs.getString("EM"));
                helper.setVg_email(rs.getString("VG_EMAIL_ID"));
                helper.setCap_email(rs.getString("CAP_EMAIL_ID"));
                helper.setVdi_name(rs.getString("VDI_NAME"));
                helper.setCostcenter(rs.getString("GAD_COST_CENTER"));
                helper.setRegion_revised(rs.getString("REGION_REVISED"));
                helper.setGrade_revised(rs.getString("GRADE_REVISED"));
                helper.setProject_Code(rs.getString("PROJECT_CODE"));
                helper.setOdc_location(rs.getString("ODC_LOCATION"));
                helper.setExhibit_type(rs.getString("EXHIBIT TYPE"));
                helper.setResource_type(rs.getString("RESOURCE TYPE"));
                helper.setPayment_type(rs.getString("PAYMENT TYPE"));
                helper.setSow_start_date(rs.getString("SOW_START_DATE"));
                helper.setSow_end_date(rs.getString("SOW_END_DATE"));
                helper.setLocation(rs.getString("LOCATION"));
                helper.setSbu(rs.getString("SBU"));
                helper.setSow_name(rs.getString("SOW_NAME"));
				listOfReport.add(helper);
				
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		finally{
			if(connection != null)
				connection.close();
		
		}
		return listOfReport;
	}

public static Cell createSrcCell(int cellNo,Row row,CellStyle style){			
			style.setFillBackgroundColor(IndexedColors.RED1.index); 
            style.setFillPattern(FillPatternType.DIAMONDS);             
            style.setBorderBottom(BorderStyle.THICK);
            style.setBorderLeft(BorderStyle.THICK);
            style.setBorderTop(BorderStyle.THICK);
            style.setBorderRight(BorderStyle.THICK);
            Cell cell=row.createCell(cellNo); 
            cell.setCellStyle(style);   
			return cell;
} 
public static Cell createGadCell(int cellNo,Row row,CellStyle style){			
			style.setFillBackgroundColor(IndexedColors.BRIGHT_GREEN.index);  
            style.setFillPattern(FillPatternType.DIAMONDS);              
            style.setBorderBottom(BorderStyle.THICK);
            style.setBorderLeft(BorderStyle.THICK);
            style.setBorderTop(BorderStyle.THICK);
            style.setBorderRight(BorderStyle.THICK);
            Cell cell=row.createCell(cellNo); 
            cell.setCellStyle(style);   
			return cell;
}
public static Cell createOrangeCell(int cellNo,Row row,CellStyle style){			
            style.setFillBackgroundColor(IndexedColors.GOLD.index); 
            style.setFillPattern(FillPatternType.DIAMONDS); 
            style.setBorderBottom(BorderStyle.THICK);
            style.setBorderLeft(BorderStyle.THICK);
            style.setBorderTop(BorderStyle.THICK);
            style.setBorderRight(BorderStyle.THICK);
            XSSFCell cell=(XSSFCell) row.createCell(cellNo); 
            cell.setCellStyle(style);   
			return cell;
}
}
