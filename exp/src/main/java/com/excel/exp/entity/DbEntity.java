package com.excel.exp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "source_data")
public class DbEntity {
    @Id
    @Column(name = "sr_No")
    private int sr_No;
    private Long crew_Id;
    
//    private int srNo;

	private String resource_name;
	private String vg_email;
	public DbEntity(int sr_No, Long crew_Id, String resource_name, String vg_email) {
		super();
		this.sr_No = sr_No;
		this.crew_Id = crew_Id;
		this.resource_name = resource_name;
		this.vg_email = vg_email;
	}
	
	public DbEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSr_No() {
		return sr_No;
	}
	public void setSr_No(int sr_No) {
		this.sr_No = sr_No;
	}
	public Long getCrew_Id() {
		return crew_Id;
	}
	public void setCrew_Id(Long crew_Id) {
		this.crew_Id = crew_Id;
	}
	public String getResource_name() {
		return resource_name;
	}
	public void setResource_name(String resource_name) {
		this.resource_name = resource_name;
	}
	public String getVg_email() {
		return vg_email;
	}
	public void setVg_email(String vg_email) {
		this.vg_email = vg_email;
	}
	
	
	
	

}