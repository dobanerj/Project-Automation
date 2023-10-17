package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "VG_Gad_excel")
@Entity
public class VgGadExcelEntity {
	@Id
	private String ggid;
	private String li_lrId;
	private double perNr;
	private double mycposId;
	private String candidateId;
	private String region;
	private String FinRegion;
	private String firstName;
	private String middleName;
	private String lastname;
	private String NtloginId;
	private String globalDateJoining;
	private String localDateJoining;
	private String emailId;
	private String organization;
	private String costCenter;
	private String peoplegroup;
	private String personType;
	private String employeegroup;
	private String designation;
	private String location;
	private String baseLocation;
	private String aquisition;
	private String supervisor;
	private String supervisorFullName;
	private String supervisorEmailID;
	private String originalHireReason;
	private String practice;
	private String subPractice;
	private String globalGrade;
	private String localGrade;
	private String nearShore;
	private String countryTransferedTo;
	private String previousBusinessAera;
	private String peopleManagerID;
	private String peopleManagerName;
	private String deploymentModel;
	private String assignmentDuration;
	private String primarySkill;
	private String ultimateAccountName;
	private String accountName;
	private String projectPUName;
	private String projectName;
	private String projectStartDate;
	private String projectRolloffDate;
	private String Role;
	private String billability;
	private String positionID;
	private String allocationPercentage;
	private String lastTransactionDate;
	private String lastProjectCode;
	private String lastclientgroupname;
	private String benchstatusISW;
	private String skillGroup;
	private String bookingID;
	private String typeOfProject;
	private String futureAccountName;
	private String futureProjectCode;
	private String organizationBU;
	private String newBU;
	private String locationStandardization;
	private String buPortfolios;
	private String lastchangeMadeBy;
	private String lastchangedate;
	private String projectType;
	private String opportunityName;
	private String opportunityEndDate;
	private String bookingType;
	private String regionType;
	private String cgstartDate;
	private String groupaccountName;

	@OneToOne()
    @JoinColumn(name="ggid")
    private sourcingExcelEntity srcEnt;

