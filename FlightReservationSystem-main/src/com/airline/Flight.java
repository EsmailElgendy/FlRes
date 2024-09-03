package com.airline;

import java.util.ArrayList;
import java.util.List;

public class Flight {

    private int flightNumber;
    private FlightType flightType;
    private int passengersCount;
    private List<Seat> seats;
    private int availableSeats;
    private List<Passenger> passengers;
    private String from;
    private String to;
    private String date;
    private String time;




    public Flight(int flightNumber, FlightType flightType, String from, String to, String date, String time, int totalSeats) {
        this.flightNumber = flightNumber;
        this.flightType = flightType;
        this.passengersCount = 0;
        this.availableSeats = totalSeats;
        this.passengers = new ArrayList<>();
        this.seats = new ArrayList<>();
        for (int i = 1; i <= totalSeats; i++) {
            seats.add(new Seat(i, true));
        }
        this.from = from;
        this.to = to;
        this.date = date;
        this.time = time;
    }

    public Flight() {

    }


    public int getFlightNumber() {
        return flightNumber;
    }

    public FlightType getFlightType() {
        return flightType;
    }

    public int getPassengersCount() {
        return passengersCount;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }



    public boolean bookSeat(){
        return true;
    }

    public List<Passenger> getPassengers(){
        return this.passengers;
    }

    public int getAvailableSeats(){
        return this.availableSeats;
    }

    public boolean bookSeat(Passenger passenger) {

            if (availableSeats > 0) {
                for (Seat seat : seats) {
                    if (seat.isAvailable()) {
                        seat.setAvailable(false);
                        passengers.add(passenger);
                        passengersCount++;
                        availableSeats--;
                        System.out.println("Seat booked successfully for " + passenger.getUsername());
                        System.out.println("Available seats : " + getAvailableSeats());
                        return true;
                    }
                }
            }

        else {
            System.out.println("Sorry, No available seats.");
        }
        return false;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setFlightType(FlightType flightType) {
        this.flightType = flightType;
    }

    public void setPassengersCount(int passengersCount) {
        this.passengersCount = passengersCount;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }



    @Override
    public String toString() {

        System.out.println("========================= Print Flight ======================");
        System.out.println("Flight "+ flightNumber);
        System.out.println("Flight Type: " + this.flightType);
        System.out.println("From: " + this.from);
        System.out.println("To: " + this.to);
        System.out.println("Date: " + this.date);
        System.out.println("Time: " + this.time);
        System.out.println("Available Seats: " + this.availableSeats);
        System.out.println("Passengers: " + this.passengers);
        System.out.println("");

        return "";
    }


}
