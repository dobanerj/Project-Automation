package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Vg_ODC_Report")
@Entity
public class vgreportodcEntity {
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
	
	public vgreportodcEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public vgreportodcEntity(String ggid, String vendor, String id, String resource_name, String cg_email_id,
			String vg_email_id, String vdi_name, String odc_location, String status, String lwd, String comments) {
		super();
		this.ggid = ggid;
		this.vendor = vendor;
		this.id = id;
		this.resource_name = resource_name;
		this.cg_email_id = cg_email_id;
		this.vg_email_id = vg_email_id;
		this.vdi_name = vdi_name;
		this.odc_location = odc_location;
		this.status = status;
		this.lwd = lwd;
		this.comments = comments;
	}
	public String getGgid() {
		return ggid;
	}
	public void setGgid(String ggid) {
		this.ggid = ggid;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getResource_name() {
		return resource_name;
	}
	public void setResource_name(String resource_name) {
		this.resource_name = resource_name;
	}
	public String getCg_email_id() {
		return cg_email_id;
	}
	public void setCg_email_id(String cg_email_id) {
		this.cg_email_id = cg_email_id;
	}
	public String getVg_email_id() {
		return vg_email_id;
	}
	public void setVg_email_id(String vg_email_id) {
		this.vg_email_id = vg_email_id;
	}
	public String getVdi_name() {
		return vdi_name;
	}
	public void setVdi_name(String vdi_name) {
		this.vdi_name = vdi_name;
	}
	public String getOdc_location() {
		return odc_location;
	}
	public void setOdc_location(String odc_location) {
		this.odc_location = odc_location;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getLwd() {
		return lwd;
	}
	public void setLwd(String lwd) {
		this.lwd = lwd;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
}
