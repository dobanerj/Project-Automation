package com.vg.resource.reportautomation.entity;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Table(name = "vg_sourcing")
@Entity
public class VGSourceEntity {
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
