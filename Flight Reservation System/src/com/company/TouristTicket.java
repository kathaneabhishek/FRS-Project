package com.company;

public class TouristTicket extends Ticket {

    private String hotelAddress, selectedTouristLocation;

    public TouristTicket(String pnr, String from, String departureDateTime, String arrivalDateTime, String seatNo, float price, boolean cancelled) {
        super(pnr, from, departureDateTime, arrivalDateTime, seatNo, price, cancelled);
        this.hotelAddress = hotelAddress;
        this.selectedTouristLocation = selectedTouristLocation;
    }

    String getHotelAddress() {
        return hotelAddress;
    }

    String getTouristLocation() {
        return selectedTouristLocation;
    }

    void removeTouristlocation(String location){
    }

    void addTouristLocation(String location){

    }
}