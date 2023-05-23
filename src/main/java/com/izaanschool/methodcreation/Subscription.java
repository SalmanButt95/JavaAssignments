package com.izaanschool.methodcreation;

import java.time.LocalDate;

public class Subscription {

    private String name;
    private double price;
    private int duration;
    private LocalDate startDate;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }


    public static void main(String[] args) {

        Subscription subscription = new Subscription();


        subscription.setName("Netflix Subscription");
        subscription.setPrice(14.99);
        subscription.setDuration(30);
        subscription.setStartDate(LocalDate.now());


        System.out.println("Subscription Name: " + subscription.getName());
        System.out.println("Price: $" + subscription.getPrice());
        System.out.println("Duration: " + subscription.getDuration() + " days");
        System.out.println("Start Date: " + subscription.getStartDate());
    }
}
