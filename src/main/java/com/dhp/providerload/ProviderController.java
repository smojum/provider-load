package com.dhp.providerload;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProviderController {
    @Autowired
    private PracticeLocationRepository practiceLocationRepository;

    @GetMapping("/find")
    private Iterable<PracticeLocation> getPracticeLocations() {
        saveData();
        return practiceLocationRepository.findAll();
    }

    private void saveData() {
        practiceLocationRepository.deleteAll();
        PracticeLocation practiceLocation = new PracticeLocation("1277 Deming Way", "", "Madison", "WI", "53717");
        practiceLocationRepository.save(practiceLocation);
    }
}
