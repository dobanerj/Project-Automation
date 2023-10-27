package com.vg.resource.reportautomation.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
@Data
@Table(name = "\"VG_VDI_DETAIL\"")
@Entity
public class VGVdiDetailEntity implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="\"VENDOR\"")
	private Integer serialNo;
	@Column(name="\"VDI_GGID\"" ,unique=true)
	private String vdi_ggid;	
	@Column(name="\"CREWID\"")
	private String id;
	@Column(name="\"RESOURCE_NAME\"")
	private String resource_name;
	@Column(name="\"CG_EMAIL_ID\"")
	private String cg_email_id;
	@Column(name="\"VG_EMAIL_ID\"")
	private String vg_email_id;
	@Column(name="\"VDI_NAME\"")
	private String vdi_name;
	@Column(name="\"ODC_LOCATION\"")
	private String odc_location;
	@Column(name="\"STATUS\"")
	private String status;
	@Column(name="\"LWD\"")
	private Date lwd;
	@Column(name="\"COMMENTS\"")
	private String comments;
	
	
}
