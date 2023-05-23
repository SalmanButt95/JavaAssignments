package com.izaanschool.methodcreation;

public class CreditCard {
    private String number;
    private String expirationDate;
    private String cardholderName;


    public String getNumber() {
        return number;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public String getCardholderName() {
        return cardholderName;
    }


    public void setNumber(String number) {
        this.number = number;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setCardholderName(String cardholderName) {
        this.cardholderName = cardholderName;
    }

    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();

        creditCard.setNumber("1234-5678-9012-3456");
        creditCard.setExpirationDate("12/29");
        creditCard.setCardholderName("Mr. Butt");

        System.out.println("Credit Card Details");
        System.out.println("Number: " + creditCard.getNumber());
        System.out.println("Expiration Date: " + creditCard.getExpirationDate());
        System.out.println("Cardholder Name: " + creditCard.getCardholderName());
    }
}
