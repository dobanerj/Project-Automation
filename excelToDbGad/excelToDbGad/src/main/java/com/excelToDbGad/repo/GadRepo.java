package com.excelToDbGad.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excelToDbGad.entity.GadData;


public interface GadRepo extends JpaRepository<GadData,Integer>{

}
