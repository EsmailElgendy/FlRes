package com.airline;

public class Seat {
    private int seatNumber;
    private boolean isAvailable;

    public Seat(int seatNumber, boolean isAvailable) {
        this.seatNumber = seatNumber;
        this.isAvailable = isAvailable;
    }

    public boolean isAvailable(){
        return isAvailable;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }



    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
