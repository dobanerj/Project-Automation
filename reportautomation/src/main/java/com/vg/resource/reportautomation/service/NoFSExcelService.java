package com.vg.resource.reportautomation.service;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vg.resource.reportautomation.entity.NoFSExcelEntity;
import com.vg.resource.reportautomation.helper.NoFSExcelHelp;
import com.vg.resource.reportautomation.repo.NoFSExcelRepo;






@Service
public class NoFSExcelService {

	@Autowired
	private NoFSExcelRepo noFSExcelRepo;
	
	
	public void save(File file)
	{
		try
		{
			FileInputStream inputstream=new FileInputStream(file);
			List<NoFSExcelEntity> noFSExcelEntity = NoFSExcelHelp.convertExceltoList(inputstream);
			this.noFSExcelRepo.saveAll(noFSExcelEntity);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public List<NoFSExcelEntity> getAllData()
	{
		return this.noFSExcelRepo.findAll();
	}

}
