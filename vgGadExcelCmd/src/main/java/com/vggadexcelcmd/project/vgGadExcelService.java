package com.vggadexcelcmd.project;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class vgGadExcelService {

	
	@Autowired
	private vgGadRepo vggadrepo;
	
	
	public void save(File file)
	{
		try
		{
			FileInputStream inputstream=new FileInputStream(file);
			List<VgGadExcel> vggadexcel = vgGadHelper.convertExceltoList(inputstream);
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
