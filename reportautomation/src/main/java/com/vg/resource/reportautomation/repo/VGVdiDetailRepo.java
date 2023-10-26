package com.vg.resource.reportautomation.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vg.resource.reportautomation.entity.VGVdiDetailEntity;


@Repository
public interface VGVdiDetailRepo extends JpaRepository<VGVdiDetailEntity,String>{

}
