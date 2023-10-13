package com.vggadsourcingcmd.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vggadsourcingcmd.project.entity.sourcingExcelEntity;

@Repository
public interface sourcingExcelRepo extends JpaRepository<sourcingExcelEntity,Integer>{

}
