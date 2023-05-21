package com.izaanschool.ifelse;

public class Flight {

    public static void main(String[] args) {
        String flightNumber = "11-22-33-44";
        String departureTime = "07:00 AM";
        String arrivalTime = "02:00 PM";

        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Departure Time: " + departureTime);
        System.out.println("Arrival Time: " + arrivalTime);
        if (flightNumber.equals("11-22-33-44")) {
            System.out.println("This is flight number 11-22-33-44.");
        }

    }
}
