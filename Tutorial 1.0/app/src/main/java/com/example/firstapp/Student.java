package com.example.firstapp;

public class Student {
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    protected String name;
    protected int age;
    protected double grade;

    public Student(String name, int age, double grade, double height, boolean gender, double weight) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.height = height;
        this.gender = gender;
        this.weight = weight;
    }

    protected double height;
    protected boolean gender;
    protected double weight;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}


