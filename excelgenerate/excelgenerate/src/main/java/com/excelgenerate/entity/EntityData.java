package com.excelgenerate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vg_source")
public class EntityData {
	
	    @Id
		@Column(name = "ggid")
		private int gGId;
		
		@Column(name = "vgid")
		private double vGCrewId;
		
		@Column(name = "resource_name")
		private String resourceName;

		@Column(name = "level")
		private String level;
		
		@Column(name = "jobrole")
		private String jobRole;
		
		@Column(name = "skill")
		private String skill;
		
		@Column(name = "po")
		private String po;
		
		@Column(name = "sowid")
		private String sowId;
		
		@Column(name = "hours")
		private String hours;
		
		@Column(name = "hourly_rate")
		private String hourlyRate;
		
		@Column(name = "amount")
		private String amount;
		
		@Column(name = "role_strtdt")
		private String roleStartDate;
		
		@Column(name = "role_enddt")
		private String roleEndDate;
		
		@Column(name = "contract_amount")
		private String totalContractAmount;

		@Column(name = "comment")
		private String comment;
		
		@Column(name = "status")
		private String status;

		public EntityData(int gGId, double vGCrewId, String resourceName, String level, String jobRole, String skill,
				String po, String sowId, String hours, String hourlyRate, String amount, String roleStartDate,
				String roleEndDate, String totalContractAmount, String comment, String status) {
			super();
			this.gGId = gGId;
			this.vGCrewId = vGCrewId;
			this.resourceName = resourceName;
			this.level = level;
			this.jobRole = jobRole;
			this.skill = skill;
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

		public EntityData() {
			super();
		}

		public int getgGId() {
			return gGId;
		}

		public void setgGId(int gGId) {
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

		public String getSkill() {
			return skill;
		}

		public void setSkill(String skill) {
			this.skill = skill;
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
