package com.izaanschool.objects;
import java.util.Date;

public class Donation {
    private String donor;
    private double amount;
    private Date donationDate;

    public Donation(String donor, double amount, Date donationDate) {
        this.donor = donor;
        this.amount = amount;
        this.donationDate = donationDate;
    }

    public String getDonor() {
        return donor;
    }

    public void setDonor(String donor) {
        this.donor = donor;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDonationDate() {
        return donationDate;
    }

    public void setDonationDate(Date donationDate) {
        this.donationDate = donationDate;
    }

    public static void main(String[] args) {
        Date today = new Date();

        Donation donation = new Donation("Me Salman Butt", 100.0, today);

        String donor = donation.getDonor();
        double amount = donation.getAmount();
        Date donationDate = donation.getDonationDate();

        System.out.println("Donor: " + donor);
        System.out.println("Amount: " + amount);
        System.out.println("Donation Date: " + donationDate);
    }
}
