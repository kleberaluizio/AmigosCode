package com.kleberaluizio;

import com.kleberaluizio.car.Brand;
import com.kleberaluizio.car.Car;
import com.kleberaluizio.car.CarService;
import com.kleberaluizio.user.User;
import com.kleberaluizio.user.UserService;
import com.kleberaluizio.utility.Menu;

public class Main {
    public static Database database = new Database();

    public static void main(String[] args) {

        Car fiesta = new Car(Brand.FORD, "Fiesta",2020);
        CarService.registerNewCar(fiesta,database);

        Car uno = new Car(Brand.FIAT, "Uno",2019);
        CarService.registerNewCar(uno,database);

        Car gol = new Car(Brand.VOLKSWAGEN, "Gol",2022);
        CarService.registerNewCar(gol,database);

        Car uno1 = new Car(Brand.FIAT, "Uno",2018);
        CarService.registerNewCar(uno1,database);

        User leonel = new User("Pereira","Leonel",74);
        UserService.registerUser(leonel,database);

        User kleber = new User("Vaiz","Kleber",29);
        UserService.registerUser(kleber,database);


//        BookingService.bookCar(fiesta,kleber,database);
//        BookingService.bookCar(uno,kleber,database);
//        BookingService.bookCar(gol,leonel,database);
//
//        System.out.println("=".repeat(20));
//        View.viewAvailableCars(database);
//        System.out.println("=".repeat(20));
//        View.viewAllUsers(database);
//        View.viewBookings(database);

        Menu.showMenu(database);

    }
}
