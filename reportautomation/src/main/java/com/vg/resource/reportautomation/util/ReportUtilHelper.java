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
			ResultSet Fsrs = stmt.executeQuery(ReportUtil.FSquery);
			while(Fsrs.next()){
				helper = new ReportHelper();
				helper.setGgid(Fsrs.getString("GGID"));
                helper.setLi_lr_id(Fsrs.getString("LI_LR_ID"));
                //helper.setPer_nr(rs.getDouble("PERNR"));
                helper.setLocal_grade(Fsrs.getString("LOCAL_GRADE"));
                helper.setRegion(Fsrs.getString("REGION"));
                helper.setProject_name(Fsrs.getString("PROJECT_NAME"));
                helper.setPractice(Fsrs.getString("PRACTICE"));
                helper.setSub_practice(Fsrs.getString("SUB_PRACTICE"));
                helper.setBu_portfolios(Fsrs.getString("BU_PORTFOLIO")); 
                helper.setAmount(Fsrs.getString("AMOUNT"));
                helper.setComment(Fsrs.getString("COMMENTS"));
                helper.setHourly_rate(Fsrs.getString("HOURLY_RATE"));
                helper.setHours(Fsrs.getString("HOURS"));
                helper.setJob_role(Fsrs.getString("JOB_ROLE"));
                helper.setLevel(Fsrs.getString("LEVEL"));
                helper.setPo(Fsrs.getString("PO")); 
                helper.setPrimaryskill(Fsrs.getString("PRIMARY_SKILL"));
                helper.setResource_name(Fsrs.getString("RESOURCE_NAME"));
                helper.setRole_end_date(Fsrs.getString("ROLE_END_DATE"));
                helper.setRole_start_date(Fsrs.getString("ROLE_START_DATE"));
                helper.setSow_id(Fsrs.getString("SOW_ID"));
                helper.setStatus(Fsrs.getString("CURRENT_STATUS"));
                helper.setTotal_contract_amount(Fsrs.getString("TOTAL_CONTRACT_AMOUNT"));
                helper.setVgcrew_id(Fsrs.getDouble("VG_CREW_ID"));
                helper.setLob(Fsrs.getString("LOB"));
                helper.setDe(Fsrs.getString("DE"));
                helper.setEm_name(Fsrs.getString("EM"));
                helper.setVg_email(Fsrs.getString("VG_EMAIL_ID"));
                helper.setCap_email(Fsrs.getString("CAP_EMAIL_ID"));
                helper.setVdi_name(Fsrs.getString("VDI_NAME"));
                helper.setCostcenter(Fsrs.getString("GAD_COST_CENTER"));
                helper.setRegion_revised(Fsrs.getString("REGION_REVISED"));
                helper.setGrade_revised(Fsrs.getString("GRADE_REVISED"));
                helper.setProject_Code(Fsrs.getString("PROJECT_CODE"));
                helper.setOdc_location(Fsrs.getString("ODC_LOCATION"));
                helper.setExhibit_type(Fsrs.getString("EXHIBIT TYPE"));
                helper.setResource_type(Fsrs.getString("RESOURCE TYPE"));
                helper.setPayment_type(Fsrs.getString("PAYMENT TYPE"));
                helper.setSow_start_date(Fsrs.getString("SOW_START_DATE"));
                helper.setSow_end_date(Fsrs.getString("SOW_END_DATE"));
                helper.setLocation(Fsrs.getString("LOCATION"));
                helper.setSbu(Fsrs.getString("SBU"));
                helper.setSow_name(Fsrs.getString("SOW_NAME"));
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
				helper.setGgid(rs.getString("GGID"));
                helper.setLi_lr_id(rs.getString("LI_LR_ID"));
                helper.setGrade_revised(rs.getString("GRADE_REVISED"));
                helper.setLocal_grade(rs.getString("LOCAL_GRADE"));
                helper.setRegion(rs.getString("REGION"));
                helper.setProject_Code(rs.getString("PROJECT_CODE"));
                helper.setProject_name(rs.getString("PROJECT_NAME"));
                helper.setPractice(rs.getString("PRACTICE"));
                helper.setSub_practice(rs.getString("SUB_PRACTICE"));
                helper.setLocation(rs.getString("LOCATION"));
                //helper.setBu_portfolios(rs.getString("BU_PORTFOLIO"));
                helper.setSbu(rs.getString("SBU"));
                helper.setLob(rs.getString("LOB"));
                helper.setDe(rs.getString("DE"));
                helper.setEm_name(rs.getString("EM"));
                //helper.setEndDateR2D2(rs.getString("END DATE R2D2"));
                helper.setVendor(rs.getString("VENDOR"));
                helper.setEmpID(rs.getString("EMP_ID"));
                helper.setMonth(rs.getString("MONTH"));
                helper.setAccountName(rs.getString("ACCOUNT_NAME"));
                helper.setRevisedRegion(rs.getString("REVISED_REGION"));
                helper.setVg_email(rs.getString("VG_EMAIL_ID"));
                helper.setVdi_name(rs.getString("VDI_NAME"));
                helper.setOdc_location(rs.getString("ODC_LOCATION"));
                helper.setLwd(rs.getString("LWD"));
                helper.setGadCostCenter(rs.getString("GAD_COST_CENTER"));
                helper.setCurrentStatus(rs.getString("CURRENT_STATUS"));

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
