package com.kleberaluizio.utility;

import com.kleberaluizio.Database;
import com.kleberaluizio.booking.BookingService;
import com.kleberaluizio.car.Car;
import com.kleberaluizio.user.User;

import javax.swing.*;

public class Menu {


    public static void showMenu(Database database){
        String[] options = {"1 - Book Car",
                "2 - View All User Booked",
                "3 - View All Bookings",
                "4 - View Available Cars",
                "5 - View Available Electric Cars",
                "6 - View all users",
                "7 - Exit"};

        Object inputValue = JOptionPane.showInputDialog(null,null,"Options",JOptionPane.DEFAULT_OPTION,
                null,options,options[0]);

        Character choice = ((String) inputValue).charAt(0);

        selectedOption(choice, database);


    }
    public static void selectedOption(Character choice, Database database){
        switch (choice){
            case '1':
                BookingSolicitation(database);
                break;
            case '2':
                View.viewAllUsersBooked(database);
                break;
            case '3':
                View.viewBookings(database);
                break;
            case '4':
                View.viewAvailableCars(database);
                break;
            case '5':
                View.viewElectricAvailableCars(database);
                break;
            case '6':
                View.viewAllUsers(database);
                break;
            default:
                System.exit(0);
        }
    }

    public static void BookingSolicitation(Database database){

        User user = (User) getDataToBookCar(database.getUsers(),"Select an user:");
        Car car = (Car) getDataToBookCar(database.getCarFleet(),"Select a car:");

        BookingService.bookCar(car,user,database);

    }
    public static Object getDataToBookCar(Object[] data,String message){
        return JOptionPane.showInputDialog(null,message,"Booking Car",JOptionPane.DEFAULT_OPTION,
                null,data,data[0]);
    }

}



