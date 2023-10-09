package com.vggadexcelcmd.project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface vgGadRepo extends JpaRepository<VgGadExcel,Integer>{

}
