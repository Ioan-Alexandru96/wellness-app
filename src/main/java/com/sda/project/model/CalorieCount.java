package com.sda.project.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CalorieCount {

    private int age;
    private Gender gender;
    private Integer height;
    private Integer weight;
    private ActivityLevel activityLevel;
    private Double BMR;
    private Double result;

    @Override
    public String toString() {
        return "CalorieCount{" +
                "age=" + age +
                ", gender=" + gender +
                ", height=" + height +
                ", weight=" + weight +
                ", activityLevel=" + activityLevel +
                ", result=" + result +
                ", BMR=" + BMR +
                '}';
    }
}
