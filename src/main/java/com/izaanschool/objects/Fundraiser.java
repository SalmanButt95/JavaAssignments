package com.izaanschool.objects;

import java.util.Date;

public class Fundraiser {
    private String cause;
    private double goal;
    private double donations;

    public Fundraiser(String cause, double goal, double donations) {
        this.cause = cause;
        this.goal = goal;
        this.donations = donations;
    }

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

    public static void main(String[] args) {
        Fundraiser fundraiser = new Fundraiser("For the less forunate", 50000.0, 12500.0);

        String cause = fundraiser.getCause();
        double goal = fundraiser.getGoal();
        double donations = fundraiser.getDonations();

        System.out.println("Cause: " + cause);
        System.out.println("Goal: $" + goal);
        System.out.println("Donations: $" + donations);
    }
}
