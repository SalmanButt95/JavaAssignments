package com.izaanschool.ifelse;

public class Coupon {

    public static void main(String[] args) {
        int code = 899;
        int discountAmount = 10;
        String expirationDate = "2023-12-31";

        if (code == 899) {

            System.out.println("Code: " + code);
            System.out.println("Discount Amount: " + discountAmount);
            System.out.println("Expiration Date: " + expirationDate);
            System.out.println("This code is working");
        }
    }
}
