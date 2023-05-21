package com.izaanschool.ifelse;

public class Fundraiser {

    public static void main(String[] args) {
        String cause = "Fundraiser to the less-fortune";
        double goal = 10000.0;
        double donations = 5000.0;

        System.out.println("Cause: " + cause);
        System.out.println("Goal: $" + goal);
        System.out.println("Donations: $" + donations);
        if (cause.equals("Fundraiser to the less-fortune")) {
            System.out.println("This is a Fundraiser to the less-fortune");
        }
    }
}
