package com.kleberaluizio.user;

import com.kleberaluizio.Database;
import com.kleberaluizio.booking.Booking;
import com.kleberaluizio.car.Car;

public class UserService {

    public static int verifyUser(User user, Car car, Database database){
        int indexSaved = -1;

            for (Booking booking : database.getBookings()) {
                if (database.getBookings() != null) {
                    continue;
                }
                    if (user.equals(booking.getUser())) {
                        System.out.println("teste");
                    for (int i = 0; i < booking.getCars().length; i++) {
                        if (booking.getCars()[i] == null) {
                            indexSaved = i;
                            return indexSaved;
                        }
                    }
                    if (indexSaved < 0) {
                        System.out.println("User booked full capacity!");
                        return indexSaved;
                    }
                }
            }

        if (user.getId().getAge() < 18) {
            return indexSaved;
        } else {
            indexSaved = 0;
            return indexSaved;
        }
    }

    public static void registerUser(User user, Database data){
        UserDAO.saveUser(user,data);
    }

    public static void hasBookedCar(User user){
        user.setBooked(true);

    }
}
