package com.kleberaluizio.car;

import com.kleberaluizio.Database;

public class CarService {
    private CarDAO carDAO;

    public CarService() {
        this.carDAO = new CarDAO();
    }

    public static boolean isCarBooked(Car car){
        if(car == null){
            return false;
        }
        if (car.isBooked()){
            System.out.println(car.toString() + " is already booked!");
            return false;
        } else {
            return true;
        }

    }

    public static void registerNewCar(Car car, Database data){
        CarDAO.saverCar(car,data);
    }

    public static void bookThisCar(Car car){
        car.setIsBooked(true);
    }


}
