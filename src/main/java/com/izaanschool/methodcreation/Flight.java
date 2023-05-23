package com.izaanschool.methodcreation;

import java.util.Date;

public class Flight {
    private String flightNumber;
    private Date departureTime;
    private Date arrivalTime;

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public static void main(String[] args) {
        Flight flight = new Flight();
        flight.setFlightNumber("JAVA-123");

        Date now = new Date();
        flight.setDepartureTime(now);

        Date arrivalTime = new Date(now.getTime() + (12 * 60 * 60 * 1000));
        flight.setArrivalTime(arrivalTime);

        System.out.println("Flight Number: " + flight.getFlightNumber());
        System.out.println("Departure Time: " + flight.getDepartureTime());
        System.out.println("Arrival Time: " + flight.getArrivalTime());
    }
}
