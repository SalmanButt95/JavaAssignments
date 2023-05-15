package com.izaanschool.datatype;

import java.util.Scanner;

public class Employee {

    public static void main(String[] args) {

        String name = "Salman Butt";
        String designation = "Java Expert";
        String salary = "$100,000";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = scanner.nextLine();

        System.out.print("Enter Designation: ");
        designation = scanner.nextLine();

        System.out.print("Enter Salary: ");
        salary= scanner.nextLine();

        scanner.close();



        System.out.println("Credit card number: " + name);
        System.out.println("Expiration date: " + designation);
        System.out.println("Cardholder name: " + salary);

    }
}
