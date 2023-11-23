package com.vg.resource.reportautomation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.vg.resource.reportautomation.entity.VGNonFSEntity;
import com.vg.resource.reportautomation.helper.NonFSHelp;
import com.vg.resource.reportautomation.repo.vgNonFSRepo;

@Service
public class NonFSService {
	@Autowired
	private vgNonFSRepo vgNonFsRepo;
	
	
	public void save(MultipartFile file)
	{
		try
		{
			List<VGNonFSEntity> vgNonfsData = NonFSHelp.convertExceltoList(file.getInputStream());
			this.vgNonFsRepo.saveAll(vgNonfsData);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public List<VGNonFSEntity> getAllData()
	{
		return this.vgNonFsRepo.findAll();
	}
}
