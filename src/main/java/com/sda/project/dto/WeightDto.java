package com.sda.project.dto;

public class WeightDto {

    private int age;
    private int height;
    private int result;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "WeightDto{" +
                "age=" + age +
                ", height=" + height +
                ", result=" + result +
                '}';
    }
}
