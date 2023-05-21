package com.izaanschool.objects;

import java.util.Date;

public class Event {
    private String name;
    private Date date;
    private String location;

    public Event(String name, Date date, String location) {
        this.name = name;
        this.date = date;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public static void main(String[] args) {
        Event event = new Event("Surprise Java Party", new Date(), "123 Java Street");

        String name = event.getName();
        Date date = new Date();
        String location = event.getLocation();

        event.setDate(date);

        System.out.println("Name: " + name);
        System.out.println("Date: " + date);
        System.out.println("Location: " + location);
    }
}

