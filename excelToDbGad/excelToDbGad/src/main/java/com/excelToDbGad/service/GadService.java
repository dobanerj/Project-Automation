package com.excelToDbGad.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.excelToDbGad.entity.GadData;
import com.excelToDbGad.helper.GadHelper;
import com.excelToDbGad.repo.GadRepo;


@Service
public class GadService {
	
	@Autowired
	private GadRepo gadRepo;
	
	public void save(MultipartFile file)
	{
		try
		{
			List<GadData> sourceData = GadHelper.convertExceltoList(file.getInputStream());
			this.gadRepo.saveAll(sourceData);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public List<GadData> getAllData()
	{
		return this.gadRepo.findAll();
	}
	

}
