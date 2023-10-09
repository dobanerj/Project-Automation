package com.vggadexcelcmd.project;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VgGadExcelCmdApplication implements CommandLineRunner{

	@Autowired
	vgGadExcelService vggadexcelService;
	
	public static void main(String[] args) {
		SpringApplication.run(VgGadExcelCmdApplication.class, args);
	}
	public void run(String... args){
		String path =args[0];
		File file=new File(path);
		
		System.out.println("Application start");
		vggadexcelService.save(file);
		System.out.println("Application end");
		
	}

}
