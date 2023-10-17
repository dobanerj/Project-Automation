package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "vg_sourcing")
@Entity
public class sourcingExcelEntity {
	@Id
	private String gGId;
	private double vGCrewId;
	private String resourceName;
	private String level;
	private String jobRole;
	private String primaryskill;
	private String po;
	private String sowId;
	private String hours;
	private String hourlyRate;
	private String amount;
	private String roleStartDate;
	private String roleEndDate;
	private String totalContractAmount;
	private String comment;
	private String status;	

	public sourcingExcelEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public sourcingExcelEntity(String gGId, double vGCrewId, String resourceName, String level, String jobRole,
			String primaryskill, String po, String sowId, String hours, String hourlyRate, String amount,
			String roleStartDate, String roleEndDate, String totalContractAmount, String comment, String status) {
		super();
		this.gGId = gGId;
		this.vGCrewId = vGCrewId;
		this.resourceName = resourceName;
		this.level = level;
		this.jobRole = jobRole;
		this.primaryskill = primaryskill;
		this.po = po;
		this.sowId = sowId;
		this.hours = hours;
		this.hourlyRate = hourlyRate;
		this.amount = amount;
		this.roleStartDate = roleStartDate;
		this.roleEndDate = roleEndDate;
		this.totalContractAmount = totalContractAmount;
		this.comment = comment;
		this.status = status;
	}
	public String getgGId() {
		return gGId;
	}
	public void setgGId(String gGId) {
		this.gGId = gGId;
	}
	public double getvGCrewId() {
		return vGCrewId;
	}
	public void setvGCrewId(double vGCrewId) {
		this.vGCrewId = vGCrewId;
	}
	public String getResourceName() {
		return resourceName;
	}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getJobRole() {
		return jobRole;
	}
	public void setJobRole(String jobRole) {
		this.jobRole = jobRole;
	}
	public String getPrimaryskill() {
		return primaryskill;
	}
	public void setPrimaryskill(String primaryskill) {
		this.primaryskill = primaryskill;
	}
	public String getPo() {
		return po;
	}
	public void setPo(String po) {
		this.po = po;
	}
	public String getSowId() {
		return sowId;
	}
	public void setSowId(String sowId) {
		this.sowId = sowId;
	}
	public String getHours() {
		return hours;
	}
	public void setHours(String hours) {
		this.hours = hours;
	}
	public String getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(String hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getRoleStartDate() {
		return roleStartDate;
	}
	public void setRoleStartDate(String roleStartDate) {
		this.roleStartDate = roleStartDate;
	}
	public String getRoleEndDate() {
		return roleEndDate;
	}
	public void setRoleEndDate(String roleEndDate) {
		this.roleEndDate = roleEndDate;
	}
	public String getTotalContractAmount() {
		return totalContractAmount;
	}
	public void setTotalContractAmount(String totalContractAmount) {
		this.totalContractAmount = totalContractAmount;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	

}
