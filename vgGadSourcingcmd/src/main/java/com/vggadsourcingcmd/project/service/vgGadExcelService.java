package com.vggadsourcingcmd.project.service;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vggadsourcingcmd.project.entity.VgGadExcelEntity;
import com.vggadsourcingcmd.project.helper.vgGadHelper;
import com.vggadsourcingcmd.project.repo.vgGadRepo;


@Service
public class vgGadExcelService {

	
	@Autowired
	private vgGadRepo vggadrepo;
	
	
	public void save(File file)
	{
		try
		{
			FileInputStream inputstream=new FileInputStream(file);
			List<VgGadExcelEntity> vggadexcel = vgGadHelper.convertExceltoList(inputstream);
			this.vggadrepo.saveAll(vggadexcel);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public List<VgGadExcelEntity> getAllData()
	{
		return this.vggadrepo.findAll();
	}

}
