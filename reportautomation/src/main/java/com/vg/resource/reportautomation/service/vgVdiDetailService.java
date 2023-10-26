package com.vg.resource.reportautomation.service;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vg.resource.reportautomation.entity.VGVdiDetailEntity;
import com.vg.resource.reportautomation.helper.VGVdiDetailHelper;
import com.vg.resource.reportautomation.repo.vgVdiDetailRepo;

@Service
public class vgVdiDetailService {

	@Autowired
	private vgVdiDetailRepo vgvdirepo;
	
	
	public void save(File file)
	{
		try
		{
			FileInputStream inputstream=new FileInputStream(file);
			List<VGVdiDetailEntity> vgvdientity = VGVdiDetailHelper.convertExceltoList(inputstream);
			this.vgvdirepo.saveAll(vgvdientity);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public List<VGVdiDetailEntity> getAllData()
	{
		return this.vgvdirepo.findAll();
	}

}
