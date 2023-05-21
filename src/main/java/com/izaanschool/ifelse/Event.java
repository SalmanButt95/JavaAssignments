package com.izaanschool.ifelse;

public class Event {

    public static void main(String[] args) {
        String eventName = "Java Party";
        String eventDate = "2023-05-21";
        String eventLocation = "Java Room";

        System.out.println("Event Name: " + eventName);
        System.out.println("Event Date: " + eventDate);
        System.out.println("Event Location: " + eventLocation);
        if (eventName.equals("Java Party")) {
            System.out.println("Let's celebrate!");
        }
    }
}
