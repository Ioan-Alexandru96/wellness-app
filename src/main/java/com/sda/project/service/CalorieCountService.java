package com.sda.project.service;

import com.sda.project.model.ActivityLevel;
import com.sda.project.model.CalorieCount;
import com.sda.project.model.Gender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class CalorieCountService {

    private static final Logger log = LoggerFactory.getLogger(CalorieCountService.class);

    public void save(CalorieCount calorieCount) {
        log.info("save calorie count {}", calorieCount);

        double BMR = calculateBMR(calorieCount);
        calorieCount.setBMR(BMR);

        double numberOfCalories = calculateNoOfCalories(calorieCount);
        calorieCount.setResult(numberOfCalories);
    }

    /**
     * Calculates the number of calories based on activity type
     *      SEDENTARY: BMR x 1.2
     *      MODERATE: BMR x 1.55
     *      ACTIVE: BMR x 1.725
     * @return the number of calories
     */
    public Double calculateNoOfCalories(CalorieCount calorieCount) {
        double BMR = calorieCount.getBMR();
        ActivityLevel activityLevel = calorieCount.getActivityLevel();
        switch (activityLevel) {
            case SEDENTARY: return BMR * 1.2;
            case MODERATE: return BMR * 1.55;
            case ACTIVE: return BMR * 1.72;
            default: throw new IllegalArgumentException("no such activity type");
        }
    }

    /**
     * Calculates the basal metabolic rate based on gender, age, weight, height.
     * @return the Basal Metabolic Rate (BMR)
     */
    private Double calculateBMR(CalorieCount calorieCount) {
        Gender gender = calorieCount.getGender();
        int weight = calorieCount.getWeight();
        int height = calorieCount.getHeight();
        int age = calorieCount.getAge();

        switch (gender) {
            case MALE: return (10 * weight) + (6.25d * height) - (5d * age) + 5d;
            case FEMALE: return (10 * weight) + (6.25d * height) - (5d * age) - 161d;
            default: throw new IllegalArgumentException("no other gender created by God");
        }
    }
}
