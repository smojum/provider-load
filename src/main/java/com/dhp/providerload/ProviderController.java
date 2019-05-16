package com.dhp.providerload;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;


@RestController
@Log4j2
public class ProviderController {
    @Autowired
    private PracticeLocationRepository practiceLocationRepository;

    @GetMapping("/find")
    private Iterable<PracticeLocation> getPracticeLocations() {
        return practiceLocationRepository.findAll();
    }

    @GetMapping("/delete")
    private String delete() {
        practiceLocationRepository.deleteAll();
        return "{\"message\"=\"Deleted Successfully\"}";
    }

    @GetMapping("/save")
    private String saveData() throws IOException {
        Reader reader = Files.newBufferedReader(Paths.get("C:\\Users\\smojum\\Downloads\\Facilities.csv"));
        CsvToBean<PracticeLocation> csvToBean = new CsvToBeanBuilder<PracticeLocation>(reader)
                .withType(PracticeLocation.class)
                .withIgnoreLeadingWhiteSpace(true)
                .build();

        Iterator<PracticeLocation> csvUserIterator = csvToBean.iterator();
        log.info(() -> csvUserIterator);
        practiceLocationRepository.saveAll(() -> csvUserIterator);
        return "{\"message\"=\"Saved Successfully\"}";
    }
}
