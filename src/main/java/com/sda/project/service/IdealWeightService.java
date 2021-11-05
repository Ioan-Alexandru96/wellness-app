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
        log.info("save ideal weight ", idealWeight);

        idealWeightCalculate();
        repository.save(idealWeight);
    }
    private int age = 0;
    private Gender gender ;
    private Integer height ;
    private double result;

    private Double idealWeightCalculate() {
        if (gender == Gender.MALE){
            result = height - 100 -((height - 150)/4 +(age - 20)/4);
        }else if(gender == Gender.FEMALE){
            result = height - 100 -((height - 150)/2.5 +(age - 20)/6);
        }return result;
    }
}
