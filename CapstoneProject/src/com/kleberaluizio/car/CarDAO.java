package com.kleberaluizio.car;

import com.kleberaluizio.Database;

public class CarDAO {

    public static void saverCar(Car car, Database database){
        database.setCarFleet(car);
    }
}
