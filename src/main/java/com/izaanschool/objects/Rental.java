package com.izaanschool.objects;

import java.util.Date;

public class Rental {
    private String item;
    private int duration;
    private double price;
    private Date startDate;
    private Date endDate;

    public Rental(String item, int duration, double price, Date startDate) {
        this.item = item;
        this.duration = duration;
        this.price = price;
        this.startDate = startDate;
        this.endDate = calculateEndDate(startDate, duration);
    }

    public String getItem() {
        return item;
    }

    public int getDuration() {
        return duration;
    }

    public double getPrice() {
        return price;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    private Date calculateEndDate(Date startDate, int duration) {
        long millisecondsPerDay = 24 * 60 * 60 * 1000L;
        long startDateTime = startDate.getTime();
        long endDateTime = startDateTime + duration * millisecondsPerDay;
        return new Date(endDateTime);
    }

    public static void main(String[] args) {
        Date startDate = new Date(); //
        int duration = 3;
        double pricePerDay = 125.0;
        double totalPrice = duration * pricePerDay;

        Rental rental = new Rental("Speed Boat", duration, totalPrice, startDate);
        System.out.println("Item: " + rental.getItem());
        System.out.println("Duration: " + rental.getDuration() + " days");
        System.out.println("Price: $" + rental.getPrice());
        System.out.println("Start Date: " + rental.getStartDate());
        System.out.println("End Date: " + rental.getEndDate());
    }
}
