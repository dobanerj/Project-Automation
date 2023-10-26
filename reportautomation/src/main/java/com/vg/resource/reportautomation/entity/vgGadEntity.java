package com.vg.resource.reportautomation.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Table(name = "VG_Gad")
@Entity
public class vgGadEntity {
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
}
