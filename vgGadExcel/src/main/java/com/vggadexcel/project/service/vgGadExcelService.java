package com.vggadexcel.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.vggadexcel.project.entity.VgGadExcel;
import com.vggadexcel.project.helper.vgGadHelper;
import com.vggadexcel.project.repo.vgGadRepo;

@Service
public class vgGadExcelService {
	@Autowired
	private vgGadRepo vggadrepo;
	
	
	public void save(MultipartFile file)
	{
		try
		{
			List<VgGadExcel> vggadexcel = vgGadHelper.convertExceltoList(file.getInputStream());
			this.vggadrepo.saveAll(vggadexcel);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public List<VgGadExcel> getAllData()
	{
		return this.vggadrepo.findAll();
	}

}
