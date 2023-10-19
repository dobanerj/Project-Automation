package com.vg.resource.reportautomation.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Table(name = "VG_VDI_DETAIL")
@Entity
public class VGVdiDetailEntity {
	@Id
	private String ggid;
	private String vendor;
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
