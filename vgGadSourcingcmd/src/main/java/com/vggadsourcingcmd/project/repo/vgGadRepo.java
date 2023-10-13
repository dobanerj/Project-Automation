package com.vggadsourcingcmd.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vggadsourcingcmd.project.entity.VgGadExcelEntity;


@Repository
public interface vgGadRepo extends JpaRepository<VgGadExcelEntity,Integer>{

}
