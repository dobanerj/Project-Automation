package com.example.demo.entity.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.NoFSExcelEntity;


@Repository
public interface NoFSExcelRepo extends JpaRepository<NoFSExcelEntity,Integer>{
	

}
