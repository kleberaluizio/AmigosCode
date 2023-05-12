package com.kleberaluizio.car;

public class CarDAO { // this kind of name is usually used in interfaces
    private static Car[] cars;
    private static int nextAvailableSlot = 0;
    private static final int CAPACITY = 5;

    static {
        cars = new Car[CAPACITY];
    }

    public void saveCar(Car car){
        // Responsible for add car to data base
        // it's called by CarService
        if (nextAvailableSlot + 1 >= CAPACITY){
            //grow db
        }
        cars[nextAvailableSlot] = car;
        nextAvailableSlot++;
    }

    public Car[] selectAllCars(){
        return cars;
    }
}
