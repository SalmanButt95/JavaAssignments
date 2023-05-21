package com.izaanschool.ifelse;

public class GiftCard {

    public static void main(String[] args) {
        String code = "GC-1234";
        double balance = 50.0;
        String expirationDate = "2023-12-31";

        System.out.println("Code: " + code);
        System.out.println("Balance: $" + balance);
        System.out.println("Expiration Date: " + expirationDate);

        if (balance == 50.0) {
            System.out.println("The balance is $50");
        }

    }
}
