package com.airline;

import java.util.List;

public class Passenger extends SystemUser implements ReserveFlight {

    public Passenger(String name, String pass) {
        this.setUsername(name);
        this.setPassword(pass);
        this.setUserType(UserType.PASSENGER);
    }


    public Flight reserveFlight(Flight flight) {
        if (flight == null) {
            System.out.println("Flight cannot be null.");
            return null;
        }
        List<Seat> availableSeats = flight.getSeats();
        for (Seat seat : availableSeats) {
            if (seat.isAvailable()) {
                seat.setAvailable(false);
                System.out.println("Seat reserved successfully: " + seat.getSeatNumber());
                return flight;
            }
        }

        System.out.println("No available seats on this flight.");
        return null;
    }


    @Override
    public String toString() {
        return "Passenger [getUsername()=" + getUsername() + ", getPassword()=" + getPassword() + ", getUserType()=" + getUserType() + "]";

    }
}