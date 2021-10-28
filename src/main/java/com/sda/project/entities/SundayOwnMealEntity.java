package com.sda.project.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table (name = "sundayOwnMeal")
public class SundayOwnMealEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    @Column
    private Integer sundayOwnMealId;
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
    @JoinTable(name ="sundayOwnMeal_alimentsSelected",
            joinColumns = {@JoinColumn(name = "sundayOwnMealId")},
            inverseJoinColumns = {@JoinColumn(name = "alimentSelectedId")})

    private Set<AlimentsSelectTableEntity> alimentsSelectTable = new HashSet();

    public Integer getSundayOwnMealId() {
        return sundayOwnMealId;
    }

    public void setSundayOwnMealId(Integer sundayOwnMealId) {
        this.sundayOwnMealId = sundayOwnMealId;
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
