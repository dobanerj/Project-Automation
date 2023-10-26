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
	@Column(name="\"LI/LR_ID\"")
	private String li_lrId;
	@Column(name="\"PERNR\"")
	private double perNr;
	@Column(name="\"MyC_Post_Id\"")
	private double mycposId;
	@Column(name="\"Candidate_Id\"")
	private String candidateId;
	@Column(name="\"Region\"")
	private String region;
	@Column(name="\"Fin_Region\"")
	private String FinRegion;
	@Column(name="\"First_Name\"")
	private String firstName;
	@Column(name="\"Middle_Name\"")
	private String middleName;
	@Column(name="\"Last_Name\"")
	private String lastname;
	@Column(name="\"NT_Login_Id\"")
	private String NtloginId;
	@Column(name="\"Global_Date_Joining\"")
	private String globalDateJoining;
	@Column(name="\"Local_Date_Joining\"")
	private String localDateJoining;
	@Column(name="\"Email_Id\"")
	private String emailId;
	@Column(name="\"Organization\"")
	private String organization;
	@Column(name="\"Cost_Center\"")
	private String costCenter;
	@Column(name="\"People_Group\"")
	private String peoplegroup;
	@Column(name="\"Person_Type\"")
	private String personType;
	@Column(name="\"Employee_Group\"")
	private String employeegroup;
	@Column(name="\"Designation\"")
	private String designation;
	@Column(name="\"Location\"")
	private String location;
	@Column(name="\"Base_Location\"")
	private String baseLocation;
	@Column(name="\"Aquisition\"")
	private String aquisition;
	@Column(name="\"Supervisor\"")
	private String supervisor;
	@Column(name="\"Supervisor_Full_Name\"")
	private String supervisorFullName;
	@Column(name="\"Supervisor_Email_ID\"")
	private String supervisorEmailID;
	@Column(name="\"Original_Hire_Reason\"")
	private String originalHireReason;
	@Column(name="\"Practice\"")
	private String practice;
	@Column(name="\"Sub_Practice\"")
	private String subPractice;
	@Column(name="\"Global_Grade\"")
	private String globalGrade;
	@Column(name="\"local_Grade\"")
	private String localGrade;
	@Column(name="\"Near_Shore\"")
	private String nearShore;
	@Column(name="\"Country_Transfered_To\"")
	private String countryTransferedTo;
	@Column(name="\"Previous_Business_Aera\"")
	private String previousBusinessAera;
	@Column(name="\"people_Manager_ID\"")
	private String peopleManagerID;
	@Column(name="\"people_Manager_Name\"")
	private String peopleManagerName;
	@Column(name="\"Deployment_Model\"")
	private String deploymentModel;
	@Column(name="\"Assignment_Duration\"")
	private String assignmentDuration;
	@Column(name="\"Primary_Skill\"")
	private String primarySkill;
	@Column(name="\"Ultimate_Account_Name\"")
	private String ultimateAccountName;
	@Column(name="\"Account_Name\"")
	private String accountName;
	@Column(name="\"Project_PU_Name\"")
	private String projectPUName;
	@Column(name="\"Project_Name\"")
	private String projectName;
	@Column(name="\"Project_Start_Date\"")
	private String projectStartDate;
	@Column(name="\"Project_Rolloff_Date\"")
	private String projectRolloffDate;
	@Column(name="\"Role\"")
	private String Role;
	@Column(name="\"Billability\"")
	private String billability;
	@Column(name="\"Position_ID\"")
	private String positionID;
	@Column(name="\"Allocation_Percentage\"")
	private String allocationPercentage;
	@Column(name="\"Last_Transaction_Date\"")
	private String lastTransactionDate;
	@Column(name="\"Last_Project_Code\"")
	private String lastProjectCode;
	@Column(name="\"Last_Client_Groupname\"")
	private String lastclientgroupname;
	@Column(name="\"Bench_Status_ISW\"")
	private String benchstatusISW;
	@Column(name="\"Skill_Group\"")
	private String skillGroup;
	@Column(name="\"Booking_ID\"")
	private String bookingID;
	@Column(name="\"Type_Of_Project\"")
	private String typeOfProject;
	@Column(name="\"Future_Account_Name\"")
	private String futureAccountName;
	@Column(name="\"Future_Project_Code\"")
	private String futureProjectCode;
	@Column(name="\"Organization_BU\"")
	private String organizationBU;
	@Column(name="\"New_BU\"")
	private String newBU;
	@Column(name="\"Location_Standardization\"")
	private String locationStandardization;
	@Column(name="\"Bu_Portfolios\"")
	private String buPortfolios;
	@Column(name="\"Last_change_Made_By\"")
	private String lastchangeMadeBy;
	@Column(name="\"Last_Change_Date\"")
	private String lastchangedate;
	@Column(name="\"Project_Type\"")
	private String projectType;
	@Column(name="\"Opportunity_Name\"")
	private String opportunityName;
	@Column(name="\"Opportunity_End_Date\"")
	private String opportunityEndDate;
	@Column(name="\"Booking_Type\"")
	private String bookingType;
	@Column(name="\"Region_Type\"")
	private String regionType;
	@Column(name="\"CG_Start_Date\"")
	private String cgstartDate;
	@Column(name="\"Group_Account_Name\"")
	private String groupaccountName;
}
