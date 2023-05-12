package com.kleberaluizio;

import com.kleberaluizio.car.Car;
import com.kleberaluizio.car.CarService;

import java.math.BigDecimal;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Packages
        // Domain / Model
            /* Domain/model classes are not relate to business logic, they represent real-world entities
             and concepts within software application. They define behaviour and attributes of a object.
             */
        // Service Classes -> business logic
             /* These classes are responsible for implementing the business logic and coordinating the interactions
              between the domain/model classes and the data access layer (typically represented by DAO classes)
             */
        // DAO (Data Access Object) Classes
             /* DAO (Data Access Object) classes are responsible for handling the interaction with a data source,
              such as a relational database, a file system, or an external API. They provide an abstraction layer
              between the application's business logic (service layer) and the underlying data storage.
              */
        carsExample();
        // Controllets / REST API
        // Utility class
            /* Utility classes in Java are a type of class that contains static methods and helper functions,
              typically used to provide common functionality or perform generic operations that are not tied
              to a specific object or domain (Normally).
             */
        // Utility classes
        // Configuration class

    }
    private static void carsExample(){
        Car car = new Car(
                "1234",
                BigDecimal.TEN);

        CarService carService = new CarService();
        carService.registerNewCar(car);
        System.out.println(Arrays.toString(carService.getCars()));
    }
}
