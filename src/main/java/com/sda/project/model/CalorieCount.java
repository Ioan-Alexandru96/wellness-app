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

}
