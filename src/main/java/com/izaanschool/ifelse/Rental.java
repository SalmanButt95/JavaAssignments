package com.izaanschool.ifelse;

public class Rental {
    private String item;
    private int duration;
    private double price;

    public Rental(String item, int duration, double price) {
        this.item = item;
        this.duration = duration;
        this.price = price;
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

    public static void main(String[] args) {
        String item = "Jet Ski";
        int duration = 3;
        double price = 225.0;

        Rental rental = new Rental(item, duration, price);

        System.out.println("Item: " + rental.getItem());
        System.out.println("Duration (days): " + rental.getDuration());
        System.out.println("Price: $" + rental.getPrice());

        if (duration == 5) {
            System.out.println("You are right");
        } else {
            System.out.println("Enter correct amount");
        }
    }
}
