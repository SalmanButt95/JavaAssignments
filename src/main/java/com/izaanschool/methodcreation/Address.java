package com.izaanschool.methodcreation;
// Declare Address Class
public class Address {
    // Declare Class properties:
    private String streetAddress;
    private String city;
    private String state;
    private String country;
    private String postalCode;


    // Getters and Setters Methods
    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    // Declare Main Method
    public static void main(String[] args) {
        // Print Address
        System.out.println("Hello From Address Class!");

        // Create an object instance of the class

        Address obj = new Address();
        obj.setCity("NY");
        obj.setCountry("USA");
        obj.setState("");
        obj.setStreetAddress("");
        obj.setPostalCode("007");

        // Access the object's properties

        System.out.println("Address Details: ");
        System.out.println("Country:"+ obj.getCountry()+", State: "+obj.getState() +", City: "+obj.getCity() +", Street Address: "+obj.getStreetAddress()+", PostalCode: "+ obj.getPostalCode());
    }
}