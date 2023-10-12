package com.excelgenerate.repo;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.excelgenerate.entity.EntityData;

@Repository
public interface EntityRepo extends JpaRepository<EntityData,Integer>{
	
	//@Query(value = "SELECT * FROM vg_source", nativeQuery = true)

    //List<EntityData> findAll();
	

}

