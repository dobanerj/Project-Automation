package com.vg.resource.reportautomation.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Table(name = "\"VG_GAD_DATA\"")
@Entity
public class vgGadEntity {
	@Id
	@Column(name="\"GGID\"")
	private String ggid;
	@Column(name="\"LI_LR_ID\"")
	private String li_lrId;
	@Column(name="\"PERNR\"")
	private double perNr;
	@Column(name="\"MYC_POST_ID\"")
	private double mycposId;
	@Column(name="\"CANDIDATE_ID\"")
	private String candidateId;
	@Column(name="\"REGION\"")
	private String region;
	@Column(name="\"FIN_REGION\"")
	private String FinRegion;
	@Column(name="\"FIRST_NAME\"")
	private String firstName;
	@Column(name="\"MIDDLE_NAME\"")
	private String middleName;
	@Column(name="\"LAST_NAME\"")
	private String lastname;
	@Column(name="\"NT_LOGIN_ID\"")
	private String NtloginId;
	@Column(name="\"GLOBAL_DATE_JOINING\"")
	private String globalDateJoining;
	@Column(name="\"LOCAL_DATE_JOINING\"")
	private String localDateJoining;
	@Column(name="\"EMAIL_ID\"")
	private String emailId;
	@Column(name="\"ORGANIZATION\"")
	private String organization;
	@Column(name="\"COST_CENTER\"")
	private String costCenter;
	@Column(name="\"PEOPLE_GROUP\"")
	private String peoplegroup;
	@Column(name="\"PERSON_TYPE\"")
	private String personType;
	@Column(name="\"EMPLOYEE_GROUP\"")
	private String employeegroup;
	@Column(name="\"DESIGNATION\"")
	private String designation;
	@Column(name="\"LOCATION\"")
	private String location;
	@Column(name="\"BASE_LOCATION\"")
	private String baseLocation;
	@Column(name="\"AQUISITION\"")
	private String aquisition;
	@Column(name="\"SUPERVISOR\"")
	private String supervisor;
	@Column(name="\"SUPERVISOR_FULL_NAME\"")
	private String supervisorFullName;
	@Column(name="\"Supervisor_Email_ID\"")
	private String supervisorEmailID;
	@Column(name="\"ORIGINAL_HIRE_REASON\"")
	private String originalHireReason;
	@Column(name="\"PRACTICE\"")
	private String practice;
	@Column(name="\"SUB_PRACTICE\"")
	private String subPractice;
	@Column(name="\"GLOBAL_GRADE\"")
	private String globalGrade;
	@Column(name="\"LOCAL_GRADE\"")
	private String localGrade;
	@Column(name="\"NEAR_SHORE\"")
	private String nearShore;
	@Column(name="\"COUNTRY_TRANSFERED_TO\"")
	private String countryTransferedTo;
	@Column(name="\"PREVIOUS_BUSINESS_AERA\"")
	private String previousBusinessAera;
	@Column(name="\"PEOPLE_MANAGER_ID\"")
	private String peopleManagerID;
	@Column(name="\"PEOPLE_MANAGER_NAME\"")
	private String peopleManagerName;
	@Column(name="\"DEPLOYMENT_MODEL\"")
	private String deploymentModel;
	@Column(name="\"ASSIGNMENT_DURATION\"")
	private String assignmentDuration;
	@Column(name="\"PRIMARY_SKILL\"")
	private String primarySkill;
	@Column(name="\"ULTIMATE_ACCOUNT_NAME\"")
	private String ultimateAccountName;
	@Column(name="\"ACCOUNT_NAME\"")
	private String accountName;
	@Column(name="\"PROJECT_PU_NAME\"")
	private String projectPUName;
	@Column(name="\"PROJECT_NAME\"")
	private String projectName;
	@Column(name="\"PROJECT_START_DATE\"")
	private String projectStartDate;
	@Column(name="\"PROJECT_ROLLOFF_DATE\"")
	private String projectRolloffDate;
	@Column(name="\"ROLE\"")
	private String Role;
	@Column(name="\"BILLABILITY\"")
	private String billability;
	@Column(name="\"POSITION_ID\"")
	private String positionID;
	@Column(name="\"ALLOCATION_PERCENTAGE\"")
	private String allocationPercentage;
	@Column(name="\"LAST_TRANSACTION_DATE\"")
	private String lastTransactionDate;
	@Column(name="\"LAST_PROJECT_CODE\"")
	private String lastProjectCode;
	@Column(name="\"LAST_CLIENT_GROUPNAME\"")
	private String lastclientgroupname;
	@Column(name="\"BENCH_STATUS_ISW\"")
	private String benchstatusISW;
	@Column(name="\"SKILL_GROUP\"")
	private String skillGroup;
	@Column(name="\"BOOKING_ID\"")
	private String bookingID;
	@Column(name="\"TYPE_OF_PROJECT\"")
	private String typeOfProject;
	@Column(name="\"FUTURE_ACCOUNT_NAME\"")
	private String futureAccountName;
	@Column(name="\"FUTURE_PROJECT_CODE\"")
	private String futureProjectCode;
	@Column(name="\"ORGANIZATION_BU\"")
	private String organizationBU;
	@Column(name="\"NEW_BU\"")
	private String newBU;
	@Column(name="\"LOCATION_STANDARDIZATION\"")
	private String locationStandardization;
	@Column(name="\"BU_PORTFOLIOS\"")
	private String buPortfolios;
	@Column(name="\"LAST_CHANGE_MADE_BY\"")
	private String lastchangeMadeBy;
	@Column(name="\"LAST_CHANGE_DATE\"")
	private String lastchangedate;
	@Column(name="\"PROJECT_TYPE\"")
	private String projectType;
	@Column(name="\"OPPORTUNITY_NAME\"")
	private String opportunityName;
	@Column(name="\"OPPORTUNITY_END_DATE\"")
	private String opportunityEndDate;
	@Column(name="\"BOOKING_TYPE\"")
	private String bookingType;
	@Column(name="\"REGION_TYPE\"")
	private String regionType;
	@Column(name="\"CG_START_DATE\"")
	private String cgstartDate;
	@Column(name="\"GROUP_ACCOUNT_NAME\"")
	private String groupaccountName;
}
