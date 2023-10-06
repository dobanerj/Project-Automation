package com.excel.demo.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.excel.demo.project.entity.SourceData;

@Repository
public interface SourcingRepo extends JpaRepository<SourceData,Integer>{
	
	//public SourceData saveSourceData(SourceData srcdata);
	

}
