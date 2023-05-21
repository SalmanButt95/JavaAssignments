package com.izaanschool.objects;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Subscription {
    private String name;
    private double price;
    private int duration;

    public Subscription(String name, double price, int duration) {
        this.name = name;
        this.price = price;
        this.duration = duration;
    }

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

    public static void main(String[] args) {
        String name = "Netflix Subscription";
        double price = 14.99;


        LocalDate currentDate = LocalDate.now();
        LocalDate dateAfterMonth = currentDate.plus(1, ChronoUnit.MONTHS);

        int duration = (int) ChronoUnit.DAYS.between(currentDate, dateAfterMonth);

        Subscription subscription = new Subscription(name, price, duration);

        System.out.println("Name: " + subscription.getName());
        System.out.println("Price: " + subscription.getPrice());
        System.out.println("Duration: " + subscription.getDuration() + " days");
        System.out.println("Date After a Month: " + dateAfterMonth);
    }
}
