package com.vg.resource.reportautomation.service;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vg.resource.reportautomation.entity.VGNonFSEntity;
import com.vg.resource.reportautomation.helper.NonFSHelp;
import com.vg.resource.reportautomation.repo.vgNonFSRepo;






@Service
public class NonFSService {

	@Autowired
	private vgNonFSRepo noFSExcelRepo;
	
	
	public void save(File file)
	{
		try
		{
			FileInputStream inputstream=new FileInputStream(file);
			List<VGNonFSEntity> noFSExcelEntity = NonFSHelp.convertExceltoList(inputstream);
			this.noFSExcelRepo.saveAll(noFSExcelEntity);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public List<VGNonFSEntity> getAllData()
	{
		return this.noFSExcelRepo.findAll();
	}

}
