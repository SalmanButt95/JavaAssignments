package com.izaanschool.ifelse;
public class Charity {
    private String name;
    private String mission;
    private double donations;

    public Charity(String name, String mission, double donations) {
        this.name = name;
        this.mission = mission;
        this.donations = donations;
    }

    public void info() {
        if (name.equals("helpOther")) {
            System.out.println("Let's help others");
        } else {
            System.out.println("Charity Name: " + name);
            System.out.println("Mission: " + mission);
            System.out.println("Donations: $" + donations);
        }
    }

    public static void main(String[] args) {
        Charity charity1 = new Charity("helpOther", "Mission description", 1000.0);
        charity1.info();

        System.out.println();

        Charity charity2 = new Charity("AnotherCharity", "Another mission description", 2000.0);
        charity2.info();
    }
}
