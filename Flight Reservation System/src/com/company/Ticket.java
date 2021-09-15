package com.company;

public class Ticket {
    String pnr, from, to, departureDateTime, arrivalDateTime, seatNo;
    float price;
    boolean cancelled;

    private Flight flight;
    private Passenger passenger;

    public Ticket(String pnr, String from, String departureDateTime, String arrivalDateTime, String seatNo, float price, boolean cancelled) {
        this.pnr = pnr;
        this.from = from;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.seatNo = seatNo;
        this.price = price;
        this.cancelled = cancelled;
    }

    public Ticket(String ticketPnr, String ticketFrom, String ticketTo, String ticketDeparturetime, String ticketArrivalDatetime, String ticketSeatNo, float ticketPrice, boolean ticketCancelld) {
    }


    public Ticket ticket;


    public void ticket(String ticketPnr, String ticketFrom, String ticketTo, String ticketDeparturetime, String ticketArrivalDatetime, String ticketSeatNo, float ticketPrice, boolean ticketCancelled) {
        this.ticket = new Ticket(ticketPnr, ticketFrom, ticketTo, ticketDeparturetime, ticketArrivalDatetime, ticketSeatNo, ticketPrice, ticketCancelled);
    }

    public String getTicketDetails() {
        return ticket.pnr + ", " + ticket.from + ", " + ticket.to + ", " + ticket.departureDateTime + ", " + ticket.arrivalDateTime + ", " + ticket.seatNo + ", " + ticket.price + ", " + ticket.cancelled;
    }

}