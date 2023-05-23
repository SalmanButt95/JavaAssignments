package com.izaanschool.methodcreation;

public class Ticket {

    private String event;
    private String date;
    private int seatNumber;


    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }


    public static void main(String[] args) {

        Ticket ticket = new Ticket();


        ticket.setEvent("Salman Butt Concert");
        ticket.setDate("December 24,2029");
        ticket.setSeatNumber(42);

        System.out.println("Event: " + ticket.getEvent());
        System.out.println("Date: " + ticket.getDate());
        System.out.println("Seat Number: " + ticket.getSeatNumber());
    }
}
