package com.kleberaluizio.car;

import com.kleberaluizio.user.User;

public class Car {

    private Brand brand;
    private String model;
    private int year;
    private User user;
    private boolean booked;
    private boolean isEletric;


    public Car(Brand brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.booked = false;
        this.isEletric = false;

    }
    public Car(Brand brand, String model, int year, Boolean isEletric) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.booked = false;
        this.isEletric = isEletric;

    }

    public boolean isBooked(){
        return booked;
    }
    public void setIsBooked(boolean booked){
        this.booked = booked;
    }

    public Brand getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return brand + ", " + model + ", " + year;
    }
}
