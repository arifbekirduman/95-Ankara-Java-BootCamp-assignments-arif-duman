package com.arifbekirduman;

public class Test {

    public static void main(String[] args) {
        FlightReservationBase flightReservationTHY = new THYFlightReservation(9);
        flightReservationTHY.setReservation("THY Rezervasyon Sistemine hoş geldiniz!");

        FlightReservationBase flightReservationPegasus = new PegasusFlightReservation(15);
        flightReservationPegasus.setReservation("Pegasus Rezervasyon Sistemine hoş geldiniz!");

    }
}
