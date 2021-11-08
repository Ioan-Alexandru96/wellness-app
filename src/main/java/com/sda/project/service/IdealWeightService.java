package com.sda.project.service;

import com.sda.project.model.Gender;
import com.sda.project.model.IdealWeight;
import com.sda.project.repository.IdealWeightRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IdealWeightService {

    private static final Logger log = LoggerFactory.getLogger(IdealWeightService.class);

    private final IdealWeightRepository repository;

    @Autowired
    public IdealWeightService(IdealWeightRepository repository) {
        this.repository = repository;
    }

    public void save(IdealWeight idealWeight) {
        log.info("save ideal weight {}", idealWeight);

        calculate(idealWeight);
        repository.save(idealWeight);
    }

    private Double calculate(IdealWeight idealWeight) {
        int height = idealWeight.getHeight();
        int age = idealWeight.getAge();
        Gender gender = idealWeight.getGender();

        switch (gender) {
            case MALE: return height - 100 - ((height - 150) / 4d + (age - 20) / 4d);
            case FEMALE: return height - 100 - ((height - 150) / 2.5 + (age - 20) / 6d);
            default: throw new IllegalArgumentException("no other gender created by God");
        }
    }
}
