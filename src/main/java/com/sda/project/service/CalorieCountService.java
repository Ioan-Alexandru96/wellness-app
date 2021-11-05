package com.sda.project.service;

import com.sda.project.model.ActivityLevel;
import com.sda.project.model.CalorieCount;
import com.sda.project.model.Gender;
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

        calculateBMR();
        calculateNoOfCalories();
        repository.save(calorieCount);
    }

    // TODO: private calculate()

    private int age;
    private Gender gender;
    private Integer height;
    private Integer weight;
    private ActivityLevel activityLevel;
    private Double result;
    private Double BMR;

    private Double calculateBMR() {
        if (gender == Gender.MALE) {
            BMR = (10 * weight) + (6.25d * height) - (5d * age) + 5d;
        } else {
            BMR = (10 * weight) + (6.25d * height) - (5d * age) - 161d;
        }
        return BMR;
    }
    //    calorieCalculator:
//Sedentary: Calorie-Calculation = BMR x 1.2
//Moderate: Calorie-Calculation = BMR x 1.55
//active: Calorie-Calculation = BMR x 1.725

    public Double calculateNoOfCalories() {
        if (activityLevel == ActivityLevel.SEDENTARY) {
            return result = 1.2 * calculateBMR();
        } else if (activityLevel == ActivityLevel.MODERATE) {
            return result = 1.55 * calculateBMR();
        } else {
            return result = 1.72 * BMR;
        }
    }
}
