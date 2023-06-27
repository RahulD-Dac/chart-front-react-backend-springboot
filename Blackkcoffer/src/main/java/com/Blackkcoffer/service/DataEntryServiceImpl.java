package com.Blackkcoffer.service;

import com.Blackkcoffer.Repo.DataEntryRepository;
import com.Blackkcoffer.model.DataEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataEntryServiceImpl implements DataEntryService {

    @Autowired
    private DataEntryRepository dataEntryRepository;


    @Autowired
    public DataEntryServiceImpl(DataEntryRepository dataEntryRepository) {
        this.dataEntryRepository = dataEntryRepository;
    }

    @Override
    public List<DataEntry> filterByEndYear(int endYear) {
        return dataEntryRepository.findByEndYear(endYear);
    }

    @Override
    public List<DataEntry> filterByRegion(String region) {
        return dataEntryRepository.findByRegion(region);
    }


    @Override
    public List<DataEntry> filterByTopic(String topic) {
        // Implement logic to filter data by topic
        return dataEntryRepository.findByTopic(topic);
    }

   @Override
        public List<DataEntry> filterBySector(String sector) {
            // Implement logic to filter data by sector
            return dataEntryRepository.findBySector(sector);
    }

    @Override
    public List<DataEntry> filterBySource(String source) {
        // Implement logic to filter data by source
        return dataEntryRepository.findBySource(source);
    }


    @Override
    public List<DataEntry> filterByPESTLE(String pestle) {
        // Implement logic to filter data by PEST
        return dataEntryRepository.findByPESTLE(pestle);
    }



    @Override
    public List<DataEntry> filterBySWOT(String swot) {
        // Implement logic to filter data by SWOT
        return dataEntryRepository.findBySWOT(swot);
    }
}