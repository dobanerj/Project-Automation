package com.example.demo;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.service.DTSourcingVGGadService;
import com.example.demo.service.sourcingExcelService;
import com.example.demo.service.vgGadExcelService;

@SpringBootApplication
public class NewprojectdemoApplication implements CommandLineRunner {
	
	@Autowired
	vgGadExcelService vggadexcelService;
	
	@Autowired
	sourcingExcelService sourcingexcelservice;
	
	@Autowired
	DTSourcingVGGadService dtsourcingVGGadService;

	public static void main(String[] args){
		SpringApplication.run(NewprojectdemoApplication.class, args);
	}
	
		

		public void run(String... args) throws SQLException{
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
				dtsourcingVGGadService.generateExcel();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Application end");
			
		
		}
	
}
