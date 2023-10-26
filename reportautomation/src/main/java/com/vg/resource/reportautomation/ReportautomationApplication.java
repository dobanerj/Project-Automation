package com.vg.resource.reportautomation;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.vg.resource.reportautomation.service.GadService;
import com.vg.resource.reportautomation.service.ReportService;
import com.vg.resource.reportautomation.service.SourceService;
import com.vg.resource.reportautomation.service.VGVdiDetailService;

@SpringBootApplication
@EntityScan(basePackages = "com.vg.resource.reportautomation.entity")
public class ReportautomationApplication implements CommandLineRunner{
	@Autowired
	GadService gadservice;
	
	@Autowired
	SourceService sourceservice;
	
	@Autowired
	ReportService reportservice;
	
	@Autowired
	VGVdiDetailService vgvdidetailservice;
	
	public static void main(String[] args) {
		SpringApplication.run(ReportautomationApplication.class, args);
	}
	public void run(String... args) throws SQLException{
		String path =args[0];
		File file=new File(path);
		
		System.out.println("Application start");
		gadservice.save(file);
		System.out.println("Application end");
		
		
		
		String path1 =args[1];
		File file1=new File(path1);
		
		System.out.println("Application start");
		sourceservice.save(file1);
		
		String path2 =args[2];
		File file2=new File(path2);
		
		System.out.println("Application start");
		vgvdidetailservice.save(file2);
		
	
		try {
			reportservice.generateExcel();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Application end");
		
	
	}

}
