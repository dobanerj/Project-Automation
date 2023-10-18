package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.demo.helper.reportHelper;

@Repository
public interface reportRepo extends JpaRepository<reportHelper,String>{

	@Query(value = "select vg_gad_excel.li_lr_id, vg_gad_excel.per_nr, vg_gad_excel.local_grade, vg_gad_excel.region,vg_gad_excel.project_name, vg_gad_excel.practice, vg_gad_excel.sub_practice, vg_gad_excel.bu_portfolios, vg_sourcing.ggid, vg_sourcing.amount, vg_sourcing.comment, vg_sourcing.hourly_rate, vg_sourcing.hours, vg_sourcing.job_role, vg_sourcing.level, vg_sourcing.po, vg_sourcing.primaryskill, vg_sourcing.resource_name, vg_sourcing.role_end_date, vg_sourcing.role_start_date, vg_sourcing.sow_id, vg_sourcing.status, vg_sourcing.total_contract_amount, vg_sourcing.vgcrew_id from vg_sourcing join vg_gad_excel on vg_sourcing.ggid=vg_gad_excel.ggid;", nativeQuery = true)
	public List<reportHelper> report();
	
}
