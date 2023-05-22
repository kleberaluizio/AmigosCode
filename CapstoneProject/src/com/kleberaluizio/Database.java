package com.kleberaluizio;

import com.kleberaluizio.booking.Booking;
import com.kleberaluizio.car.Car;
import com.kleberaluizio.user.User;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private Car[] carFleet = new Car[10];
    public static int FLEET_INDEX = 0;

    private User[] users = new User[4];
    public static int USERS_INDEX = 0;

    private Booking[] bookings = new Booking[4];
    public static int BOOKING_INDEX = 0;


    public Booking[] getBookings(){
        return bookings;
    }

    public User[] getUsers(){
        return users;
    }
    public Car[] getCarFleet(){
        return carFleet;
    }

    public Car[] getAvailableCars(){
        List<Car> temp = new ArrayList<>();
        for (Car car : carFleet) {
            if (car == null || car.isBooked()) {
                continue;
            }
            temp.add(car);

        }
        Car[] availableCars = new Car[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            availableCars[i] = temp.get(i);
        }

        return availableCars;
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

    public String showAvailableFleet(){
        String temp = "";

        for (Car car : carFleet) {
            if (car == null || car.isBooked()){
                continue;
            }
            temp = temp + car.toString() + "\n";
        }
        return temp;
    }

    public String showEletricAvailableFleet(){
        String temp = "";

        for (Car car : carFleet) {
            if (car == null || car.isBooked()) {
                continue;
            }
            if (car.isElectric()){
                temp = temp + car.toString() + "\n";
            }
        }
        return temp;
    }

    public String showUsers(){
        String temp = "";
        for (User user : users) {
            if (user == null){
                continue;
            }
            temp = temp + user.toString() + "\n";
        }
        return temp;
    }
    public String showBookedUsers(){
        String temp = "";
        for (User user : users) {
            if (user == null || !user.isBooked()){  // VERIFICAR ESSA LINHA, NAO DEVERIA SER !NAO
                continue;
            }
            temp = temp + user.toString() + "\n";
        }
        return temp;
    }

    public String showBookings(){
        String temp = "";
        for (Booking bo : bookings) {
            if (bo == null){
                continue;
            }
            temp = temp + bo.toString() + "\n";
        }
        return temp;

    }


}
