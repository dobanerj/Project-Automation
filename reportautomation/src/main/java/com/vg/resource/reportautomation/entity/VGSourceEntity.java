package com.vg.resource.reportautomation.entity;



import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

import lombok.Data;
@Data
@Table(name = "\"VG_SOURCE\"")
@Entity
public class VGSourceEntity implements Serializable{
	@Id
	@Column(name="\"GGID\"")
	private String gGId;
	@Column(name="\"VG_CREW_ID\"")
	private String vGCrewId;
	@Column(name="\"RESOURCE_NAME\"")
	private String resourceName;
	@Column(name="\"LEVEL\"")
	private String level;
	@Column(name="\"JOB_ROLE\"")
	private String jobRole;
	@Column(name="\"PRIMARY_SKILL\"")
	private String primaryskill;
	@Column(name="\"PO\"")
	private String po;
	@Column(name="\"SOW_ID\"")
	private Integer sowId;
	@Column(name="\"HOURS\"")
	private String hours;
	@Column(name="\"HOURLY_RATE\"")
	private String hourlyRate;
	@Column(name="\"AMOUNT\"")
	private String amount;
	@Column(name="\"ROLE_START_DATE\"")
	private String roleStartDate;
	@Column(name="\"ROLE_END_DATE\"")
	private String roleEndDate;
	@Column(name="\"TOTAL_CONTRACT_AMOUNT\"")
	private String totalContractAmount;
	@Column(name="\"COMMENTS\"")
	private String comment;
	@Column(name="\"STATUS\"")
	private String status;
	@Column(name="\"EXHIBIT TYPE\"")
	private String exhibit_type;
	@Column(name="\"RESOURCE TYPE\"")
	private String resourc_type;
	@Column(name="\"PAYMENT TYPE\"")
    private String paymentType;
	@Column(name="\"SOW_START_DATE\"")
	private String sowStartDate;
	@Column(name="\"SOW_END_DATE\"")
	private String sowEndDate;
	@Column(name="\"VG LOCATION\"")
	private String locationVg;
}
