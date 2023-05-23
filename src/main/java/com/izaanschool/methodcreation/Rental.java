package com.izaanschool.methodcreation;

import java.util.Date;

public class Rental {
    private String item;
    private int duration;
    private double price;
    private Date rentalDate;


    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(Date rentalDate) {
        this.rentalDate = rentalDate;
    }

    public static void main(String[] args) {
        Rental rental = new Rental();
        rental.setItem("Jet Ski");
        rental.setDuration(3);
        rental.setPrice(275.00);
        rental.setRentalDate(new Date());

        System.out.println("Item: " + rental.getItem());
        System.out.println("Duration: " + rental.getDuration() + " days");
        System.out.println("Price: $" + rental.getPrice());
        System.out.println("Rental Date: " + rental.getRentalDate());
    }
}
