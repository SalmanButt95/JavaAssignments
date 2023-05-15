package com.izaanschool.datatype;

import java.util.Scanner;
import java.time.LocalDate;

public class Coupon {
    public static void main(String[] args) {

        String code = "adv-123";
        double discountAmount = 49.99;
        LocalDate expirationDate = LocalDate.of(2024, 12, 30);


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter coupon code: ");
        code = scanner.nextLine();

        System.out.print("Enter discount amount: ");
        discountAmount = scanner.nextDouble();

        System.out.print("Enter expiration date (YYYY-MM-DD): ");
        expirationDate = LocalDate.parse(scanner.next());

        scanner.close();


        System.out.println("Coupon code: " + code);
        System.out.println("Discount amount: " + discountAmount);
        System.out.println("Expiration date: " + expirationDate);
    }
}
