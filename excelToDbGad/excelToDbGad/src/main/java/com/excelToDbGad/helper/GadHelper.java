package com.excelToDbGad.helper;

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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import com.excelToDbGad.entity.GadData;
import com.excelToDbGad.repo.GadRepo;


public class GadHelper {
	
	@Autowired
	private GadRepo gadRepo;
	
	public static boolean checkExcelFormat(MultipartFile file)
	{
		String contentType = file.getContentType();
		if(contentType.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"))
		{
			return true;
		}
		return false;
	}
	
	public static List<GadData> convertExceltoList(InputStream is)
	{
		List<GadData> list = new ArrayList<>();
		try {
			
			Workbook workbook = new XSSFWorkbook(is);
			Sheet sheet = workbook.getSheetAt(0);
			
			int rowNumber =0;
			Iterator<Row> iterator = sheet.iterator();
			
			while(iterator.hasNext())
			{
				Row row = iterator.next();
				if(rowNumber == 0)
				{
					rowNumber++;
					continue;
				}
				
				Iterator<Cell> cells = row.iterator();
				int cellId = 0;
				GadData sourcedata = new GadData();
				while(cells.hasNext())
				{
					Cell cell = cells.next();
					switch(cellId)
					{
					case 0:
						cell.setCellType(CellType.NUMERIC);
						sourcedata.setGgid((int)cell.getNumericCellValue());
						break;
					case 1:
						cell.setCellType(CellType.STRING);
						sourcedata.setLi_lrId(cell.getStringCellValue());
						break;
					case 2:
						cell.setCellType(CellType.NUMERIC);
						sourcedata.setPerNr(cell.getNumericCellValue());;
						break;
					case 3:
						cell.setCellType(CellType.NUMERIC);
						sourcedata.setMycposId(cell.getNumericCellValue());
						break;
					case 4:
						cell.setCellType(CellType.STRING);
						sourcedata.setCandidateId(cell.getStringCellValue());
						break;	
					case 5:
						cell.setCellType(CellType.STRING);
						sourcedata.setRegion(cell.getStringCellValue());
						break;		
					case 6:
						cell.setCellType(CellType.STRING);
						sourcedata.setFinRegion(cell.getStringCellValue());
						break;
					case 7:
						cell.setCellType(CellType.STRING);
						sourcedata.setFirstName(cell.getStringCellValue());
						break;	
					case 8:
						cell.setCellType(CellType.STRING);
						sourcedata.setMiddleName(cell.getStringCellValue());
						break;
					case 9:
						cell.setCellType(CellType.STRING);
						sourcedata.setLastname(cell.getStringCellValue());
						break;
					case 10:
						cell.setCellType(CellType.STRING);
						sourcedata.setNtloginId(cell.getStringCellValue());
						break;
					case 11:
						cell.setCellType(CellType.STRING);
						sourcedata.setGlobalDateJoining(cell.getStringCellValue());
						break;
					case 12:
						cell.setCellType(CellType.STRING);
						sourcedata.setLocalDateJoining(cell.getStringCellValue());
						break;
					case 13:
						cell.setCellType(CellType.STRING);
						sourcedata.setOrganization(cell.getStringCellValue());
						break;
					case 14:
						cell.setCellType(CellType.STRING);
						sourcedata.setCostCenter(cell.getStringCellValue());
						break;
					case 15:
						cell.setCellType(CellType.STRING);
						sourcedata.setPeoplegroup(cell.getStringCellValue());
						break;
					case 16:
						cell.setCellType(CellType.STRING);
						sourcedata.setPersonType(cell.getStringCellValue());
						break;
					case 17:
						cell.setCellType(CellType.STRING);
						sourcedata.setEmployeegroup(cell.getStringCellValue());
						break;
					case 18:
						cell.setCellType(CellType.STRING);
						sourcedata.setDesignation(cell.getStringCellValue());
						break;
					case 19:
						cell.setCellType(CellType.STRING);
						sourcedata.setLocation(cell.getStringCellValue());
						break;
					case 20:
						cell.setCellType(CellType.STRING);
						sourcedata.setBaseLocation(cell.getStringCellValue());
						break;	
					case 21:
						cell.setCellType(CellType.STRING);
						sourcedata.setAquisition(cell.getStringCellValue());
						break;		
					case 22:
						cell.setCellType(CellType.STRING);
						sourcedata.setSupervisor(cell.getStringCellValue());
						break;
					case 23:
						cell.setCellType(CellType.STRING);
						sourcedata.setSupervisorFullName(cell.getStringCellValue());
						break;	
					case 24:
						cell.setCellType(CellType.STRING);
						sourcedata.setSupervisorEmailID(cell.getStringCellValue());
						break;
					case 25:
						cell.setCellType(CellType.STRING);
						sourcedata.setOriginalHireReason(cell.getStringCellValue());
						break;
					case 26:
						cell.setCellType(CellType.STRING);
						sourcedata.setPractice(cell.getStringCellValue());
						break;
					case 27:
						cell.setCellType(CellType.STRING);
						sourcedata.setSubPractice(cell.getStringCellValue());
						break;
					case 28:
						cell.setCellType(CellType.STRING);
						sourcedata.setGlobalGrade(cell.getStringCellValue());
						break;
					case 29:
						cell.setCellType(CellType.STRING);
						sourcedata.setLocalGrade(cell.getStringCellValue());
						break;
					case 30:
						cell.setCellType(CellType.STRING);
						sourcedata.setNearShore(cell.getStringCellValue());
						break;
					case 31:
						cell.setCellType(CellType.STRING);
						sourcedata.setCountryTransferedTo(cell.getStringCellValue());
						break;
					case 32:
						cell.setCellType(CellType.STRING);
						sourcedata.setPreviousBusinessAera(cell.getStringCellValue());
						break;	
					case 33:
						cell.setCellType(CellType.STRING);
						sourcedata.setPeopleManagerID(cell.getStringCellValue());
						break;		
					case 34:
						cell.setCellType(CellType.STRING);
						sourcedata.setPeopleManagerName(cell.getStringCellValue());
						break;
					case 35:
						cell.setCellType(CellType.STRING);
						sourcedata.setDeploymentModel(cell.getStringCellValue());
						break;	
					case 36:
						cell.setCellType(CellType.STRING);
						sourcedata.setAssignmentDuration(cell.getStringCellValue());
						break;
					case 37:
						cell.setCellType(CellType.STRING);
						sourcedata.setPrimarySkill(cell.getStringCellValue());
						break;
					case 38:
						cell.setCellType(CellType.STRING);
						sourcedata.setUltimateAccountName(cell.getStringCellValue());
						break;
					case 39:
						cell.setCellType(CellType.STRING);
						sourcedata.setAccountName(cell.getStringCellValue());
						break;
					case 40:
						cell.setCellType(CellType.STRING);
						sourcedata.setProjectPUName(cell.getStringCellValue());
						break;
					case 41:
						cell.setCellType(CellType.STRING);
						sourcedata.setProjectName(cell.getStringCellValue());
						break;
					case 42:
						cell.setCellType(CellType.STRING);
						sourcedata.setProjectStartDate(cell.getStringCellValue());
						break;
					case 43:
						cell.setCellType(CellType.STRING);
						sourcedata.setProjectRolloffDate(cell.getStringCellValue());
						break;
					case 44:
						cell.setCellType(CellType.STRING);
						sourcedata.setRole(cell.getStringCellValue());
						break;
					case 45:
						cell.setCellType(CellType.STRING);
						sourcedata.setBillability(cell.getStringCellValue());
						break;
					case 46:
						cell.setCellType(CellType.STRING);
						sourcedata.setPositionID(cell.getStringCellValue());
						break;	
					case 47:
						cell.setCellType(CellType.STRING);
						sourcedata.setAllocationPercentage(cell.getStringCellValue());
						break;		
					case 48:
						cell.setCellType(CellType.STRING);
						sourcedata.setLastTransactionDate(cell.getStringCellValue());
						break;
					case 49:
						cell.setCellType(CellType.STRING);
						sourcedata.setFutureProjectCode(cell.getStringCellValue());
						break;	
					case 50:
						cell.setCellType(CellType.STRING);
						sourcedata.setLastclientgroupname(cell.getStringCellValue());
						break;
					case 51:
						cell.setCellType(CellType.STRING);
						sourcedata.setBenchstatusISW(cell.getStringCellValue());
						break;
					case 52:
						cell.setCellType(CellType.STRING);
						sourcedata.setSkillGroup(cell.getStringCellValue());
						break;
					case 53:
						cell.setCellType(CellType.STRING);
						sourcedata.setBookingID(cell.getStringCellValue());
						break;
					case 54:
						cell.setCellType(CellType.STRING);
						sourcedata.setTypeOfProject(cell.getStringCellValue());
						break;
					case 55:
						cell.setCellType(CellType.STRING);
						sourcedata.setFutureAccountName(cell.getStringCellValue());
						break;
					case 56:
						cell.setCellType(CellType.STRING);
						sourcedata.setFutureProjectCode(cell.getStringCellValue());
						break;
					case 57:
						cell.setCellType(CellType.STRING);
						sourcedata.setOrganizationBU(cell.getStringCellValue());
						break;
					case 58:
						cell.setCellType(CellType.STRING);
						sourcedata.setNewBU(cell.getStringCellValue());
						break;
					case 59:
						cell.setCellType(CellType.STRING);
						sourcedata.setLocationStandardization(cell.getStringCellValue());
						break;
					case 60:
						cell.setCellType(CellType.STRING);
						sourcedata.setBuPortfolios(cell.getStringCellValue());
						break;
					case 61:
						cell.setCellType(CellType.STRING);
						sourcedata.setLastchangeMadeBy(cell.getStringCellValue());
						break;
					case 62:
						cell.setCellType(CellType.STRING);
						sourcedata.setLastchangedate(cell.getStringCellValue());
						break;
					case 63:
						cell.setCellType(CellType.STRING);
						sourcedata.setProjectType(cell.getStringCellValue());
						break;
					case 64:
						cell.setCellType(CellType.STRING);
						sourcedata.setOpportunityName(cell.getStringCellValue());
						break;
					case 65:
						cell.setCellType(CellType.STRING);
						sourcedata.setOpportunityEndDate(cell.getStringCellValue());
						break;
					case 66:
						cell.setCellType(CellType.STRING);
						sourcedata.setBookingType(cell.getStringCellValue());
						break;
					case 67:
						cell.setCellType(CellType.STRING);
						sourcedata.setPracticeType(cell.getStringCellValue());
						break;
					case 68:
						cell.setCellType(CellType.STRING);
						sourcedata.setRegionType(cell.getStringCellValue());
						break;
					case 69:
						cell.setCellType(CellType.STRING);
						sourcedata.setCgstartDate(cell.getStringCellValue());
						break;
					case 70:
						cell.setCellType(CellType.STRING);
						sourcedata.setGroupaccountName(cell.getStringCellValue());
						break;
					default:
						break;
					
					}
					cellId++;
				}
				list.add(sourcedata);				
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return list;
	}


}
