package com.vg.resource.reportautomation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.vg.resource.reportautomation.entity.vgGadEntity;
import com.vg.resource.reportautomation.helper.GadHelper;
import com.vg.resource.reportautomation.repo.vgGadRepo;

@Service
public class GadService {
	@Autowired
	private vgGadRepo vggadRepo;
	
	
	public void save(MultipartFile file)
	{
		try
		{
			List<vgGadEntity> vggadData = GadHelper.convertExceltoList(file.getInputStream());
			this.vggadRepo.saveAll(vggadData);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public List<vgGadEntity> getAllData()
	{
		return this.vggadRepo.findAll();
	}
}
