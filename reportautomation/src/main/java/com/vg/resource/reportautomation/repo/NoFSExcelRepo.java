package com.vg.resource.reportautomation.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vg.resource.reportautomation.entity.NoFSExcelEntity;



@Repository
public interface NoFSExcelRepo extends JpaRepository<NoFSExcelEntity,Integer>{
	

}
