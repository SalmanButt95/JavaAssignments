package com.izaanschool.ifelse;

import java.util.Date;

public class CreditCard {

    public static void main(String[] args) {
        int number = 1111;
        Date expirationDate = new Date(125, 11, 25);
        String cardholderName = "Salman Butt";

        System.out.println("Credit Card Number: " + number);
        System.out.println("Expiration Date: " + expirationDate);
        System.out.println("Cardholder Name: " + cardholderName);
        if (number == 1111) {
            System.out.println("Yes, this is my number");
        }
    }
}
