package com.vggadsourcingcmd.project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface sourcingExcelRepo extends JpaRepository<sourcingExcelEntity,Integer>{

}
