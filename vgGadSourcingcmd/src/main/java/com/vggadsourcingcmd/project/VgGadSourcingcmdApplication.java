package com.vggadsourcingcmd.project;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vggadsourcingcmd.project.service.DatabaseToExcelSourcingService;
import com.vggadsourcingcmd.project.service.DatabaseToExcelVgGadService;
import com.vggadsourcingcmd.project.service.sourcingExcelService;
import com.vggadsourcingcmd.project.service.vgGadExcelService;

@SpringBootApplication
public class VgGadSourcingcmdApplication implements CommandLineRunner{

	@Autowired
	vgGadExcelService vggadexcelService;
	
	@Autowired
	sourcingExcelService sourcingexcelservice;
	
	@Autowired
	DatabaseToExcelSourcingService databaseToExcelSourcingService;
	
	@Autowired
	DatabaseToExcelVgGadService databaseToExcelVgGadService;
	
	public static void main(String[] args) {
		SpringApplication.run(VgGadSourcingcmdApplication.class, args);
	}
	public void run(String... args){
		String path =args[0];
		File file=new File(path);
		
		System.out.println("Application start");
		vggadexcelService.save(file);
		System.out.println("Application end");
		
		
		
		String path1 =args[1];
		File file1=new File(path1);
		
		System.out.println("Application start");
		sourcingexcelservice.save(file1);
		
	
		try {
			databaseToExcelSourcingService.generateExcel();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			databaseToExcelVgGadService.generateExcel();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Application end");
		
		
		
	}
}