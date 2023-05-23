package com.izaanschool.methodcreation;

public class Appointment {

    private String date;
    private String time;
    private String location;

    public String getDate() { return date; }
    public void setDate (String date) {this.date = date;}

    public String getTime() { return time; }
    public void setTime (String time) {this.time =time;}

    public String getLocation() { return location; }
    public void setLocation (String location) {this.location = location;}

    public static void main(String[] args) {
        Appointment app = new Appointment();

        app.setDate("01/01/2001");
        app.setTime("12:00 PM");
        app.setLocation("Main Office First Floor");


        System.out.println("Apppointment Details");
        System.out.println("Date : " + app.getDate());
        System.out.println("Time : " + app.getTime());
        System.out.println("Location :" + app.getLocation());
    }




}
