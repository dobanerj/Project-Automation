package com.excel.demo.project.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name = "VG_SOURCE")
public class SourceData {
	
	
    @Id
	@Column(name = "GGID")
	private double gGId;
	
	@Column(name = "VGID")
	private double vGCrewId;
	
	@Column(name = "SOWID")
	private String sowId;
	
	@Column(name = "RESOURCE_NAME")
	private String resourceName;
	
	@Column(name = "LEVEL")
	private String level;
	
	@Column(name = "JOBROLE")
	private String jobRole;
	
	@Column(name = "SKILL")
	private String skill;
	
	@Column(name = "PO")
	private String po;

	@Column(name = "COMMENT")
	private String comment;
	
	@Column(name = "HOURS")
	private String hours;
	
	@Column(name = "HOURLY_RATE")
	private String hourlyRate;
	
	@Column(name = "AMOUNT")
	private String amount;
	
	@Column(name = "CONTRACT_AMOUNT")
	private String totalContractAmount;
	
	@Column(name = "ROLE_STRTDT")
	private String roleStartDate;
	
	@Column(name = "ROLE_ENDDT")
	private String roleEndDate;
	
	@Column(name = "LOCATION")
	private String location;

	  
}
