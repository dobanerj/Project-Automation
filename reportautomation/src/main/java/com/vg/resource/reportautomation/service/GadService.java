package com.vg.resource.reportautomation.service;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vg.resource.reportautomation.entity.vgGadEntity;
import com.vg.resource.reportautomation.helper.GadHelper;
import com.vg.resource.reportautomation.repo.vgGadRepo;





@Service
public class GadService {

	
	@Autowired
	private vgGadRepo vggadrepo;
	
	
	public void save(File file)
	{
		try
		{
			FileInputStream inputstream=new FileInputStream(file);
			List<vgGadEntity> vggadexcel = GadHelper.convertExceltoList(inputstream);
			this.vggadrepo.saveAll(vggadexcel);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public List<vgGadEntity> getAllData()
	{
		return this.vggadrepo.findAll();
	}

}
