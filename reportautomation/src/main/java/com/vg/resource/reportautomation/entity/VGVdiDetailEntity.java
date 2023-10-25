package com.vg.resource.reportautomation.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Table(name = "VG_VDI_Detail")
@Entity
public class VGVdiDetailEntity {
	
	@Id
	private String gGId;
	private String vendor;
	private String id;
	private String resourceName;
	private String cgEmailId;
	private String vgEmailId;
	private String vdiName;
	private String odcLocation;
	private String status;
	private String lwd;
	private String comments;
		
}
