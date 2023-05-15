package com.izaanschool.datatype;
public class Address {

    public static void main(String[] args) {

        System.out.println("Address : 123 Apple Street ,New York, New York, 10001");
        boolean hasStreetName = true;
        boolean hasApartment = false;
        System.out.println("\n");
        System.out.println("Has StreetName: " + hasStreetName);
        System.out.println("Has Apartment: " + hasApartment);

        System.out.println("\n");

        System.out.println("Does the address have a street name? : " + (hasStreetName ? "yes" : "no"));
        System.out.println("Does the address have a apartment? : " + (hasApartment ? "yes" : "no"));

    }
}
