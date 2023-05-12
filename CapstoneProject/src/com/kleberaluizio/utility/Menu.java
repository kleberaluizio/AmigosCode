package com.kleberaluizio.utility;

import com.kleberaluizio.Database;

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

//        BookingService.bookCar(fiesta,kleber,database);
//        BookingService.bookCar(uno,kleber,database);
//        BookingService.bookCar(gol,leonel,database);
//
//        System.out.println("=".repeat(20));
//        View.viewAvailableCars(database);
//        System.out.println("=".repeat(20));
//        View.viewAllUsers(database);
//        View.viewBookings(database);

    }
    public static void selectedOption(Character choice, Database database){
        switch (choice){
            case '1':
                break;
            case '2':
                break;
            case '3':
                break;
            case '4':
                View.viewAvailableCars(database);
                showMenu(database);
                break;
            case '5':
                break;
            case '6':
                View.viewAllUsers(database);
                showMenu(database);
                break;
            default:
        }
    }

}
//        String inputValue = JOptionPane.showInputDialog(null,menuOptions,"Options",JOptionPane.PLAIN_MESSAGE);

//    String menuOptions = """
//                1 - Book Car
//                2 - View All User Booked
//                3 - View All Bookings
//                4 - View Available Cars
//                5 - View Available Electric Cars
//                6 - View all users
//                7 - Exit""";




