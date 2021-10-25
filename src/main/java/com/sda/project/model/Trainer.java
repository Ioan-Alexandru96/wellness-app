package com.sda.project.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Trainer {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;

}
