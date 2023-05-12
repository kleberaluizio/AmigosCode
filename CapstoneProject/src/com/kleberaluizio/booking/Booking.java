package com.kleberaluizio.booking;

import com.kleberaluizio.car.Car;
import com.kleberaluizio.user.User;

import java.util.Arrays;

public class Booking {

    private User user;
    private Car[] cars;
    private static final int CAPACITY = 2;

    public Booking(User user, Car car){
        this.user = user;
        this.cars = new Car[CAPACITY];
        cars[0] = car;

    }

    public User getUser(){
        return user;
    }
    public Car[] getCars(){
        return cars;
    }

    public void add(Car car, int index){
        cars[index] = car;
    }

    @Override
    public String toString() {
        return  user.getId().toString() + ": cars=" + Arrays.toString(cars) ;
    }
}
