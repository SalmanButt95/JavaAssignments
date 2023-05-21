package com.izaanschool.objects;

import java.util.Date;
public class CreditCard {
    private String number;
    private Date expirationDate;
    private String cardholderName;

    public CreditCard(String number, Date expirationDate, String cardholderName) {
        this.number = number;
        this.expirationDate = expirationDate;
        this.cardholderName = cardholderName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getCardholderName() {
        return cardholderName;
    }

    public void setCardholderName(String cardholderName) {
        this.cardholderName = cardholderName;
    }

    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard("1234-5678-9012-3456", new Date(2023-12-31) , "Salman Butt");

        String number = creditCard.getNumber();
        Date expirationDate = creditCard.getExpirationDate();
        String cardholderName = creditCard.getCardholderName();

        System.out.println("Number: " + number);
        System.out.println("Expiration Date: " + expirationDate);
        System.out.println("Cardholder Name: " + cardholderName);
    }
}
