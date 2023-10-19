package com.example.demo.service;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.VgGadExcelEntity;
import com.example.demo.helper.vgGadHelper;
import com.example.demo.repo.vgGadRepo;




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
