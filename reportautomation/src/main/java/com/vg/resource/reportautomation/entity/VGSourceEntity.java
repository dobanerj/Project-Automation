package com.vg.resource.reportautomation.entity;



import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Table(name = "\"VG_SOURCE\"")
@Entity
public class VGSourceEntity implements Serializable{
	@Id
	private String gGId;
	private double vGCrewId;
	private String resourceName;
	private String level;
	private String jobRole;
	private String primaryskill;
	private String po;
	private String sowId;
	private String hours;
	private String hourlyRate;
	private String amount;
	private String roleStartDate;
	private String roleEndDate;
	private String totalContractAmount;
	private String comment;
	private String status;
}
