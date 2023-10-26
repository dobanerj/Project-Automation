package com.vg.resource.reportautomation.entity;

import java.io.Serializable;

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
	private Integer serialNo;
	@Column(name="\"VDI_GGID\"" ,unique=true)
	private Integer vdi_ggid;	
	@Column(name="\"CREWID\"")
	private String id;
	private String resource_name;
	private String cg_email_id;
	private String vg_email_id;
	private String vdi_name;
	private String odc_location;
	private String status;
	private String lwd;
	private String comments;
	
	
}
