package com.vg.resource.reportautomation.entity;



import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Table(name = "\"VG_SOURCE\"")
@Entity
public class VGSourceEntity implements Serializable{
	@Id
	@Column(name="\"GGID\"")
	private String gGId;
	@Column(name="\"VG_CREW_ID\"")
	private double vGCrewId;
	@Column(name="\"Resource_Name\"")
	private String resourceName;
	@Column(name="\"Level\"")
	private String level;
	@Column(name="\"Job_Role\"")
	private String jobRole;
	@Column(name="\"Primary_Skill\"")
	private String primaryskill;
	@Column(name="\"PO#\"")
	private String po;
	@Column(name="\"SOW_ID\"")
	private String sowId;
	@Column(name="\"Hours\"")
	private String hours;
	@Column(name="\"Hourly_Rate\"")
	private String hourlyRate;
	@Column(name="\"Amount\"")
	private String amount;
	@Column(name="\"Role_Start_Date\"")
	private String roleStartDate;
	@Column(name="\"Role_End_Date\"")
	private String roleEndDate;
	@Column(name="\"Total_Contract_Amount\"")
	private String totalContractAmount;
	@Column(name="\"Comments\"")
	private String comment;
	@Column(name="\"Status\"")
	private String status;
}
