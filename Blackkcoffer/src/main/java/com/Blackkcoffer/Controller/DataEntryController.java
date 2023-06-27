package com.Blackkcoffer.Controller;


import com.Blackkcoffer.model.DataEntry;
import com.Blackkcoffer.service.DataEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin("http://localhost:3000")
    @RequestMapping("/dashboard")
    public class DataEntryController {

    private final DataEntryService dataEntryService;

    @Autowired
    public DataEntryController(DataEntryService dataEntryService) {
        this.dataEntryService = dataEntryService;
    }

    // Endpoint for filtering by end year
    @GetMapping("/filterByEndYear/{endYear}")
    public List<DataEntry> filterByEndYear(@PathVariable int endYear) {
        return dataEntryService.filterByEndYear(endYear);
    }

    // Endpoint for filtering by region
    @GetMapping("/filterByRegion/{region}")
    public List<DataEntry> filterByRegion(@PathVariable String region) {
        return dataEntryService.filterByRegion(region);
    }

        // Endpoint for filtering by topic
        @GetMapping("/filterByTopic/{topic}")
        public List<DataEntry> filterByTopic(@PathVariable String topic) {
            return dataEntryService.filterByTopic(topic);
        }

        // Endpoint for filtering by sector
        @GetMapping("/filterBySector/{sector}")
        public List<DataEntry> filterBySector(@PathVariable String sector) {
            return dataEntryService.filterBySector(sector);
        }


    // Endpoint for filtering by source
    @GetMapping("/filterBySource/{source}")
    public List<DataEntry> filterBySource(@PathVariable String source) {
        return dataEntryService.filterBySource(source);
    }

    // Endpoint for filtering by SWOT
        @GetMapping("/filterBySWOT/{swot}")
        public List<DataEntry> filterBySWOT(@PathVariable String swot) {
            return dataEntryService.filterBySWOT(swot);
        }

//         Endpoint for filtering by region


        // Endpoint for filtering by PEST
        @GetMapping("/filterByPESTLE/{pestle}")
        public List<DataEntry> filterByPESTLE(@PathVariable String pestle) {
            return dataEntryService.filterByPESTLE(pestle);
        }






}
