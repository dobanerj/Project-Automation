package com.vggadexcel.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vggadexcel.project.entity.VgGadExcel;
@Repository
public interface vgGadRepo extends JpaRepository<VgGadExcel,Integer>{

}
