package excelreadersourceservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.excel.demo.project.entity.SourceData;
import com.excel.demo.project.helper.SourceHelper;
import com.excel.demo.project.repo.SourcingRepo;

@Service
public class SourceService {
	@Autowired
	private SourcingRepo sourcingRepo;
	
	
	public void save(MultipartFile file)
	{
		try
		{
			List<SourceData> sourceData = SourceHelper.convertExceltoList(file.getInputStream());
			this.sourcingRepo.saveAll(sourceData);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public List<SourceData> getAllData()
	{
		return this.sourcingRepo.findAll();
	}

}
