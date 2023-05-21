package com.izaanschool.ifelse;

// Address - A class representing an address with street, city, and zip code properties. Print street, city, and zip codes.

public class Address {

    public static void main(String[] args) {
        // Print Address
        System.out.println("Hello From Address Class!");

        // Declaring variables and initializing them with values
        String city = "NY";
        String street = "123 Apple Street";
        String zip_codes = "10001";
        boolean hasStreetName = true;
        boolean hasCity = true;
        boolean hasZipCode = true;

        // Declare if Condition: using String
        if (city == "NY") {
            System.out.println("NY is the city Name.");
        }

        if (city == "NY") {
            System.out.println("NY is the city Name.");
        }
        // Declare if Condition: Using equals
        if (city.equals("CA")) {
            // Code to execute if condition is true
            System.out.println("CA is the city Name.");
        }

        // Declare if Condition: Using Boolean
        if (hasStreetName) {
            // Code to execute if condition is true
            System.out.println("The Address Has Street Name.");
        }
    }
}
