package com.izaanschool.ifelse;

public class Doctor {

    public static void main(String[] args) {
        String name = "Dr. Example";
        String specialization = "Exampleology";
        String contactInformation = "Example@example.com";

        System.out.println("Name: " + name);
        System.out.println("Specialization: " + specialization);
        System.out.println("Contact Information: " + contactInformation);
        if (name.equals("Dr. Example")) {
            System.out.println("Dr. Example is my doctor");
        }
    }
}
