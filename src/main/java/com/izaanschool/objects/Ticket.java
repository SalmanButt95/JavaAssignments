package com.izaanschool.objects;

class Ticket {
    private String event;
    private String date;
    private int seatNumber;

    public Ticket(String event, String date, int seatNumber) {
        this.event = event;
        this.date = date;
        this.seatNumber = seatNumber;
    }

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
        String event = "Lil Wayne Concert";
        String date = "2023-05-21";
        int seatNumber = 42;

        Ticket ticket = new Ticket(event, date, seatNumber);

        System.out.println("Event: " + ticket.getEvent());
        System.out.println("Date: " + ticket.getDate());
        System.out.println("Seat Number: " + ticket.getSeatNumber());
    }
}
