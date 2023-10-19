package com.vg.resource.reportautomation.service;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vg.resource.reportautomation.entity.VGSourceEntity;
import com.vg.resource.reportautomation.helper.SourcelHelp;
import com.vg.resource.reportautomation.repo.VGSourcRepo;



@Service
public class SourceService {

	@Autowired
	private VGSourcRepo sourcingexcelrepo;
	
	
	public void save(File file)
	{
		try
		{
			FileInputStream inputstream=new FileInputStream(file);
			List<VGSourceEntity> sourcingexcelentity = SourcelHelp.convertExceltoList(inputstream);
			this.sourcingexcelrepo.saveAll(sourcingexcelentity);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public List<VGSourceEntity> getAllData()
	{
		return this.sourcingexcelrepo.findAll();
	}

}
