package com.izaanschool.objects;

class Charity {
    private String name;
    private String mission;
    private double donations;

    public Charity(String name, String mission, double donations) {
        this.name = name;
        this.mission = mission;
        this.donations = donations;
    }

    public String getName() {
        return name;
    }

    public String getMission() {
        return mission;
    }

    public double getDonations() {
        return donations;
    }

    public static void main(String[] args) {
        Charity charity = new Charity("Give Back Donations", "Provide assistance for all families around the world", 1000.0);

        String name = charity.getName();
        String mission = charity.getMission();
        double donations = charity.getDonations();

        System.out.println("Name: " + name);
        System.out.println("Mission: " + mission);
        System.out.println("Donations: $" + donations);
    }
}
