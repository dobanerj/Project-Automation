package com.sourcingexcel.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.sourcingexcel.project.entity.ExcelEntity;
import com.sourcingexcel.project.help.ExcelHelp;
import com.sourcingexcel.project.repo.ExcelRepo;


@Service
public class ExcelService {

	@Autowired
	private ExcelRepo excelRepo;
	
	
	public void save(MultipartFile file)
	{
		try
		{
			List<ExcelEntity> excelData = ExcelHelp.convertExceltoList(file.getInputStream());
			this.excelRepo.saveAll(excelData);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public List<ExcelEntity> getAllData()
	{
		return this.excelRepo.findAll();
	}

}
