package com.sda.project.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "idealweight")
public class IdealWeight {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int age;
    private Gender gender;
    private Integer height;

    @Override
    public String toString() {
        return "IdealWeight{" +
                "id=" + id +
                ", age=" + age +
                ", gender=" + gender +
                ", height=" + height +
                '}';
    }
}
