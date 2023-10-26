package com.vg.resource.reportautomation.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Table(name = "\"VG_NON_FS_MASTER_DATA\"")
@Entity
@Data
public class VGNonFSEntity implements Serializable{
	
	@Id
	@Column(name="\"Emp_Id\"")
	private int empID;
	@Column(name="\"Month\"")
	private String month;
	@Column(name="\"Account_Name\"")
	private String accountName;
	@Column(name="\"LOB\"")
	private String lob;
	@Column(name="\"Emp_Name\"")
	private String empName;
	@Column(name="\"Emp_Email_Id\"")
	private String empEmailId;
	@Column(name="\"Emp_User_Id\"")
	private String empUserID;
	@Column(name="\"Designation\"")
	private String designation;
	@Column(name="\"Project_Code\"")
	private String projectcode ;
	@Column(name="\"Project_Name\"")
	private String projectname;
	@Column(name="\"Start_Date\"")
	private Date startDate;
	@Column(name="\"End_Date\"")
	private Date endDate;
	@Column(name="\"Region\"")
	private String region;
	@Column(name="\"Location\"")
	private String location;
	@Column(name="\"Revised_Region\"")
	private String revisedRegion;
	@Column(name="\"IBS\"")
	private String lbs;
	
}
