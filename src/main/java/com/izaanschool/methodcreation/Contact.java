package com.izaanschool.methodcreation;

public class Contact {
    private String name;
    private String email;
    private String phoneNumber;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static void main(String[] args) {
        Contact contact = new Contact();

        contact.setName("Salman Butt");
        contact.setEmail("SalmanButt@example.com");
        contact.setPhoneNumber("123-456-7890");

        System.out.println("Contact Details");
        System.out.println("Name: " + contact.getName());
        System.out.println("Email: " + contact.getEmail());
        System.out.println("Phone Number: " + contact.getPhoneNumber());
    }
}
