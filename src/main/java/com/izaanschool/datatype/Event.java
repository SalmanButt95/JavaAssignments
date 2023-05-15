package com.izaanschool.datatype;

import java.util.Scanner;

public class Event {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String eventName = "Izaan School BBQ";
        String eventDate = "July/4/2023";
        String eventLocation = "Central Park";



        System.out.print("Enter event name: ");
        eventName = scanner.nextLine();

        System.out.print("Enter event date: ");
        eventDate = scanner.nextLine();

        System.out.print("Enter event location: ");
        eventLocation = scanner.nextLine();


        System.out.println("Event Name: " + eventName);
        System.out.println("Event Date: " + eventDate);
        System.out.println("Event Location: " + eventLocation);
    }
}
