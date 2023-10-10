package com.excel.exp.jparepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.excel.exp.entity.DbEntity;

import java.util.List;

@Repository
public interface CustomQueryRepository extends JpaRepository<DbEntity, Long> {

    @Query(value = "SELECT sr_No, crew_Id, resource_name, vg_email FROM source_data", nativeQuery = true)
    List<DbEntity> findAll();
}

