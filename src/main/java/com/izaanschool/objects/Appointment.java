package com.izaanschool.objects;

public class Appointment {

private String date;
private String time;
private String location;

    public static void main(String[] args) {
        System.out.println("Hello From Appointment Class \n");

        Appointment obj = new Appointment();
        obj.date = "5/15/23";
        obj.time = "12.00 PM";
        obj.location = "Main Office";

        System.out.println("Date : " + obj.date);
        System.out.println("Time : " + obj.time);
        System.out.println("Location : " + obj.location);

    }



}
