package com.izaanschool.ifelse;

public class Donation {

    public static void main(String[] args) {
        String donor = "Salman Butt";
        double amount = 100.00;
        String donationDate = "2023-05-21";

        System.out.println("Donor: " + donor);
        System.out.println("Amount: $" + amount);
        System.out.println("Donation Date: " + donationDate);
        if (donor.equals("Salman Butt")) {
            System.out.println("Thank you, Salman Butt, for your generous donation!");
        }

    }
}
