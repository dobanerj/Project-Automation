package com.vggadsourcingcmd.project.service;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vggadsourcingcmd.project.entity.sourcingExcelEntity;
import com.vggadsourcingcmd.project.helper.sourcingExcelHelp;
import com.vggadsourcingcmd.project.repo.sourcingExcelRepo;


@Service
public class sourcingExcelService {

	@Autowired
	private sourcingExcelRepo sourcingexcelrepo;
	
	
	public void save(File file)
	{
		try
		{
			FileInputStream inputstream=new FileInputStream(file);
			List<sourcingExcelEntity> sourcingexcelentity = sourcingExcelHelp.convertExceltoList(inputstream);
			this.sourcingexcelrepo.saveAll(sourcingexcelentity);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public List<sourcingExcelEntity> getAllData()
	{
		return this.sourcingexcelrepo.findAll();
	}

}
