package com.vg.resource.reportautomation.helper;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import com.vg.resource.reportautomation.entity.vgGadEntity;

public class GadHelper {	
	
	public static boolean checkExcelFormat(MultipartFile file)
	{
		String contentType = file.getContentType();
		if(contentType!=null && contentType.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"))
		{
			return true;
		}
		return false;
	}
	
	/**
	 * @param is
	 * @return
	 */
	public static List<vgGadEntity> convertExceltoList(InputStream is)
	{
		List<vgGadEntity> list = new ArrayList<>();
		try {
			
			Workbook workbook = new XSSFWorkbook(is);
			Sheet sheet = workbook.getSheetAt(0);
			
			int rowNumber =0;
			Iterator<Row> iterator = sheet.iterator();
			
			while(iterator.hasNext())
			{
				Row row = iterator.next();
				
				//To skip Header Row
				if(rowNumber == 0)
				{
					rowNumber++;
					continue;
				}
				
				Iterator<Cell> cells = row.iterator();
				int cellId = 0;
				vgGadEntity VgGadExcel = new vgGadEntity();
				while(cells.hasNext())
				{
					Cell cell = cells.next();
					switch(cellId)
					{
					case 0:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setLi_lrId(cell.getStringCellValue());
						break;
					case 1:
						cell.setCellType(CellType.NUMERIC);
						VgGadExcel.setPerNr(cell.getNumericCellValue());
						break;	
					case 2:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setGgid(cell.getStringCellValue());
					case 3:
						cell.setCellType(CellType.NUMERIC);
						VgGadExcel.setMycposId(cell.getNumericCellValue());
						break;
					case 4:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setCandidateId(cell.getStringCellValue());
						break;
					case 5:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setRegion(cell.getStringCellValue());
						break;
					case 6:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setFinRegion(cell.getStringCellValue());
						break;
					case 7:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setFirstName(cell.getStringCellValue());
						break;
					case 8:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setMiddleName(cell.getStringCellValue());
						break;
					case 9:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setLastname(cell.getStringCellValue());
						break;
					case 10:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setNtloginId(cell.getStringCellValue());
						break;
					case 11:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setGlobalDateJoining(cell.getStringCellValue());
						break;
					case 12:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setLocalDateJoining(cell.getStringCellValue());
						break;
					case 13:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setEmailId(cell.getStringCellValue());
						break;
					case 14:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setOrganization(cell.getStringCellValue());
						break;
					case 15:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setCostCenter(cell.getStringCellValue());
						break;
					case 16:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setPeoplegroup(cell.getStringCellValue());
						break;
					case 17:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setPersonType(cell.getStringCellValue());
						break;
					case 18:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setEmployeegroup(cell.getStringCellValue());
						break;
					case 19:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setDesignation(cell.getStringCellValue());
						break;
					case 20:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setLocation(cell.getStringCellValue());
						break;
					case 21:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setBaseLocation(cell.getStringCellValue());
						break;
					case 22:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setLocalDateJoining(cell.getStringCellValue());
						break;
					case 23:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setAquisition(cell.getStringCellValue());
						break;
					case 24:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setSupervisor(cell.getStringCellValue());
						break;
					case 25:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setSupervisorFullName(cell.getStringCellValue());
						break;
					case 26:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setSupervisorEmailID(cell.getStringCellValue());
						break;
					case 27:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setOriginalHireReason(cell.getStringCellValue());
						break;
					case 28:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setPractice(cell.getStringCellValue());
						break;
					case 29:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setSubPractice(cell.getStringCellValue());
						break;
					case 30:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setSubPractice(cell.getStringCellValue());
						break;
					case 31:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setGlobalGrade(cell.getStringCellValue());
						break;
					case 32:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setLocalGrade(cell.getStringCellValue());
						break;
					case 33:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setNearShore(cell.getStringCellValue());
						break;
					case 34:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setCountryTransferedTo(cell.getStringCellValue());
						break;
					case 35:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setPreviousBusinessAera(cell.getStringCellValue());
						break;
					case 36:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setPeopleManagerID(cell.getStringCellValue());
						break;
					case 37:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setPeopleManagerName(cell.getStringCellValue());
						break;
					case 38:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setDeploymentModel(cell.getStringCellValue());
						break;
					case 39:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setAssignmentDuration(cell.getStringCellValue());
						break;
					case 40:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setPrimarySkill(cell.getStringCellValue());
						break;
					case 41:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setUltimateAccountName(cell.getStringCellValue());
						break;
					case 42:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setAccountName(cell.getStringCellValue());
						break;
					case 43:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setProjectPUName(cell.getStringCellValue());
						break;
					case 44:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setProjectName(cell.getStringCellValue());
						break;
					case 45:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setProjectStartDate(cell.getStringCellValue());
						break;
					case 46:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setProjectRolloffDate(cell.getStringCellValue());
						break;
					
					case 47:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setRole(cell.getStringCellValue());
						break;	
					case 48:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setBillability(cell.getStringCellValue());
						break;
					case 49:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setPositionID(cell.getStringCellValue());
						break;
					case 50:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setAllocationPercentage(cell.getStringCellValue());
						break;
					case 51:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setLastTransactionDate(cell.getStringCellValue());
						break;
					case 52:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setLastProjectCode(cell.getStringCellValue());
						break;
					case 53:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setLastclientgroupname(cell.getStringCellValue());
						break;
					case 54:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setBenchstatusISW(cell.getStringCellValue());
						break;
					case 55:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setSkillGroup(cell.getStringCellValue());
						break;
					case 56:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setBookingID(cell.getStringCellValue());
						break;
					case 57:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setTypeOfProject(cell.getStringCellValue());
						break;
					case 58:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setFutureAccountName(cell.getStringCellValue());
						break;
					case 59:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setFutureProjectCode(cell.getStringCellValue());
						break;
					case 60:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setOrganizationBU(cell.getStringCellValue());
						break;
					case 61:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setNewBU(cell.getStringCellValue());
						break;
					case 62:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setLocationStandardization(cell.getStringCellValue());
						break;
					case 63:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setBuPortfolios(cell.getStringCellValue());
						break;
					case 64:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setLastchangeMadeBy(cell.getStringCellValue());
						break;
					case 65:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setLastchangedate(cell.getStringCellValue());
						break;
					case 66:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setProjectType(cell.getStringCellValue());
						break;
					case 67:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setOpportunityName(cell.getStringCellValue());
						break;
					case 68:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setOpportunityEndDate(cell.getStringCellValue());
						break;
					case 69:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setBookingType(cell.getStringCellValue());
						break;
					case 70:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setRegionType(cell.getStringCellValue());
						break;
					case 71:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setCgstartDate(cell.getStringCellValue());
						break;
					case 72:
						cell.setCellType(CellType.STRING);
						VgGadExcel.setGroupaccountName(cell.getStringCellValue());
						break;
					default:
						break;
					
					}
					cellId++;
				}
				list.add(VgGadExcel);				
			}
			workbook.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		return list;
	}
}