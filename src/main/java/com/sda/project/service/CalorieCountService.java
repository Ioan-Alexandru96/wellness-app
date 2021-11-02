package com.sda.project.service;

import com.sda.project.model.CalorieCount;
import com.sda.project.repository.CalorieCountRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalorieCountService {

    private static final Logger log = LoggerFactory.getLogger(CalorieCountService.class);

    private final CalorieCountRepository repository;

    @Autowired
    public CalorieCountService(CalorieCountRepository repository) {
        this.repository = repository;
    }

    public void save(CalorieCount calorieCount) {
        log.info("save calorie count {}", calorieCount);

        // TODO: call calculate()
        repository.save(calorieCount);
    }

    // TODO: private calculate()
}
