package com.vggadsourcingcmd.project.service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vggadsourcingcmd.project.entity.VgGadExcelEntity;
import com.vggadsourcingcmd.project.repo.vgGadRepo;

@Service
public class DatabaseToExcelVgGadService {
	
	@Autowired
	private vgGadRepo vggadRepo;
	
	public void generateExcel() throws IOException {
		List<VgGadExcelEntity> excels =vggadRepo.findAll();
		Workbook workbook=new XSSFWorkbook();
		Sheet sheet=workbook.createSheet("VG_GAD excel Info");
		Row row=sheet.createRow(0);
		row.createCell(0).setCellValue("GGId");
		row.createCell(1).setCellValue("LiLrId");
		row.createCell(2).setCellValue("PerNr");
		row.createCell(3).setCellValue("MycposId");
		row.createCell(4).setCellValue("CandidateId");
		row.createCell(5).setCellValue("Region");
		row.createCell(6).setCellValue("FinRegion");
		row.createCell(7).setCellValue("FirstName");
		row.createCell(8).setCellValue("MiddleName");
		row.createCell(9).setCellValue("Lastname");
		row.createCell(10).setCellValue("NtloginId");
		row.createCell(11).setCellValue("GlobalDateJoining");
		row.createCell(12).setCellValue("LocalDateJoining");
		row.createCell(13).setCellValue("EmailId");
		row.createCell(14).setCellValue("Organization");
		row.createCell(15).setCellValue("CostCenter");
		row.createCell(16).setCellValue("Peoplegroup");
		row.createCell(17).setCellValue("PersonType");
		row.createCell(18).setCellValue("Employeegroup");
		row.createCell(19).setCellValue("Designation");
		row.createCell(20).setCellValue("Location");
		row.createCell(21).setCellValue("BaseLocation");
		row.createCell(22).setCellValue("Aquisition");
		row.createCell(23).setCellValue("Supervisor");
		row.createCell(24).setCellValue("SupervisorFullName");
		row.createCell(25).setCellValue("SupervisorEmailID");
		row.createCell(26).setCellValue("OriginalHireReason");
		row.createCell(27).setCellValue("Practice");
		row.createCell(28).setCellValue("SubPractice");
		row.createCell(29).setCellValue("GlobalGrade");
		row.createCell(30).setCellValue("LocalGrade");
		row.createCell(31).setCellValue("NearShore");
		row.createCell(32).setCellValue("CountryTransferedTo");
		row.createCell(33).setCellValue("PreviousBusinessAera");
		row.createCell(34).setCellValue("PeopleManagerID");
		row.createCell(35).setCellValue("PeopleManagerName");
		row.createCell(36).setCellValue("DeploymentModel");
		row.createCell(37).setCellValue("AssignmentDuration");
		row.createCell(38).setCellValue("PrimarySkill");
		row.createCell(39).setCellValue("UltimateAccountName");
		row.createCell(40).setCellValue("AccountName");
		row.createCell(41).setCellValue("ProjectPUName");
		row.createCell(42).setCellValue("ProjectName");
		row.createCell(43).setCellValue("ProjectStartDate");
		row.createCell(44).setCellValue("ProjectRolloffDate");
		row.createCell(45).setCellValue("Role");
		row.createCell(46).setCellValue("Billability");
		row.createCell(47).setCellValue("PositionID");
		row.createCell(48).setCellValue("AllocationPercentage");
		row.createCell(49).setCellValue("Lastclientgroupname");
		row.createCell(50).setCellValue("LastProjectCode");
		row.createCell(51).setCellValue("Lastclientgroupname");
		row.createCell(52).setCellValue("BenchstatusISW");
		row.createCell(53).setCellValue("SkillGroup");
		row.createCell(54).setCellValue("BookingID");
		row.createCell(55).setCellValue("TypeOfProject");
		row.createCell(56).setCellValue("FutureAccountName");
		row.createCell(57).setCellValue("FutureProjectCode");
		row.createCell(58).setCellValue("OrganizationBU");
		row.createCell(59).setCellValue("NewBU");
		row.createCell(60).setCellValue("LocationStandardization");
		row.createCell(61).setCellValue("BuPortfolios");
		row.createCell(62).setCellValue("LastchangeMadeBy");
		row.createCell(63).setCellValue("Lastchangedate");
		row.createCell(64).setCellValue("ProjectType");
		row.createCell(65).setCellValue("OpportunityName");
		row.createCell(66).setCellValue("OpportunityEndDate");
		row.createCell(67).setCellValue("BookingType");
		row.createCell(68).setCellValue("RegionType");
		row.createCell(69).setCellValue("CgstartDate");
		row.createCell(70).setCellValue("GroupaccountName");

	
	
	int dataRowIndex =1 ;
	for(VgGadExcelEntity excel1 : excels) {
		Row dataRow=sheet.createRow(dataRowIndex);
		dataRow.createCell(0).setCellValue(excel1.getGgid());
		dataRow.createCell(1).setCellValue(excel1.getLi_lrId());
		dataRow.createCell(2).setCellValue(excel1.getPerNr());
		dataRow.createCell(3).setCellValue(excel1.getMycposId());
		dataRow.createCell(4).setCellValue(excel1.getCandidateId());
		dataRow.createCell(5).setCellValue(excel1.getRegion());
		dataRow.createCell(6).setCellValue(excel1.getFinRegion());
		dataRow.createCell(7).setCellValue(excel1.getFirstName());
		dataRow.createCell(8).setCellValue(excel1.getMiddleName());
		dataRow.createCell(9).setCellValue(excel1.getLastname());
		dataRow.createCell(10).setCellValue(excel1.getNtloginId());
		dataRow.createCell(11).setCellValue(excel1.getGlobalDateJoining());
		dataRow.createCell(12).setCellValue(excel1.getLocalDateJoining());
		dataRow.createCell(13).setCellValue(excel1.getEmailId());
		dataRow.createCell(14).setCellValue(excel1.getOrganization());
		dataRow.createCell(15).setCellValue(excel1.getCostCenter());
		dataRow.createCell(16).setCellValue(excel1.getPeoplegroup());
		dataRow.createCell(17).setCellValue(excel1.getPersonType());
		dataRow.createCell(18).setCellValue(excel1.getEmployeegroup());
		dataRow.createCell(19).setCellValue(excel1.getDesignation());
		dataRow.createCell(20).setCellValue(excel1.getLocation());
		dataRow.createCell(21).setCellValue(excel1.getBaseLocation());
		dataRow.createCell(22).setCellValue(excel1.getAquisition());
		dataRow.createCell(23).setCellValue(excel1.getSupervisor());
		dataRow.createCell(24).setCellValue(excel1.getSupervisorFullName());
		dataRow.createCell(25).setCellValue(excel1.getSupervisorEmailID());
		dataRow.createCell(26).setCellValue(excel1.getOriginalHireReason());
		dataRow.createCell(27).setCellValue(excel1.getPractice());
		dataRow.createCell(28).setCellValue(excel1.getSubPractice());
		dataRow.createCell(29).setCellValue(excel1.getGlobalGrade());
		dataRow.createCell(30).setCellValue(excel1.getLocalGrade());
		dataRow.createCell(31).setCellValue(excel1.getNearShore());
		dataRow.createCell(32).setCellValue(excel1.getCountryTransferedTo());
		dataRow.createCell(33).setCellValue(excel1.getPreviousBusinessAera());
		dataRow.createCell(34).setCellValue(excel1.getPeopleManagerID());
		dataRow.createCell(35).setCellValue(excel1.getPeopleManagerName());
		dataRow.createCell(36).setCellValue(excel1.getDeploymentModel());
		dataRow.createCell(37).setCellValue(excel1.getAssignmentDuration());
		dataRow.createCell(38).setCellValue(excel1.getPrimarySkill());
		dataRow.createCell(39).setCellValue(excel1.getUltimateAccountName());
		dataRow.createCell(40).setCellValue(excel1.getAccountName());
		dataRow.createCell(41).setCellValue(excel1.getProjectPUName());
		dataRow.createCell(42).setCellValue(excel1.getProjectName());
		dataRow.createCell(43).setCellValue(excel1.getProjectStartDate());
		dataRow.createCell(44).setCellValue(excel1.getProjectRolloffDate());
		dataRow.createCell(45).setCellValue(excel1.getRole());
		dataRow.createCell(46).setCellValue(excel1.getBillability());
		dataRow.createCell(47).setCellValue(excel1.getPositionID());
		dataRow.createCell(48).setCellValue(excel1.getAllocationPercentage());
		dataRow.createCell(49).setCellValue(excel1.getLastclientgroupname());
		dataRow.createCell(50).setCellValue(excel1.getLastProjectCode());
		dataRow.createCell(51).setCellValue(excel1.getLastclientgroupname());
		dataRow.createCell(52).setCellValue(excel1.getBenchstatusISW());
		dataRow.createCell(53).setCellValue(excel1.getSkillGroup());
		dataRow.createCell(54).setCellValue(excel1.getBookingID());
		dataRow.createCell(55).setCellValue(excel1.getTypeOfProject());
		dataRow.createCell(56).setCellValue(excel1.getFutureAccountName());
		dataRow.createCell(57).setCellValue(excel1.getFutureProjectCode());
		dataRow.createCell(58).setCellValue(excel1.getOrganizationBU());
		dataRow.createCell(59).setCellValue(excel1.getNewBU());
		dataRow.createCell(60).setCellValue(excel1.getLocationStandardization());
		dataRow.createCell(61).setCellValue(excel1.getBuPortfolios());
		dataRow.createCell(62).setCellValue(excel1.getLastchangeMadeBy());
		dataRow.createCell(63).setCellValue(excel1.getLastchangedate());
		dataRow.createCell(64).setCellValue(excel1.getProjectType());
		dataRow.createCell(65).setCellValue(excel1.getOpportunityName());
		dataRow.createCell(66).setCellValue(excel1.getOpportunityEndDate());
		dataRow.createCell(67).setCellValue(excel1.getBookingType());
		dataRow.createCell(68).setCellValue(excel1.getRegionType());
		dataRow.createCell(69).setCellValue(excel1.getCgstartDate());
		dataRow.createCell(70).setCellValue(excel1.getGroupaccountName());

		
		
		dataRowIndex++;
	}
	FileOutputStream file=new FileOutputStream("C:\\Users\\SGHOSH31\\Videos\\github upload\\Project-Automation\\vgGadSourcingcmd\\target\\vg_gad.xlsx");
	workbook.write(file);
	workbook.close();
	file.close();
	
}

}
