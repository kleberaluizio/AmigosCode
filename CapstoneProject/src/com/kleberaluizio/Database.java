package com.kleberaluizio;

import com.kleberaluizio.booking.Booking;
import com.kleberaluizio.car.Car;
import com.kleberaluizio.user.User;

public class Database {
    private Car[] carFleet = new Car[4];
    public static int FLEET_INDEX = 0;

    private User[] users = new User[4];
    public static int USERS_INDEX = 0;

    private Booking[] bookings = new Booking[4];
    public static int BOOKING_INDEX = 0;


    public Booking[] getBookings(){
        return bookings;
    }

    public void setBookings(Booking booking){
        bookings[BOOKING_INDEX] = booking;
        BOOKING_INDEX++;
    }

    public void setCarFleet(Car car){
        carFleet[FLEET_INDEX] = car;
        FLEET_INDEX++;
    }

    public void setUsers(User user){
        users[USERS_INDEX] = user;
        USERS_INDEX++;
    }

    public void showFleet(){
        for (Car car : carFleet) {
            if (car == null){
                continue;
            }
            System.out.println(car);
        }
    }

//    public void showUsers(){
//        for (User user : users) {
//            if (user == null){
//                continue;
//            }
//            System.out.println(user);
//        }
//    }
    public User showUsers(){
        int count = 0;
        for (User user : users) {
            if (user == null){
                continue;
            }
            count++;
        }
    }

    public void showBookings(){
        for (Booking bo : bookings) {
            if (bo == null){
                continue;
            }
            System.out.println(bo);
        }
    }


}
