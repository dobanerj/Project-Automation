package com.vg.resource.reportautomation;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vg.resource.reportautomation.service.GadService;
import com.vg.resource.reportautomation.service.NonFSService;
import com.vg.resource.reportautomation.service.ReportService;
import com.vg.resource.reportautomation.service.SourceService;
import com.vg.resource.reportautomation.service.vgVdiDetailService;

@SpringBootApplication
public class ReportautomationApplication implements CommandLineRunner{
	@Autowired
	GadService gadservice;
	
	@Autowired
	SourceService sourceservice;
	
	@Autowired
	ReportService reportservice;
	
	@Autowired
	NonFSService noFSexcelService;
	
	@Autowired
	vgVdiDetailService vgVdidetailService;
	public static void main(String[] args) {
		SpringApplication.run(ReportautomationApplication.class, args);
	}
	public void run(String... args) throws SQLException{
		String path =args[0];
		File file=new File(path);
		
		System.out.println("Application start :GAD");
		gadservice.save(file);
		System.out.println("Application end:GAD");
		
		
		String path1 =args[1];
		File file1=new File(path1);
		
		System.out.println("Application start:Source");
		sourceservice.save(file1);	
		System.out.println("Application END:Source");	
		String path2 =args[2];
		File file2=new File(path2);
		
		System.out.println("Application start:NonFS");
		noFSexcelService.save(file2);
		System.out.println("Application end:NonFS");
		
		String path3 =args[3];
		File file3=new File(path3);
		
		System.out.println("Application start:ODC");
		vgVdidetailService.save(file3);
		System.out.println("Application end:ODC");
		
	
		try {
			reportservice.generateFSExcel();
			reportservice.generateNonFSExcel();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
