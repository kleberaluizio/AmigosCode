package com.kleberaluizio.booking;

import com.kleberaluizio.Database;

public class BookingDAO {
    public static void saveBooking(Booking booking, Database database){
        database.setBookings(booking);
    }

}
