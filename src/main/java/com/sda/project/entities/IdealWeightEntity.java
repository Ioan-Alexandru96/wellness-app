package com.sda.project.entities;

import javax.persistence.*;

@Entity
@Table(name = "idealWeight")
public class IdealWeightEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column
    private Integer idealWeightId;
    @Column
    private long idealWeightValue;

    @OneToOne
    @JoinColumn(name = " userId")
    private UserEntity user;

    public Integer getIdealWeightId() {
        return idealWeightId;
    }

    public void setIdealWeightId(Integer idealWeightId) {
        this.idealWeightId = idealWeightId;
    }

    public long getIdealWeightValue() {
        return idealWeightValue;
    }

    public void setIdealWeightValue(long idealWeightValue) {
        this.idealWeightValue = idealWeightValue;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }
}
