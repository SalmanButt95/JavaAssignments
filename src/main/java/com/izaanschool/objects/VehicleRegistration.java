package com.izaanschool.objects;

import java.util.Date;

class VehicleRegistration {
    private String owner;
    private String vehicleDetails;
    private Date expirationDate;

    public VehicleRegistration(String owner, String vehicleDetails, Date expirationDate) {
        this.owner = owner;
        this.vehicleDetails = vehicleDetails;
        this.expirationDate = expirationDate;
    }

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

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public static void main(String[] args) {
        String owner = "Salman Butt";
        String vehicleDetails = "Dodge Challenger";

        Date currentDate = new Date();
        long nextWeekInMillis = currentDate.getTime() + 7 * 24 * 60 * 60 * 1000;
        Date expirationDate = new Date(nextWeekInMillis);
        expirationDate.setHours(02);
        expirationDate.setMinutes(30);
        expirationDate.setSeconds(0);

        VehicleRegistration vehicleRegistration = new VehicleRegistration(owner, vehicleDetails, expirationDate);

        System.out.println("Owner: " + vehicleRegistration.getOwner());
        System.out.println("Vehicle Details: " + vehicleRegistration.getVehicleDetails());
        System.out.println("Expiration Date: " + vehicleRegistration.getExpirationDate());
    }
}
