package com.vggadsourcingcmd.project;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


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
