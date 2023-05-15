package com.izaanschool.datatype;
import java.util.Scanner;

public class Doctor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String name = "Dr.John Doe", specialization = "Family Doctor", contactInfo = "917-340-5690";


        System.out.print("Enter name of doctor: ");
        name = scanner.nextLine();

        System.out.print("Enter specialization of doctor: ");
        specialization = scanner.nextLine();

        System.out.print("Enter contact information of doctor: ");
        contactInfo = scanner.nextLine();


        System.out.println("Doctor name: " + name);
        System.out.println("Specialization: " + specialization);
        System.out.println("Contact information: " + contactInfo);
    }
}
