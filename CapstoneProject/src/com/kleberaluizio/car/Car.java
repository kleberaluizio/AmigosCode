package com.kleberaluizio.car;

public class Car {
    enum Brand{
        FORD,
        VOLKSWAGEN,
        FIAT
    }
    private Brand brand;
    private String model;
    private int year;
    private boolean isBooked;

    public Car(Brand brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.isBooked = false;
    }

    public boolean isBooked(){
        return isBooked;
    }

}
