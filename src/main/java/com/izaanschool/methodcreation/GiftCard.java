package com.izaanschool.methodcreation;

import java.util.Date;

public class GiftCard {
    private String code;
    private double balance;
    private Date expirationDate;

    // Getters and setters methods for the properties
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public static void main(String[] args) {
        GiftCard giftCard = new GiftCard();
        giftCard.setCode("JavaCode");
        giftCard.setBalance(50.0);

        Date now = new Date();
        now.setHours(01);
        now.setMinutes(20);
        now.setSeconds(30);
        giftCard.setExpirationDate(now);

        System.out.println("Code: " + giftCard.getCode());
        System.out.println("Balance: " + giftCard.getBalance());
        System.out.println("Expiration Date: " + giftCard.getExpirationDate());
    }
}
