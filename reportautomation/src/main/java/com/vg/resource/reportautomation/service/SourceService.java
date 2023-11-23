package com.vg.resource.reportautomation.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.vg.resource.reportautomation.entity.VGSourceEntity;
import com.vg.resource.reportautomation.helper.SourcelHelp;
import com.vg.resource.reportautomation.repo.VGSourcRepo;



@Service
public class SourceService {
	@Autowired
	private VGSourcRepo sourcingRepo;
	
	
	public void save(MultipartFile file)
	{
		try
		{
			List<VGSourceEntity> sourceData = SourcelHelp.convertExceltoList(file.getInputStream());
			this.sourcingRepo.saveAll(sourceData);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public List<VGSourceEntity> getAllData()
	{
		return this.sourcingRepo.findAll();
	}


}
