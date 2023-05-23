package com.izaanschool.methodcreation;

import java.util.Date;

public class Fundraiser {
    private String cause;
    private double goal;
    private double donations;
    private Date currentDate;

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public double getGoal() {
        return goal;
    }

    public void setGoal(double goal) {
        this.goal = goal;
    }

    public double getDonations() {
        return donations;
    }

    public void setDonations(double donations) {
        this.donations = donations;
    }

    public Date getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }

    public static void main(String[] args) {
        Fundraiser fundraiser = new Fundraiser();
        fundraiser.setCause("Donate to the Less Fortunate");
        fundraiser.setGoal(10000.0);
        fundraiser.setDonations(2500.0);


        Date now = new Date();
        now.setHours(12);
        now.setMinutes(30);
        now.setSeconds(0);
        fundraiser.setCurrentDate(now);

        System.out.println("Cause: " + fundraiser.getCause());
        System.out.println("Goal: " + fundraiser.getGoal());
        System.out.println("Donations: " + fundraiser.getDonations());
        System.out.println("Current Date: " + fundraiser.getCurrentDate());
    }
}
