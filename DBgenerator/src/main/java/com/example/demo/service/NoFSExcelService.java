package com.example.demo.service;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.NoFSExcelEntity;
import com.example.demo.entity.repo.NoFSExcelRepo;
import com.example.demo.helper.NoFSExcelHelp;





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
