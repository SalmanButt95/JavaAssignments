package com.izaanschool.objects;

import java.util.Calendar;
import java.util.Date;

public class GiftCard {
    private String code;
    private double balance;
    private Date expirationDate;

    public GiftCard(String code, double balance, Date expirationDate) {
        this.code = code;
        this.balance = balance;
        this.expirationDate = expirationDate;
    }

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
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.WEEK_OF_YEAR, 1);
        Date expirationDate = calendar.getTime();

        GiftCard giftCard = new GiftCard("12-34-56-78-90", 50.0, expirationDate);

        String code = giftCard.getCode();
        double balance = giftCard.getBalance();
        expirationDate = giftCard.getExpirationDate();

        System.out.println("Code: " + code);
        System.out.println("Balance: $" + balance);
        System.out.println("Expiration Date: " + expirationDate);
    }
}
