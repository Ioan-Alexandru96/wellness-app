package com.sda.project.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "user")
public class UserEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    @Column
    private Integer userId;
    @Column
    private String userName;
    @Column
    private String email;
    @Column
    private String password;

    @OneToMany(mappedBy = "user")
    private Set<DailyCalories> caloriesValue = new HashSet();

    @OneToMany(mappedBy = "user")
    private Set<MondayOwnMealEntity> mondayOwnMeal = new HashSet();

    @OneToMany(mappedBy = "user")
    private Set<TuesdayOwnMealEntity> tuesdayOwnMeal = new HashSet();

    @OneToMany(mappedBy = "user")
    private Set<WednesdayOwnMealEntity> wednesdayOwnMeal = new HashSet();

    @OneToMany(mappedBy = "user")
    private Set<ThursdayOwnMealEntity> thurdayOwnMeal = new HashSet();

    @OneToMany(mappedBy = "user")
    private Set<FridayOwnMealEntity> fridayOwnMeal = new HashSet();

    @OneToMany(mappedBy = "user")
    private Set<SaturdayOwnMealEntity> saturdayOwnMeal = new HashSet();

    @OneToMany(mappedBy = "user")
    private Set<SundayOwnMealEntity> sundayOwnMeal = new HashSet();

    @OneToOne
    private Set<IdealWeightEntity> idealWeight = new HashSet();

    public UserEntity(){

    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<DailyCalories> getCaloriesValue() {
        return caloriesValue;
    }

    public void setCaloriesValue(Set<DailyCalories> caloriesValue) {
        this.caloriesValue = caloriesValue;
    }

    public Set<MondayOwnMealEntity> getMondayOwnMeal() {
        return mondayOwnMeal;
    }

    public void setMondayOwnMeal(Set<MondayOwnMealEntity> mondayOwnMeal) {
        this.mondayOwnMeal = mondayOwnMeal;
    }

    public Set<TuesdayOwnMealEntity> getTuesdayOwnMeal() {
        return tuesdayOwnMeal;
    }

    public void setTuesdayOwnMeal(Set<TuesdayOwnMealEntity> tuesdayOwnMeal) {
        this.tuesdayOwnMeal = tuesdayOwnMeal;
    }

    public Set<WednesdayOwnMealEntity> getWednesdayOwnMeal() {
        return wednesdayOwnMeal;
    }

    public void setWednesdayOwnMeal(Set<WednesdayOwnMealEntity> wednesdayOwnMeal) {
        this.wednesdayOwnMeal = wednesdayOwnMeal;
    }

    public Set<ThursdayOwnMealEntity> getThurdayOwnMeal() {
        return thurdayOwnMeal;
    }

    public void setThurdayOwnMeal(Set<ThursdayOwnMealEntity> thurdayOwnMeal) {
        this.thurdayOwnMeal = thurdayOwnMeal;
    }

    public Set<FridayOwnMealEntity> getFridayOwnMeal() {
        return fridayOwnMeal;
    }

    public void setFridayOwnMeal(Set<FridayOwnMealEntity> fridayOwnMeal) {
        this.fridayOwnMeal = fridayOwnMeal;
    }

    public Set<SaturdayOwnMealEntity> getSaturdayOwnMeal() {
        return saturdayOwnMeal;
    }

    public void setSaturdayOwnMeal(Set<SaturdayOwnMealEntity> saturdayOwnMeal) {
        this.saturdayOwnMeal = saturdayOwnMeal;
    }

    public Set<SundayOwnMealEntity> getSundayOwnMeal() {
        return sundayOwnMeal;
    }

    public void setSundayOwnMeal(Set<SundayOwnMealEntity> sundayOwnMeal) {
        this.sundayOwnMeal = sundayOwnMeal;
    }

    public Set<IdealWeightEntity> getIdealWeight() {
        return idealWeight;
    }

    public void setIdealWeight(Set<IdealWeightEntity> idealWeight) {
        this.idealWeight = idealWeight;
    }
}
