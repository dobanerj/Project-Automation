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
	@Column(name="\"VG_CREW_ID\"" ,unique=false)
	private String vg_crew_id;	
	@Column(name="\"VDI_GGID\"")
	private String vdi_ggid;	
	@Column(name="\"RESOURCE_NAME\"")
	private String resource_name;
	@Column(name="\"VG_EMAIL_ID\"")
	private String vg_email_id;
	@Column(name="\"VDI_NAME\"")
	private String vdi_name;
	@Column(name="\"ODC_LOCATION\"")
	private String odc_location;
	@Column(name="\"STATUS\"")
	private String status;
	@Column(name="\"LWD\"")
	private String lwd;
	
	
}