	public VgGadExcelEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VgGadExcelEntity(String ggid, String li_lrId, double perNr, double mycposId, String candidateId,
			String region, String finRegion, String firstName, String middleName, String lastname, String ntloginId,
			String globalDateJoining, String localDateJoining, String emailId, String organization, String costCenter,
			String peoplegroup, String personType, String employeegroup, String designation, String location,
			String baseLocation, String aquisition, String supervisor, String supervisorFullName,
			String supervisorEmailID, String originalHireReason, String practice, String subPractice,
			String globalGrade, String localGrade, String nearShore, String countryTransferedTo,
			String previousBusinessAera, String peopleManagerID, String peopleManagerName, String deploymentModel,
			String assignmentDuration, String primarySkill, String ultimateAccountName, String accountName,
			String projectPUName, String projectName, String projectStartDate, String projectRolloffDate, String role,
			String billability, String positionID, String allocationPercentage, String lastTransactionDate,
			String lastProjectCode, String lastclientgroupname, String benchstatusISW, String skillGroup,
			String bookingID, String typeOfProject, String futureAccountName, String futureProjectCode,
			String organizationBU, String newBU, String locationStandardization, String buPortfolios,
			String lastchangeMadeBy, String lastchangedate, String projectType, String opportunityName,
			String opportunityEndDate, String bookingType, String regionType, String cgstartDate,
			String groupaccountName) {
		super();
		this.ggid = ggid;
		this.li_lrId = li_lrId;
		this.perNr = perNr;
		this.mycposId = mycposId;
		this.candidateId = candidateId;
		this.region = region;
		FinRegion = finRegion;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastname = lastname;
		NtloginId = ntloginId;
		this.globalDateJoining = globalDateJoining;
		this.localDateJoining = localDateJoining;
		this.emailId = emailId;
		this.organization = organization;
		this.costCenter = costCenter;
		this.peoplegroup = peoplegroup;
		this.personType = personType;
		this.employeegroup = employeegroup;
		this.designation = designation;
		this.location = location;
		this.baseLocation = baseLocation;
		this.aquisition = aquisition;
		this.supervisor = supervisor;
		this.supervisorFullName = supervisorFullName;
		this.supervisorEmailID = supervisorEmailID;
		this.originalHireReason = originalHireReason;
		this.practice = practice;
		this.subPractice = subPractice;
		this.globalGrade = globalGrade;
		this.localGrade = localGrade;
		this.nearShore = nearShore;
		this.countryTransferedTo = countryTransferedTo;
		this.previousBusinessAera = previousBusinessAera;
		this.peopleManagerID = peopleManagerID;
		this.peopleManagerName = peopleManagerName;
		this.deploymentModel = deploymentModel;
		this.assignmentDuration = assignmentDuration;
		this.primarySkill = primarySkill;
		this.ultimateAccountName = ultimateAccountName;
		this.accountName = accountName;
		this.projectPUName = projectPUName;
		this.projectName = projectName;
		this.projectStartDate = projectStartDate;
		this.projectRolloffDate = projectRolloffDate;
		Role = role;
		this.billability = billability;
		this.positionID = positionID;
		this.allocationPercentage = allocationPercentage;
		this.lastTransactionDate = lastTransactionDate;
		this.lastProjectCode = lastProjectCode;
		this.lastclientgroupname = lastclientgroupname;
		this.benchstatusISW = benchstatusISW;
		this.skillGroup = skillGroup;
		this.bookingID = bookingID;
		this.typeOfProject = typeOfProject;
		this.futureAccountName = futureAccountName;
		this.futureProjectCode = futureProjectCode;
		this.organizationBU = organizationBU;
		this.newBU = newBU;
		this.locationStandardization = locationStandardization;
		this.buPortfolios = buPortfolios;
		this.lastchangeMadeBy = lastchangeMadeBy;
		this.lastchangedate = lastchangedate;
		this.projectType = projectType;
		this.opportunityName = opportunityName;
		this.opportunityEndDate = opportunityEndDate;
		this.bookingType = bookingType;
		this.regionType = regionType;
		this.cgstartDate = cgstartDate;
		this.groupaccountName = groupaccountName;
	}
	public String getGgid() {
		return ggid;
	}
	public void setGgid(String ggid) {
		this.ggid = ggid;
	}
	public String getLi_lrId() {
		return li_lrId;
	}
	public void setLi_lrId(String li_lrId) {
		this.li_lrId = li_lrId;
	}
	public double getPerNr() {
		return perNr;
	}
	public void setPerNr(double perNr) {
		this.perNr = perNr;
	}
	public double getMycposId() {
		return mycposId;
	}
	public void setMycposId(double mycposId) {
		this.mycposId = mycposId;
	}
	public String getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(String candidateId) {
		this.candidateId = candidateId;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getFinRegion() {
		return FinRegion;
	}
	public void setFinRegion(String finRegion) {
		FinRegion = finRegion;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getNtloginId() {
		return NtloginId;
	}
	public void setNtloginId(String ntloginId) {
		NtloginId = ntloginId;
	}
	public String getGlobalDateJoining() {
		return globalDateJoining;
	}
	public void setGlobalDateJoining(String globalDateJoining) {
		this.globalDateJoining = globalDateJoining;
	}
	public String getLocalDateJoining() {
		return localDateJoining;
	}
	public void setLocalDateJoining(String localDateJoining) {
		this.localDateJoining = localDateJoining;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	public String getCostCenter() {
		return costCenter;
	}
	public void setCostCenter(String costCenter) {
		this.costCenter = costCenter;
	}
	public String getPeoplegroup() {
		return peoplegroup;
	}
	public void setPeoplegroup(String peoplegroup) {
		this.peoplegroup = peoplegroup;
	}
	public String getPersonType() {
		return personType;
	}
	public void setPersonType(String personType) {
		this.personType = personType;
	}
	public String getEmployeegroup() {
		return employeegroup;
	}
	public void setEmployeegroup(String employeegroup) {
		this.employeegroup = employeegroup;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getBaseLocation() {
		return baseLocation;
	}
	public void setBaseLocation(String baseLocation) {
		this.baseLocation = baseLocation;
	}
	public String getAquisition() {
		return aquisition;
	}
	public void setAquisition(String aquisition) {
		this.aquisition = aquisition;
	}
	public String getSupervisor() {
		return supervisor;
	}
	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}
	public String getSupervisorFullName() {
		return supervisorFullName;
	}
	public void setSupervisorFullName(String supervisorFullName) {
		this.supervisorFullName = supervisorFullName;
	}
	public String getSupervisorEmailID() {
		return supervisorEmailID;
	}
	public void setSupervisorEmailID(String supervisorEmailID) {
		this.supervisorEmailID = supervisorEmailID;
	}
	public String getOriginalHireReason() {
		return originalHireReason;
	}
	public void setOriginalHireReason(String originalHireReason) {
		this.originalHireReason = originalHireReason;
	}
	public String getPractice() {
		return practice;
	}
	public void setPractice(String practice) {
		this.practice = practice;
	}
	public String getSubPractice() {
		return subPractice;
	}
	public void setSubPractice(String subPractice) {
		this.subPractice = subPractice;
	}
	public String getGlobalGrade() {
		return globalGrade;
	}
	public void setGlobalGrade(String globalGrade) {
		this.globalGrade = globalGrade;
	}
	public String getLocalGrade() {
		return localGrade;
	}
	public void setLocalGrade(String localGrade) {
		this.localGrade = localGrade;
	}
	public String getNearShore() {
		return nearShore;
	}
	public void setNearShore(String nearShore) {
		this.nearShore = nearShore;
	}
	public String getCountryTransferedTo() {
		return countryTransferedTo;
	}
	public void setCountryTransferedTo(String countryTransferedTo) {
		this.countryTransferedTo = countryTransferedTo;
	}
	public String getPreviousBusinessAera() {
		return previousBusinessAera;
	}
	public void setPreviousBusinessAera(String previousBusinessAera) {
		this.previousBusinessAera = previousBusinessAera;
	}
	public String getPeopleManagerID() {
		return peopleManagerID;
	}
	public void setPeopleManagerID(String peopleManagerID) {
		this.peopleManagerID = peopleManagerID;
	}
	public String getPeopleManagerName() {
		return peopleManagerName;
	}
	public void setPeopleManagerName(String peopleManagerName) {
		this.peopleManagerName = peopleManagerName;
	}
	public String getDeploymentModel() {
		return deploymentModel;
	}
	public void setDeploymentModel(String deploymentModel) {
		this.deploymentModel = deploymentModel;
	}
	public String getAssignmentDuration() {
		return assignmentDuration;
	}
	public void setAssignmentDuration(String assignmentDuration) {
		this.assignmentDuration = assignmentDuration;
	}
	public String getPrimarySkill() {
		return primarySkill;
	}
	public void setPrimarySkill(String primarySkill) {
		this.primarySkill = primarySkill;
	}
	public String getUltimateAccountName() {
		return ultimateAccountName;
	}
	public void setUltimateAccountName(String ultimateAccountName) {
		this.ultimateAccountName = ultimateAccountName;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getProjectPUName() {
		return projectPUName;
	}
	public void setProjectPUName(String projectPUName) {
		this.projectPUName = projectPUName;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectStartDate() {
		return projectStartDate;
	}
	public void setProjectStartDate(String projectStartDate) {
		this.projectStartDate = projectStartDate;
	}
	public String getProjectRolloffDate() {
		return projectRolloffDate;
	}
	public void setProjectRolloffDate(String projectRolloffDate) {
		this.projectRolloffDate = projectRolloffDate;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	public String getBillability() {
		return billability;
	}
	public void setBillability(String billability) {
		this.billability = billability;
	}
	public String getPositionID() {
		return positionID;
	}
	public void setPositionID(String positionID) {
		this.positionID = positionID;
	}
	public String getAllocationPercentage() {
		return allocationPercentage;
	}
	public void setAllocationPercentage(String allocationPercentage) {
		this.allocationPercentage = allocationPercentage;
	}
	public String getLastTransactionDate() {
		return lastTransactionDate;
	}
	public void setLastTransactionDate(String lastTransactionDate) {
		this.lastTransactionDate = lastTransactionDate;
	}
	public String getLastProjectCode() {
		return lastProjectCode;
	}
	public void setLastProjectCode(String lastProjectCode) {
		this.lastProjectCode = lastProjectCode;
	}
	public String getLastclientgroupname() {
		return lastclientgroupname;
	}
	public void setLastclientgroupname(String lastclientgroupname) {
		this.lastclientgroupname = lastclientgroupname;
	}
	public String getBenchstatusISW() {
		return benchstatusISW;
	}
	public void setBenchstatusISW(String benchstatusISW) {
		this.benchstatusISW = benchstatusISW;
	}
	public String getSkillGroup() {
		return skillGroup;
	}
	public void setSkillGroup(String skillGroup) {
		this.skillGroup = skillGroup;
	}
	public String getBookingID() {
		return bookingID;
	}
	public void setBookingID(String bookingID) {
		this.bookingID = bookingID;
	}
	public String getTypeOfProject() {
		return typeOfProject;
	}
	public void setTypeOfProject(String typeOfProject) {
		this.typeOfProject = typeOfProject;
	}
	public String getFutureAccountName() {
		return futureAccountName;
	}
	public void setFutureAccountName(String futureAccountName) {
		this.futureAccountName = futureAccountName;
	}
	public String getFutureProjectCode() {
		return futureProjectCode;
	}
	public void setFutureProjectCode(String futureProjectCode) {
		this.futureProjectCode = futureProjectCode;
	}
	public String getOrganizationBU() {
		return organizationBU;
	}
	public void setOrganizationBU(String organizationBU) {
		this.organizationBU = organizationBU;
	}
	public String getNewBU() {
		return newBU;
	}
	public void setNewBU(String newBU) {
		this.newBU = newBU;
	}
	public String getLocationStandardization() {
		return locationStandardization;
	}
	public void setLocationStandardization(String locationStandardization) {
		this.locationStandardization = locationStandardization;
	}
	public String getBuPortfolios() {
		return buPortfolios;
	}
	public void setBuPortfolios(String buPortfolios) {
		this.buPortfolios = buPortfolios;
	}
	public String getLastchangeMadeBy() {
		return lastchangeMadeBy;
	}
	public void setLastchangeMadeBy(String lastchangeMadeBy) {
		this.lastchangeMadeBy = lastchangeMadeBy;
	}
	public String getLastchangedate() {
		return lastchangedate;
	}
	public void setLastchangedate(String lastchangedate) {
		this.lastchangedate = lastchangedate;
	}
	public String getProjectType() {
		return projectType;
	}
	public void setProjectType(String projectType) {
		this.projectType = projectType;
	}
	public String getOpportunityName() {
		return opportunityName;
	}
	public void setOpportunityName(String opportunityName) {
		this.opportunityName = opportunityName;
	}
	public String getOpportunityEndDate() {
		return opportunityEndDate;
	}
	public void setOpportunityEndDate(String opportunityEndDate) {
		this.opportunityEndDate = opportunityEndDate;
	}
	public String getBookingType() {
		return bookingType;
	}
	public void setBookingType(String bookingType) {
		this.bookingType = bookingType;
	}
	public String getRegionType() {
		return regionType;
	}
	public void setRegionType(String regionType) {
		this.regionType = regionType;
	}
	public String getCgstartDate() {
		return cgstartDate;
	}
	public void setCgstartDate(String cgstartDate) {
		this.cgstartDate = cgstartDate;
	}
	public String getGroupaccountName() {
		return groupaccountName;
	}
	public void setGroupaccountName(String groupaccountName) {
		this.groupaccountName = groupaccountName;
	}
	
	
}
