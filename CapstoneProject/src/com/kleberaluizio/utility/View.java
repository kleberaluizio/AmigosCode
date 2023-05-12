package com.kleberaluizio.utility;

import com.kleberaluizio.Database;

public class View {
    
    public static void viewAvailableCars(Database database){
        database.showFleet();
    }

//    public static void viewAllUsers(Database database){
//        database.showUsers();
//    }

    public static void viewAllUsers(Database database){
        database.showUsers();
    }

    public static void viewBookings(Database database){
        database.showBookings();
    }
}

// JOptionPane.showMessageDialog(null, “alerta”,
//         “alerta”, JOptionPane.ERROR_MESSAGE);
