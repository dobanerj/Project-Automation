package com.vg.resource.reportautomation.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;

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
		System.out.println("psql driver success!");
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
                helper.setPer_nr(rs.getDouble("per_nr"));
                helper.setLocal_grade(rs.getString("local_grade"));
                helper.setRegion(rs.getString("region"));
                helper.setProject_name(rs.getString("project_name"));
                helper.setPractice(rs.getString("practice"));
                helper.setSub_practice(rs.getString("sub_practice"));
                helper.setBu_portfolios(rs.getString("bu_portfolios"));

                helper.setAmount(rs.getString("amount"));
                helper.setComment(rs.getString("comment"));
                helper.setHourly_rate(rs.getString("hourly_rate"));
                helper.setHours(rs.getString("hours"));
                helper.setJob_role(rs.getString("job_role"));
                helper.setLevel(rs.getString("level"));
                helper.setPo(rs.getString("po"));

                helper.setPrimaryskill(rs.getString("primaryskill"));
                helper.setResource_name(rs.getString("resource_name"));
                helper.setRole_end_date(rs.getString("role_end_date"));
                helper.setRole_start_date(rs.getString("role_start_date"));
                helper.setSow_id(rs.getString("sow_id"));
                helper.setStatus(rs.getString("status"));
                helper.setTotal_contract_amount(rs.getString("total_contract_amount"));
                ((ReportHelper) helper).setVgcrew_id(rs.getDouble("vgcrew_id"));
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

public static Cell createRedCell(int cellNo,Row row,CellStyle style){			
			style.setFillBackgroundColor(IndexedColors.RED1.getIndex()); 
            style.setFillPattern(FillPatternType.DIAMONDS);               
            Cell cell=row.createCell(cellNo); 
            cell.setCellStyle(style);   
			return cell;
} 
public static Cell createBlueCell(int cellNo,Row row,CellStyle style){			
			style.setFillBackgroundColor(IndexedColors.BRIGHT_GREEN.getIndex());  
            style.setFillPattern(FillPatternType.DIAMONDS);               
            Cell cell=row.createCell(cellNo); 
            cell.setCellStyle(style);   
			return cell;
}
public static Cell createOrangeCell(int cellNo,Row row,CellStyle style){			
            style.setFillBackgroundColor(IndexedColors.GOLD.getIndex()); 
            style.setFillPattern(FillPatternType.DIAMONDS);               
            Cell cell=row.createCell(cellNo); 
            cell.setCellStyle(style);   
			return cell;
}
}
