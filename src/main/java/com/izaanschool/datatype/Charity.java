package com.izaanschool.datatype;

import java.util.Scanner;

public class Charity {
    public static void main(String[] args) {

        String name = "World Charity";
        String mission = "Protect and provide for families all over the world!";
        double donations = 1340.59;


        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the charity name: " );
        name = scanner.nextLine();

        System.out.print("Enter the charity mission: " );
        mission = scanner.nextLine();

        System.out.print("Enter the total donations: " );
        donations = scanner.nextInt();


        scanner.close();


        System.out.println("Charity Name: " + name);
        System.out.println("Charity Mission: " + mission);
        System.out.println("Total Donations: " + donations);
    }
}
