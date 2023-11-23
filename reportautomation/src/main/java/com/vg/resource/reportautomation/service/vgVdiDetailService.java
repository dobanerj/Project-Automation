package com.vg.resource.reportautomation.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.vg.resource.reportautomation.entity.VGVdiDetailEntity;
import com.vg.resource.reportautomation.helper.VGVdiDetailHelper;
import com.vg.resource.reportautomation.repo.vgVdiDetailRepo;

@Service
public class vgVdiDetailService {
	
	@Autowired
	private vgVdiDetailRepo vgvdidetailRepo;
	
	
	public void save(MultipartFile file)
	{
		try
		{
			List<VGVdiDetailEntity> sourceData = VGVdiDetailHelper.convertExceltoList(file.getInputStream());
			this.vgvdidetailRepo.saveAll(sourceData);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public List<VGVdiDetailEntity> getAllData()
	{
		return this.vgvdidetailRepo.findAll();
	}

}
