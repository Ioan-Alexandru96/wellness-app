package com.sda.project.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "caloriecount")
public class CalorieCount {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
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
            return result = 1.2 * BMR;
        } else if (activityLevel == ActivityLevel.MODERATE) {
            return result = 1.55 * BMR;
        } else {
            return result = 1.72 * BMR;
        }
    }

}
