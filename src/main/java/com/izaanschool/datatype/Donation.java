package com.izaanschool.datatype;

import java.util.Scanner;

public class Donation {
    String donor = "Salman Butt";
    double amount = 1000;
    String donationDate = "Jan-12-2023";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter donor name: ");
        String donor = input.nextLine();

        System.out.print("Enter donation amount: ");
        double amount = input.nextDouble();


        System.out.print("Enter donation date: ");
        String donationDate = input.nextLine();

        System.out.println("Donor: " + donor);
        System.out.println("Amount: " + amount);
        System.out.println("Donation date: " + donationDate);
    }
}
