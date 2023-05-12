package com.kleberaluizio.car;

public class CarService {

    private CarDAO carDAO;

    public CarService(){
        this.carDAO = new CarDAO();
    }
    public int registerNewCar(Car car){
        // check if car is not null
        // check if reg number is valid
        // check if reg number is not taken
        // if price is < 0
        carDAO.saveCar(car);
        return 1;
    }

    public Car[] getCars(){
        return carDAO.selectAllCars();
    }
}
