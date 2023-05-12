package com.kleberaluizio.user;

import com.kleberaluizio.car.Car;

public class User {
    private String name;
    private int age;
    private Car[] cars;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Car[] getCars(User user){
        return cars;
    }
}
