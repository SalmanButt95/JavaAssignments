package com.izaanschool.methodcreation;

public class VehicleRegistration {

    private String owner;
    private String vehicleDetails;
    private String expirationDate;


    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getVehicleDetails() {
        return vehicleDetails;
    }

    public void setVehicleDetails(String vehicleDetails) {
        this.vehicleDetails = vehicleDetails;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }


    public static void main(String[] args) {

        VehicleRegistration vehicleRegistration = new VehicleRegistration();


        vehicleRegistration.setOwner("Salman Butt");
        vehicleRegistration.setVehicleDetails("Dodge Challenger");
        vehicleRegistration.setExpirationDate("12-13-2024");


        System.out.println("Owner: " + vehicleRegistration.getOwner());
        System.out.println("Vehicle Details: " + vehicleRegistration.getVehicleDetails());
        System.out.println("Expiration Date: " + vehicleRegistration.getExpirationDate());
    }
}
