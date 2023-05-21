package com.izaanschool.objects;

import java.util.Date;

public class Flight {
    private String flightNumber;
    private Date departureTime;
    private Date arrivalTime;

    public Flight(String flightNumber, Date departureTime, Date arrivalTime) {
        this.flightNumber = flightNumber;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

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
        Flight flight = new Flight("ToJavaLand", new Date(), new Date());

        String flightNumber = flight.getFlightNumber();
        Date departureTime = new Date(); // Set current date and time
        Date arrivalTime = new Date(); // Set current date and time

        flight.setDepartureTime(departureTime);
        flight.setArrivalTime(arrivalTime);

        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Departure Time: " + departureTime);
        System.out.println("Arrival Time: " + arrivalTime);
    }
}
