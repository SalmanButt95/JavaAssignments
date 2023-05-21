package com.izaanschool.ifelse;

public class Auction {

    String item = "laptop";
    String startTime = "7:00 AM";
    String endTime = "7:00 PM";

    public void info() {
        System.out.println("Auction Details:");
        System.out.println("Item: " + item);
        System.out.println("Start Time: " + startTime);
        System.out.println("End Time: " + endTime);

        if (item.equals("laptop")) {
            System.out.println("Yes, this is a laptop");
        }
    }

    public static void main(String[] args) {
        Auction auction = new Auction();
        auction.info();
    }
}
