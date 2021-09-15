package com.company;

public class Flight {
    private static int idCounter;

    private String flightNumber;
    private String airline;
    private int capacity;
    private boolean bookedSeats;

    private Flight flight;

    static {
        idCounter = 0;
    }

    public Flight() {
        this("00Indigo", "Indigo", 100, false);
    }

    public Flight (String flightNumber, String airline, int capacity, boolean bookedSeats) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
        this.bookedSeats = bookedSeats;

    }

    public Flight (Flight flight) {
        this.flightNumber = flight.flightNumber;
        this.airline = flight.airline;
        this.capacity = flight.capacity;
        this.bookedSeats = flight.bookedSeats;

    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setAirline(int capacity) {
        this.capacity = capacity;
    }

    public boolean getBookedSeats(boolean bookedSeats) {
        return bookedSeats;
    }

    public void setAirline(boolean bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public String getFlightDetails() {
        return flight.flightNumber + ", " + flight.airline + ", " + flight.capacity + ", " + flight.bookedSeats;
    }
}
