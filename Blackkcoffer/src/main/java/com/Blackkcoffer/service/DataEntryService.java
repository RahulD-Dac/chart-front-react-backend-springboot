package com.Blackkcoffer.service;


import com.Blackkcoffer.model.DataEntry;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface DataEntryService {

    List<DataEntry> filterByEndYear(int endYear);
    List<DataEntry> filterByRegion(String region);

      List<DataEntry> filterByTopic(String topic);
   List<DataEntry> filterBySector(String sector);
//
  List<DataEntry> filterByPESTLE(String pestle);
   List<DataEntry> filterBySource(String source);
    List<DataEntry> filterBySWOT(String swot);
}

