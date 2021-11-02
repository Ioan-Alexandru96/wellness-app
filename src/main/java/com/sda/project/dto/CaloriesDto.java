package com.sda.project.dto;

public class CaloriesDto {

    private int age;
    private Boolean gender;
    private int height;
    private int weight;
    private String activity;
    private int result;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "CaloriesDto{" +
                "age=" + age +
                ", gender=" + gender +
                ", height=" + height +
                ", weight=" + weight +
                ", activity='" + activity + '\'' +
                ", result=" + result +
                '}';
    }
}
