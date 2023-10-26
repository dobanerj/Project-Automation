package com.vg.resource.reportautomation.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;


@Table(name = "NoFsData")
@Entity
@Data
public class VGNonFSEntity {
	
	@Id
	private int empID;
	private String month;
	private String accountName;
	private String lob;
	private String empName;
	private String empEmailId;
	private String empUserID;
	private String designation;
	private String projectcode ;
	private String projectname;
	private Date startDate;
	private Date endDate;
	private String region;
	private String location;
	private String revisedRegion;
	private String comment;
	private String lbs;
	
}
