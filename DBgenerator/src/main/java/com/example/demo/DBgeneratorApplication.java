package com.example.demo;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.service.NoFSExcelService;





@SpringBootApplication
public class DBgeneratorApplication implements CommandLineRunner{
	
	
	@Autowired
	NoFSExcelService noFSExcelService;

	public static void main(String[] args) {
		SpringApplication.run(DBgeneratorApplication.class, args);
	}
	public void run(String... args){
		String path =args[0];
		File file=new File(path);
		
		System.out.println("Application start");
		noFSExcelService.save(file);
		System.out.println("Application end");
		
}
}
