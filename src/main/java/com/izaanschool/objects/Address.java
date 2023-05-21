package com.izaanschool.objects;

public class Address {

private String streetAddress;
private String city;
private String state;
private String country;
private String postalCode;

    public static void main(String[] args) {
        System.out.println("Hello from Address Class!");

        Address obj = new Address();
        obj.streetAddress = "123 Main Street";
        obj.city = "NY";
        obj.state = "New York";
        obj.country = "USA";
        obj.postalCode= "10101";

        System.out.println("Street Name : " + obj.streetAddress);
        System.out.println("City: " + obj.city);
        System.out.println("Zipcode :" + obj.postalCode);

    }



}
