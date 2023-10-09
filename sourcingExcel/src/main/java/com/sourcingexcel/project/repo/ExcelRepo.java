package com.sourcingexcel.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sourcingexcel.project.entity.ExcelEntity;

@Repository
public interface ExcelRepo extends JpaRepository<ExcelEntity,Integer>{

}
