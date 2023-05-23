package com.izaanschool.methodcreation;

import java.util.Date;

public class Donation {
    private String donor;
    private double amount;
    private Date donationDate;


    public String getDonor() {
        return donor;
    }

    public double getAmount() {
        return amount;
    }

    public Date getDonationDate() {
        return donationDate;
    }


    public void setDonor(String donor) {
        this.donor = donor;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setDonationDate(Date donationDate) {
        this.donationDate = donationDate;
    }

    public static void main(String[] args) {
        Donation donation = new Donation();

        donation.setDonor("Salman Butt");
        donation.setAmount(100.0);
        donation.setDonationDate(new Date());

        System.out.println("Donation Details");
        System.out.println("Donor: " + donation.getDonor());
        System.out.println("Amount: " + donation.getAmount());
        System.out.println("Donation Date: " + donation.getDonationDate());
    }
}
