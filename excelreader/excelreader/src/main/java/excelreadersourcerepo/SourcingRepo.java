package excelreadersourcerepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import excelreaderentity.SourceData;

@Repository
public interface SourcingRepo extends JpaRepository<SourceData,Integer>{

}
