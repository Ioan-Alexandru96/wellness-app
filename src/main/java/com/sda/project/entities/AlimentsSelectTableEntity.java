package com.sda.project.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "alimentsSelectTable")
public class AlimentsSelectTableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column
    private Integer alimentSelectedId;
    @Column
    private String alimentName;
    @Column
    private long alimentClories;

    @ManyToMany(mappedBy = "alimentsSelectTable")
    private Set<MondayOwnMealEntity> mondayOwnMeal =new HashSet();
    @ManyToMany(mappedBy = "alimentsSelectTable")
    private Set<TuesdayOwnMealEntity> tuesdayOwnMeal =new HashSet();
    @ManyToMany(mappedBy = "alimentsSelectTable")
    private Set<WednesdayOwnMealEntity> wednesdayOwnMeal =new HashSet();
    @ManyToMany(mappedBy = "alimentsSelectTable")
    private Set<ThursdayOwnMealEntity> thursdayOwnMeal =new HashSet();
    @ManyToMany(mappedBy = "alimentsSelectTable")
    private Set<FridayOwnMealEntity> fridayOwnMeal =new HashSet();
    @ManyToMany(mappedBy = "alimentsSelectTable")
    private Set<SaturdayOwnMealEntity> saturdayOwnMeal =new HashSet();
    @ManyToMany(mappedBy = "alimentsSelectTable")
    private Set<SundayOwnMealEntity> sundayOwnMeal =new HashSet();

    private AlimentsSelectTableEntity(){

    }

    public Integer getAlimentSelectedId() {
        return alimentSelectedId;
    }

    public void setAlimentSelectedId(Integer alimentSelectedId) {
        this.alimentSelectedId = alimentSelectedId;
    }

    public String getAlimentName() {
        return alimentName;
    }

    public void setAlimentName(String alimentName) {
        this.alimentName = alimentName;
    }

    public long getAlimentClories() {
        return alimentClories;
    }

    public void setAlimentClories(long alimentClories) {
        this.alimentClories = alimentClories;
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

    public Set<ThursdayOwnMealEntity> getThursdayOwnMeal() {
        return thursdayOwnMeal;
    }

    public void setThursdayOwnMeal(Set<ThursdayOwnMealEntity> thursdayOwnMeal) {
        this.thursdayOwnMeal = thursdayOwnMeal;
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
}
