package com.izaanschool.ifelse;

public class Contact {
    private String name;
    private String email;
    private static int phoneNumber;

    public Contact(String name, String email, int phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void info() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
    }

    public static void main(String[] args) {
        Contact contact = new Contact("Salman Butt", "Salman@example.com", 1234567890);
        contact.info();

        if (phoneNumber == 1234567890) {
            System.out.println("This is the correct number");

        }
    }

}

