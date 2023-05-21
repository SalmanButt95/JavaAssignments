package com.izaanschool.objects;

import java.util.Date;

public class Auction {
    private String item;
    private Date startTime;
    private Date endTime;

    public static void main(String[] args) {
        System.out.println("Hello from Auction Class!");

        Auction auction = new Auction();
        auction.item = "Antique Painting";
        auction.startTime = new Date();
        auction.endTime = new Date(System.currentTimeMillis() + 3600000); // Adding 1 hour to the current time

        System.out.println("Item: " + auction.item);
        System.out.println("Start Time: " + auction.startTime);
        System.out.println("End Time: " + auction.endTime);
    }
}

