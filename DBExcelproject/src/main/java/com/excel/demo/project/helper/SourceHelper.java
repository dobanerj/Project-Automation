package com.excel.demo.project.helper;

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

import com.excel.demo.project.entity.SourceData;
import com.excel.demo.project.repo.SourcingRepo;



public class SourceHelper {
	@Autowired
	private SourcingRepo sourcingRepo;
	
	public static boolean checkExcelFormat(MultipartFile file)
	{
		String contentType = file.getContentType();
		if(contentType.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"))
		{
			return true;
		}
		return false;
	}
	
	public static List<SourceData> convertExceltoList(InputStream is)
	{
		List<SourceData> list = new ArrayList<>();
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
				SourceData sourcedata = new SourceData();
				while(cells.hasNext())
				{
					Cell cell = cells.next();
					switch(cellId)
					{
					case 0:
						sourcedata.setSrNo((int)cell.getNumericCellValue());
						break;
					case 1:
						sourcedata.setCrewId((long)cell.getNumericCellValue());
						break;
					case 2:
						cell.setCellType(CellType.STRING);
						sourcedata.setLi_lr_id(cell.getStringCellValue());
						break;
					case 3:
						sourcedata.setGgid(cell.getNumericCellValue());
						break;
					case 4:
						cell.setCellType(CellType.STRING);
						sourcedata.setResource_name(cell.getStringCellValue());
						break;
					case 5:
						cell.setCellType(CellType.STRING);
						sourcedata.setCap_email_id(cell.getStringCellValue());
						break;
					case 6:
						cell.setCellType(CellType.STRING);
						sourcedata.setVg_email(cell.getStringCellValue());
						break;
					case 7:
						cell.setCellType(CellType.STRING);
						sourcedata.setCg_manager(cell.getStringCellValue());;
						break;
					case 8:
						cell.setCellType(CellType.STRING);
						sourcedata.setVg_manager(cell.getStringCellValue());
						break;
					case 9:
						cell.setCellType(CellType.STRING);
						sourcedata.setLevel(cell.getStringCellValue());
						break;
					case 10:
						cell.setCellType(CellType.STRING);
						sourcedata.setGrade_revised(cell.getStringCellValue());
						break;
					case 11:
						cell.setCellType(CellType.STRING);
						sourcedata.setLocal_grade(cell.getStringCellValue());
						break;
					case 12:
						cell.setCellType(CellType.STRING);
						sourcedata.setRegion(cell.getStringCellValue());
						break;
					case 13:
						cell.setCellType(CellType.STRING);
						sourcedata.setRegion_revised(cell.getStringCellValue());
						break;
					case 14:
						cell.setCellType(CellType.STRING);
						sourcedata.setGad_cost_center(cell.getStringCellValue());
						break;
					case 15:
						cell.setCellType(CellType.STRING);
						sourcedata.setProject_code(cell.getStringCellValue());
						break;
					case 16:
						cell.setCellType(CellType.STRING);
						sourcedata.setProject_name(cell.getStringCellValue());
						break;
					case 17:
						cell.setCellType(CellType.STRING);
						sourcedata.setJob_title(cell.getStringCellValue());
						break;
					case 18:
						cell.setCellType(CellType.STRING);
						sourcedata.setSkill(cell.getStringCellValue());
						break;
					case 19:
						cell.setCellType(CellType.STRING);
						sourcedata.setPractice(cell.getStringCellValue());
						break;
					case 20:
						cell.setCellType(CellType.STRING);
						sourcedata.setSub_practice(cell.getStringCellValue());
						break;
					case 21:
						cell.setCellType(CellType.STRING);
						sourcedata.setPo(cell.getStringCellValue());
						break;
					case 22:
						cell.setCellType(CellType.STRING);
						sourcedata.setSow_name(cell.getStringCellValue());
						break;
					case 23:
						cell.setCellType(CellType.STRING);
						sourcedata.setSow_id(cell.getStringCellValue());
						break;
					case 24:
						cell.setCellType(CellType.STRING);
						sourcedata.setSow_start_date(cell.getStringCellValue());
						break;
					case 25:
						cell.setCellType(CellType.STRING);
						sourcedata.setSow_end_date(cell.getStringCellValue());
						break;
					case 26:
						cell.setCellType(CellType.STRING);
						sourcedata.setExhibit_type(cell.getStringCellValue());
						break;
					case 27:
						cell.setCellType(CellType.STRING);
						sourcedata.setResource_type(cell.getStringCellValue());
						break;
					case 28:
						cell.setCellType(CellType.STRING);
						sourcedata.setHours(cell.getStringCellValue());
						break;
					case 29:
						cell.setCellType(CellType.STRING);
						sourcedata.setHourly_rate(cell.getStringCellValue());
						break;
					case 30:
						cell.setCellType(CellType.STRING);
						sourcedata.setAmount(cell.getStringCellValue());
						break;
					case 31:
						cell.setCellType(CellType.STRING);
						sourcedata.setRole_start_date(cell.getStringCellValue());
						break;
					case 32:
						cell.setCellType(CellType.STRING);
						sourcedata.setRole_end_date(cell.getStringCellValue());
						break;
					case 33:
						cell.setCellType(CellType.STRING);
						sourcedata.setLocation(cell.getStringCellValue());
						break;
					case 34:
						cell.setCellType(CellType.STRING);
						sourcedata.setLocation_vg(cell.getStringCellValue());
						break;
					case 35:
						cell.setCellType(CellType.STRING);
						sourcedata.setTotal_contract_amount(cell.getStringCellValue());
						break;
					case 36:
						cell.setCellType(CellType.STRING);
						sourcedata.setPayment_type(cell.getStringCellValue());
						break;
					case 37:
						cell.setCellType(CellType.STRING);
						sourcedata.setComments(cell.getStringCellValue());
						break;
					case 38:
						cell.setCellType(CellType.STRING);
						sourcedata.setSbu(cell.getStringCellValue());
						break;
					case 39:
						cell.setCellType(CellType.STRING);
						sourcedata.setFs_non_fs_subk(cell.getStringCellValue());
						break;
					case 40:
						cell.setCellType(CellType.STRING);
						sourcedata.setTotal_contract_amount(cell.getStringCellValue());
						break;
					case 41:
						cell.setCellType(CellType.STRING);
						sourcedata.setBu_portfolios(cell.getStringCellValue());
						break;
					case 42:
						cell.setCellType(CellType.STRING);
						sourcedata.setLob(cell.getStringCellValue());
						break;
					case 43:
						cell.setCellType(CellType.STRING);
						sourcedata.setDe(cell.getStringCellValue());
						break;
					case 44:
						cell.setCellType(CellType.STRING);
						sourcedata.setEm(cell.getStringCellValue());
						break;
					case 45:
						cell.setCellType(CellType.STRING);
						sourcedata.setFs_non_fs_subk(cell.getStringCellValue());
						break;
					case 46:
						cell.setCellType(CellType.STRING);
						sourcedata.setCurrent_status(cell.getStringCellValue());
						break;
					case 47:
						cell.setCellType(CellType.STRING);
						sourcedata.setEnd_date(cell.getStringCellValue());
						break;
					case 48:
						cell.setCellType(CellType.STRING);
						sourcedata.setHard_token_id(cell.getStringCellValue());
						break;
					case 49:
						cell.setCellType(CellType.STRING);						sourcedata.setDesk_location(cell.getStringCellValue());
						break;
					case 50:
						sourcedata.setThin_client_id(cell.getStringCellValue());
						break;
					case 51:
						cell.setCellType(CellType.STRING);
						sourcedata.setCard_no(cell.getStringCellValue());
						break;
					case 52:
						cell.setCellType(CellType.STRING);
						sourcedata.setOdc_access(cell.getStringCellValue());
						break;
					case 53:
						cell.setCellType(CellType.STRING);
						sourcedata.setLaptop_surrendered(cell.getStringCellValue());
						break;
					case 54:
						cell.setCellType(CellType.STRING);
						sourcedata.setAwb_no(cell.getStringCellValue());
						break;
					case 55:
						cell.setCellType(CellType.STRING);
						sourcedata.setCourier_delivery_partner(cell.getStringCellValue());
						break;
					case 56:
						cell.setCellType(CellType.STRING);
						sourcedata.setThin_client_id(cell.getStringCellValue());
						break;
					case 57:
						cell.setCellType(CellType.STRING);
						sourcedata.setDelivered_on(cell.getStringCellValue());
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
