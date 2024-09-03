package com.airline;

import java.util.ArrayList;
import java.util.List;

public class FlightReservationService {

    private List<Flight> flights = new ArrayList<>();



    public FlightReservationService() {
        flights.add(new Flight(101, FlightType.INTERNATIONAL, "Cairo", "Dubai", "20-8-2025", "10:00 AM", 100));
        flights.add(new Flight(102, FlightType.INTERNATIONAL, "Cairo", "Mumbai", "20-8-2025", "10:00 AM", 100));
        flights.add(new Flight(103, FlightType.INTERNATIONAL, "Cairo", "Amsterdam", "20-8-2025", "10:00 AM", 100));
        flights.add(new Flight(104, FlightType.INTERNATIONAL, "Cairo", "NYC", "20-8-2025", "10:00 AM", 100));
        flights.add(new Flight(105, FlightType.INTERNATIONAL, "Cairo", "France", "20-8-2025", "10:00 AM", 100));
        flights.add(new Flight(106, FlightType.INTERNATIONAL, "Cairo", "England", "20-8-2025", "10:00 AM", 100));
        flights.add(new Flight(201, FlightType.DOMESTIC, "Cairo", "Aswan", "20-8-2025", "10:00 AM", 100));
        flights.add(new Flight(202, FlightType.DOMESTIC, "Cairo", "Maadi", "20-8-2025", "11:00 AM", 100));
        flights.add(new Flight(203, FlightType.DOMESTIC, "Cairo", "Luxor", "20-8-2025", "15:00 PM", 100));
        flights.add(new Flight(204, FlightType.DOMESTIC, "Cairo", "Hurghada", "20-8-2025", "10:00 AM", 100));
        flights.add(new Flight(205, FlightType.DOMESTIC, "Cairo", "Sharm", "20-8-2025", "10:00 AM", 100));
        flights.add(new Flight(206, FlightType.DOMESTIC, "Cairo", "Marsa Alam", "20-8-2025", "10:00 AM", 100));
    }






    public void printAvailableFlights(FlightType flightType) {
        for (Flight flight : flights) {
            if (flight.getFlightType() == flightType) {
                System.out.println(flight);
            }
        }
    }


    public Flight getFlightByNumber(int flightNumber) {
        for (Flight flight : flights) {
            if (flight.getFlightNumber() == flightNumber) {
                return flight;
            }
        }
        return null;
    }



}
