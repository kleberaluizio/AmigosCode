package com.kleberaluizio.booking;

import com.kleberaluizio.Database;
import com.kleberaluizio.car.Car;
import com.kleberaluizio.car.CarService;
import com.kleberaluizio.user.User;
import com.kleberaluizio.user.UserService;

public class BookingService {

    public static boolean bookCar(Car car, User user, Database database){
        boolean flag = CarService.isCarBooked(car);
        int index=-1;

        if(!flag){
            return false;
        }

        index = UserService.verifyUser(user, car, database);
        if (index == -1){
            return false;
        } else {

            for (Booking booking : database.getBookings()) {
                if(booking != null && booking.getUser().equals(user)){
                    booking.add(car,1);
                    CarService.bookThisCar(car);
                    return true;
                }
            }
            BookingDAO.saveBooking(new Booking(user, car), database);
            CarService.bookThisCar(car);
            UserService.hasBookedCar(user);

            printBooked(car, user);
            return true;
        }
    }

    public static void printBooked(Car car, User user){
        System.out.println(car.toString()+ " was successfully booked to " + user.toString() + ".");

    }
}

