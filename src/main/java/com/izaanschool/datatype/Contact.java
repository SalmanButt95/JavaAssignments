package com.izaanschool.datatype;
import java.util.Scanner;

public class Contact {
    public static void main(String[] args) {

        String name = "Salman Butt", email = "Salmanabutt95@gmail.com", phone = "123-456-7890";


        Scanner input = new Scanner(System.in);
        System.out.print("Enter contact name: ");
        name = input.nextLine();
        System.out.print("Enter contact email: ");
        email = input.nextLine();
        System.out.print("Enter contact phone number: ");
        phone = input.nextLine();
        input.close();


        System.out.println("Contact name: " + name);
        System.out.println("Contact email: " + email);
        System.out.println("Contact phone number: " + phone);
    }
}
