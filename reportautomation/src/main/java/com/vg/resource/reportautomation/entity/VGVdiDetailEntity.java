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
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="\"Vendor\"")
	private Integer serialNo;
	@Column(name="\"VDI_GGID\"" ,unique=true)
	private Integer vdi_ggid;	
	@Column(name="\"CREWID\"")
	private String id;
	@Column(name="\"Resource_Name\"")
	private String resource_name;
	@Column(name="\"CG_Email_Id\"")
	private String cg_email_id;
	@Column(name="\"VG_Email_Id\"")
	private String vg_email_id;
	@Column(name="\"VDI_Name\"")
	private String vdi_name;
	@Column(name="\"ODC_Location\"")
	private String odc_location;
	@Column(name="\"Status\"")
	private String status;
	@Column(name="\"LWD\"")
	private Date lwd;
	@Column(name="\"Comments\"")
	private String comments;
	
	
}
