package com.sda.project.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table (name = "wednesdayOwnMeal")
public class WednesdayOwnMealEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    @Column
    private Integer wednesdayOwnMealId;
    @Column
    private String breakfast;
    @Column
    private String lunch;
    @Column
    private String dinner;

    @ManyToOne
    @JoinColumn(name = "userId")
    private UserEntity user;

    @ManyToMany
    @JoinTable(name ="wednesdayOwnMeal_alimentsSelected",
            joinColumns = {@JoinColumn(name = "wednesdayOwnMealId")},
            inverseJoinColumns = {@JoinColumn(name = "alimentSelectedId")})

    private Set<AlimentsSelectTableEntity> alimentsSelectTable = new HashSet();

    public Integer getWednesdayOwnMealId() {
        return wednesdayOwnMealId;
    }

    public void setWednesdayOwnMealId(Integer wednesdayOwnMealId) {
        this.wednesdayOwnMealId = wednesdayOwnMealId;
    }

    public String getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(String breakfast) {
        this.breakfast = breakfast;
    }

    public String getLunch() {
        return lunch;
    }

    public void setLunch(String lunch) {
        this.lunch = lunch;
    }

    public String getDinner() {
        return dinner;
    }

    public void setDinner(String dinner) {
        this.dinner = dinner;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }
}