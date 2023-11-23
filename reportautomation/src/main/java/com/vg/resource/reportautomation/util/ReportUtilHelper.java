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
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;

import com.vg.resource.reportautomation.helper.ReportHelper;


public class ReportUtilHelper {
	public  static List<ReportHelper> readFSDataFromDatabase() throws SQLException{
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
            System.out.println(ReportUtil.FSquery);
			ResultSet fsRs = stmt.executeQuery(ReportUtil.FSquery);
			while(fsRs.next()){
				helper = new ReportHelper();
				helper.setGgid(fsRs.getString("GGID"));
                helper.setLi_lr_id(fsRs.getString("LI_LR_ID"));
                helper.setLocal_grade(fsRs.getString("LOCAL_GRADE"));
                helper.setRegion(fsRs.getString("REGION"));
                helper.setProject_name(fsRs.getString("PROJECT_NAME"));
                helper.setPractice(fsRs.getString("PRACTICE"));
                helper.setSub_practice(fsRs.getString("SUB_PRACTICE"));
                helper.setBu_portfolios(fsRs.getString("BU_PORTFOLIO")); 
                helper.setAmount(fsRs.getString("AMOUNT"));
                helper.setComment(fsRs.getString("COMMENTS"));
                helper.setHourly_rate(fsRs.getString("HOURLY_RATE"));
                helper.setHours(fsRs.getString("HOURS"));
                helper.setJob_role(fsRs.getString("JOB_ROLE"));
                helper.setLevel(fsRs.getString("LEVEL"));
                helper.setPo(fsRs.getString("PO")); 
                helper.setPrimaryskill(fsRs.getString("PRIMARY_SKILL"));
                helper.setResource_name(fsRs.getString("RESOURCE_NAME"));
                helper.setRole_end_date(fsRs.getString("ROLE_END_DATE"));
                helper.setRole_start_date(fsRs.getString("ROLE_START_DATE"));
                helper.setSow_id(fsRs.getString("SOW_ID"));
                helper.setTotal_contract_amount(fsRs.getString("TOTAL_CONTRACT_AMOUNT"));
                helper.setVgcrew_id(fsRs.getString("VG_CREW_ID"));
                helper.setLob(fsRs.getString("LOB"));
                helper.setDe(fsRs.getString("DE"));
                helper.setEm_name(fsRs.getString("EM"));
                helper.setVg_email(fsRs.getString("VG_EMAIL_ID"));
                helper.setCap_email(fsRs.getString("CAP_EMAIL_ID"));
                helper.setVdi_name(fsRs.getString("VDI_NAME"));
                helper.setCostcenter(fsRs.getString("GAD_COST_CENTER"));
                helper.setRegion_revised(fsRs.getString("REGION_REVISED"));
                helper.setGrade_revised(fsRs.getString("GRADE_REVISED"));
                helper.setProject_Code(fsRs.getString("PROJECT_CODE"));
                helper.setOdc_location(fsRs.getString("ODC_LOCATION"));
                helper.setExhibit_type(fsRs.getString("EXHIBIT TYPE"));
                helper.setResource_type(fsRs.getString("RESOURCE TYPE"));
                helper.setPayment_type(fsRs.getString("PAYMENT TYPE"));
                helper.setSow_start_date(fsRs.getString("SOW_START_DATE"));
                helper.setSow_end_date(fsRs.getString("SOW_END_DATE"));
                helper.setLocation(fsRs.getString("LOCATION"));
                helper.setSbu(fsRs.getString("SBU"));
                helper.setSow_name(fsRs.getString("SOW_NAME"));
                helper.setCap_manager(fsRs.getString("CG MANAGER"));
                
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

    // .....................................................NON FS........................................................
    public  static List<ReportHelper> readNonFSDataFromDatabase() throws SQLException{
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
            System.out.println(ReportUtil.NonFsquery);
			ResultSet rs = stmt.executeQuery(ReportUtil.NonFsquery);
			while(rs.next()){
				helper = new ReportHelper();
				helper.setGgid(rs.getString("EMP_ID"));
                helper.setProject_Code(rs.getString("PROJECT_CODE"));
                helper.setProject_name(rs.getString("PROJECT_NAME"));
                helper.setLevel(rs.getString("LEVEL"));
                helper.setPo(rs.getString("PO"));
                helper.setPrimaryskill(rs.getString("PRIMARY_SKILL"));
                helper.setResource_name(rs.getString("EMP_NAME"));
                helper.setAmount(rs.getString("AMOUNT"));
                helper.setComment(rs.getString("COMMENTS"));
                helper.setHourly_rate(rs.getString("HOURLY_RATE"));
                helper.setHours(rs.getString("HOURS"));
                helper.setJob_role(rs.getString("JOB_ROLE"));                
                helper.setRole_end_date(rs.getString("ROLE_END_DATE"));
                helper.setRole_start_date(rs.getString("ROLE_START_DATE"));
                helper.setTotal_contract_amount(rs.getString("TOTAL_CONTRACT_AMOUNT"));
                helper.setVgcrew_id(rs.getString("VG_CREW_ID"));                
                helper.setLob(rs.getString("LOB"));
                helper.setVendor(rs.getString("VENDOR"));
                helper.setEmpID(rs.getString("EMP_ID"));
                helper.setAccountName(rs.getString("ACCOUNT_NAME"));                
                helper.setRegion(rs.getString("REGION"));
                helper.setRegion_revised(rs.getString("REVISED_REGION"));
                helper.setVg_email(rs.getString("VG_EMAIL_ID"));
                helper.setVdi_name(rs.getString("VDI_NAME"));
                helper.setOdc_location(rs.getString("ODC_LOCATION"));
                helper.setLwd(rs.getString("LWD"));
                helper.setVg_location(rs.getString("VG LOCATION"));                
                helper.setVg_email(rs.getString("VG_EMAIL_ID"));
                helper.setCap_email(rs.getString("EMP_EMAIL_ID"));
                helper.setExhibit_type(rs.getString("EXHIBIT TYPE"));
                helper.setResource_type(rs.getString("RESOURCE TYPE"));
                helper.setPayment_type(rs.getString("PAYMENT TYPE"));
                helper.setSow_start_date(rs.getString("SOW_START_DATE"));
                helper.setSow_end_date(rs.getString("SOW_END_DATE"));                
                helper.setSow_name(rs.getString("SOW_NAME"));
                helper.setSow_id(rs.getString("SOW_ID"));

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
			style.setFillBackgroundColor(IndexedColors.ROSE.index); 
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
