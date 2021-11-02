package com.sda.project.model;

import javax.persistence.*;

@Entity
@Table(name = "dailyCalories")
public class DailyCalories {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column
    private Integer dailyCaloriesId;
    @Column
    private long dailyCaloriesValue;

    @ManyToOne
    @JoinColumn(name = "userId")
    private UserEntity user;

    public Integer getDailyCaloriesId() {
        return dailyCaloriesId;
    }

    public void setDailyCaloriesId(Integer dailyCaloriesId) {
        this.dailyCaloriesId = dailyCaloriesId;
    }

    public long getDailyCaloriesValue() {
        return dailyCaloriesValue;
    }

    public void setDailyCaloriesValue(long dailyCaloriesValue) {
        this.dailyCaloriesValue = dailyCaloriesValue;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }
}
