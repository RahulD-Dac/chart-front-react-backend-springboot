package com.Blackkcoffer.Repo;

import com.Blackkcoffer.model.DataEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DataEntryRepository extends JpaRepository<DataEntry, Integer> {


    List<DataEntry> findByEndYear(int endYear);
    List<DataEntry> findByRegion(String region);
   List<DataEntry> findByTopic(String topic);
  List<DataEntry> findBySector(String sector);
//
   List<DataEntry> findByPESTLE(String pestle);
   List<DataEntry> findBySource(String source);
    List<DataEntry> findBySWOT(String swot);
}
