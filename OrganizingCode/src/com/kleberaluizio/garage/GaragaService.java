package com.kleberaluizio.garage;

import com.kleberaluizio.car.Car;

public class GaragaService {

    public boolean addCarToGarage(Car car, Garage garage){
        if(car == null){
            throw new IllegalArgumentException("Car cannot be null");
        }

        int count = 0;
        for (Car c : garage.getCars()) {
            if(c != null){
                count++;
            }
        }

        if(garage.getCapacity() >= count){
            return false;
        }
        // add car to garage
        return true;
    }
}
