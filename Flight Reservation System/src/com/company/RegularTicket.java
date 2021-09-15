package com.company;

public class RegularTicket extends Ticket {

    private String specialServices;


    public RegularTicket(String pnr, String from, String departureDateTime, String arrivalDateTime, String seatNo, float price, boolean cancelled) {
        super(pnr, from, departureDateTime, arrivalDateTime, seatNo, price, cancelled);
        this.specialServices = specialServices;
    }

    String getSpecialServices() {
        return specialServices;
    }

    void updateSpecialServices(String specialServices) {
    }
}
