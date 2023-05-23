package com.izaanschool.methodcreation;

public class Charity {
    private String name;
    private String mission;
    private double donations;

    public String getName() {
        return name;
    }

    public String getMission() {
        return mission;
    }

    public double getDonations() {
        return donations;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    public void setDonations(double donations) {
        this.donations = donations;
    }

    public static void main(String[] args) {
        Charity charity = new Charity();

        charity.setName("Charity to the World");
        charity.setMission("To provide assistance for families in the world");
        charity.setDonations(10000.0);

        System.out.println("Charity Details");
        System.out.println("Name: " + charity.getName());
        System.out.println("Mission: " + charity.getMission());
        System.out.println("Donations: $" + charity.getDonations());
    }
}
