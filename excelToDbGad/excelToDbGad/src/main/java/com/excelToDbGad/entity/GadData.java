package com.excelToDbGad.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "VG_GAD")
public class GadData {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "GGID")
	private int ggid;
	
	@Column(name = "LILRID")
	private String li_lrId;
	
	@Column(name = "PERNR")
	private double perNr;
	
	@Column(name = "MY_CPOSID")
	private double mycposId;
	
	@Column(name = "CANDIDATE_ID")
	private String candidateId;
	
	@Column(name = "REGION")
	private String region;
	
	@Column(name = "FIN_REGION")
	private String FinRegion;
	
	@Column(name = "FIRSTNAME")
	private String firstName;
	
	@Column(name = "MIDDLENAME")
	private String middleName;
	
	@Column(name = "LASTNAME")
	private String lastname;
	
	@Column(name = "NT_LOGINID")
	private String NtloginId;
	
	@Column(name = "GLOBAL_DATE_JOINING")
	private String globalDateJoining;
	
	@Column(name = "LOCAL_DATE_JOINING")
	private String localDateJoining;
	
	@Column(name = "EMAILID")
	private String emailId;
	
	@Column(name = "ORGANIZATION")
	private String organization;
	
	@Column(name = "COST_CENTER")
	private String costCenter;
	
	@Column(name = "PEOPLE_GROUP")
	private String peoplegroup;
	
	@Column(name = "PERSON_TYPE")
	private String personType;
	
	@Column(name = "EMPLOYEE_GROUP")
	private String employeegroup;
	
	@Column(name = "DESIGNATION")
	private String designation;
	
	@Column(name = "LOCATION")
	private String location;
	
	@Column(name = "BASE_LOCATION")
	private String baseLocation;
	
	@Column(name = "AQUISITION")
	private String aquisition;
	
	@Column(name = "SUPERVISOR")
	private String supervisor;
	
	@Column(name = "SUPERVISOR_FULLNAME")
	private String supervisorFullName;
	
	@Column(name = "SUPERVISOR_EMAILID")
	private String supervisorEmailID;
	
	@Column(name = "ORIGINAL_HIRE_REASON")
	private String originalHireReason;
	
	@Column(name = "PRACTICE")
	private String practice;
	
	@Column(name = "SUB_PRACTICE")
	private String subPractice;
	
	@Column(name = "GLOBAL_GRADE")
	private String globalGrade;
	
	@Column(name = "LOCAL_GRADE")
	private String localGrade;
	
	@Column(name = "NEAR_SHORE")
	private String nearShore;
	
	@Column(name = "COUNTRY_TRANSFERED_TO")
	private String countryTransferedTo;
	
	@Column(name = "PREVIOUS_BUSINESS_AERA")
	private String previousBusinessAera;
	
	@Column(name = "PEOPLE_MANAGER_ID")
	private String peopleManagerID;
	
	@Column(name = "PEOPLE_MANAGER_NAME")
	private String peopleManagerName;
	
	@Column(name = "DEPLOYMENT_MODEL")
	private String deploymentModel;
	
	@Column(name = "ASSIGNMENT_DURATION")
	private String assignmentDuration;
	
	@Column(name = "PRIMARY_SKILL")
	private String primarySkill;
	
	@Column(name = "ULTIMATE_ACCOUNT_NAME")
	private String ultimateAccountName;
	
	@Column(name = "ACCOUNT_NAME")
	private String accountName;
	
	@Column(name = "PROJECT_PUNAME")
	private String projectPUName;
	
	@Column(name = "PROJECT_NAME")
	private String projectName;
	
	@Column(name = "PROJECT_START_DATE")
	private String projectStartDate;
	
	@Column(name = "PROJECT_ROLLOF_DATE")
	private String projectRolloffDate;
	
	@Column(name = "ROLE")
	private String Role;
	
	@Column(name = "BILLABILITY")
	private String billability;
	
	@Column(name = "POSITION_ID")
	private String positionID;
	
	@Column(name = "ALLOCATION_PERCENTAGE")
	private String allocationPercentage;
	
	@Column(name = "LAST_TRANSACTION_DATE")
	private String lastTransactionDate;
	
	@Column(name = "LAST_PROJECT_CODE")
	private String lastProjectCode;
	
	@Column(name = "LAST_CLIENT_GROUP_NAME")
	private String lastclientgroupname;
	
	@Column(name = "BENCH_STATUS_ISW")
	private String benchstatusISW;
	
	@Column(name = "SKILL_GROUP")
	private String skillGroup;
	
	@Column(name = "BOOKING_ID")
	private String bookingID;
	
	@Column(name = "TYPE_OF_PROJECT")
	private String typeOfProject;
	
	@Column(name = "FUTURE_ACCOUNTNAME")
	private String futureAccountName;
	
	@Column(name = "FUTURE_PROJECT_CODE")
	private String futureProjectCode;
	
	@Column(name = "ORGANIZATION_BU")
	private String organizationBU;
	
	@Column(name = "NEW_BU")
	private String newBU;
	
	@Column(name = "LOCATION_STANDARDIZATION")
	private String locationStandardization;
	
	@Column(name = "BU_PORTFOLIOS")
	private String buPortfolios;
	
	@Column(name = "LAST_CHANGE_MADE_BY")
	private String lastchangeMadeBy;
	
	@Column(name = "LAST_CHANGE_DATE")
	private String lastchangedate;
	
	@Column(name = "PROJECT_TYPE")
	private String projectType;
	
	@Column(name = "OPPORTUNITY_NAME")
	private String opportunityName;
	
	@Column(name = "OPPORTUNITY_ENDDATE")
	private String opportunityEndDate;
	
	@Column(name = "BOOKING_TYPE")
	private String bookingType;
	
	@Column(name = "PRACTICE_TYPE")
	private String practiceType;
	
	@Column(name = "REGION_TYPE")
	private String regionType;
	
	@Column(name = "CG_START_DATE")
	private String cgstartDate;
	
	@Column(name = "GROUP_ACCOUNT_NAME")
	private String groupaccountName;

}
