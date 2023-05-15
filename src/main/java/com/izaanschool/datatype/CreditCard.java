package com.izaanschool.datatype;
import java.util.Scanner;

public class CreditCard {

    public static void main(String[] args) {

        String number = "1234-5678-9012-3456";
        String expirationDate = "12/25";
        String cardholderName = "Salman Butt";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter coupon code: ");
        number = scanner.nextLine();

        System.out.print("Enter discount amount: ");
        expirationDate = scanner.nextLine();

        System.out.print("Enter expiration date (YYYY-MM-DD): ");
        cardholderName= scanner.nextLine();

        scanner.close();



        System.out.println("Credit card number: " + number);
        System.out.println("Expiration date: " + expirationDate);
        System.out.println("Cardholder name: " + cardholderName);

    }
}
