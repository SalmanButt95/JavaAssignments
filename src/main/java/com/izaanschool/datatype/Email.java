package com.izaanschool.datatype;

import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare variables with appropriate data type for each property
        String sender = "Salman Butt";
        String recipient = "John Doe";
        String subject = "Java Class Date";
        String body = "Hello Joe, next class is tomorrow at 5pm";

        // Take input from user for value of each variable
        System.out.print("Enter the sender: ");
        sender = scanner.nextLine();

        System.out.print("Enter the recipient: ");
        recipient = scanner.nextLine();

        System.out.print("Enter the subject: ");
        subject = scanner.nextLine();

        System.out.print("Enter the body: ");
        body = scanner.nextLine();


        System.out.println("Sender: " + sender);
        System.out.println("Recipient: " + recipient);
        System.out.println("Subject: " + subject);
        System.out.println("Body: " + body);

        scanner.close();
    }
}
