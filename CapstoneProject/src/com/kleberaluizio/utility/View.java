package com.kleberaluizio.utility;

import com.kleberaluizio.Database;

import javax.swing.*;

public class View {
    
    public static void viewAvailableCars(Database database){
        viewMessage(database.showAvailableFleet(), "Car Fleet");
    }

    public static void viewElectricAvailableCars(Database database){
        viewMessage(database.showEletricAvailableFleet(), "Electric Car Fleet");
    }

    public static void viewAllUsers(Database database){
        viewMessage(database.showUsers(), "Users");
    }
    public static void viewAllUsersBooked(Database database){
        viewMessage(database.showBookedUsers(), "Users");
    }

    public static void viewBookings(Database database){
        viewMessage(database.showBookings(), "Bookings");
    }

    public static void viewMessage(String list, String type){
        JOptionPane.showMessageDialog(null, list,type,
                JOptionPane.PLAIN_MESSAGE);
    }
}