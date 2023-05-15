package com.izaanschool.datatype;

public class Appointment {

    public static void main(String[] args) {
    String date = "5/26/2023";
    String time = "12:30 PM";
    String location = "Dental Office";

        System.out.println("Appointment Scheduled\n");
        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
        System.out.println("Location:" + location);
        System.out.println("\n");



        boolean completed = true;
        boolean rescheduled = false;


        System.out.println("Completed: " + completed);
        System.out.println("Rescheduled: " + rescheduled);
        System.out.println("\n");
        System.out.println("Is the appointment completed? : " + (completed ? "yes" : "no"));
        System.out.println("Is the appointment rescheduled? : " + (rescheduled ? "yes" : "no"));


    }
}
