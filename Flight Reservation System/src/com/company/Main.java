package com.company;

public class Main {

    public static void main(String[] args) {

        Flight f1 = new Flight("0101", "Indigo", 100, true );

        RegularTicket rt1 = new RegularTicket( "12345", "Wardha", "1 Jan 2022 10.00 AM", "1 Jan 2022 12.00 AM", "27",10000,true );

        TouristTicket tt1 = new TouristTicket("123456", "Nagpur", "2 Jan 2022 10.00 AM", "2 Jan 2022 12.00 AM", "20", 12000, true);

        System.out.println(f1.getFlightDetails());
        System.out.println(rt1.getSpecialServices());
        System.out.println(tt1.getTouristLocation());

    }
}
