package com.izaanschool.methodcreation;

import java.util.Date;

public class Event {
    private String name;
    private Date date;
    private String location;


    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public String getLocation() {
        return location;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public static void main(String[] args) {
        Event event = new Event();

        event.setName("Party for Salman");
        event.setDate(new Date());
        event.setLocation("123 Salman Street");

        System.out.println("Event Details");
        System.out.println("Name: " + event.getName());
        System.out.println("Date: " + event.getDate());
        System.out.println("Location: " + event.getLocation());
    }
}
