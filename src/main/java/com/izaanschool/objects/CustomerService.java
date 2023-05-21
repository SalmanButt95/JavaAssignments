package com.izaanschool.objects;

public class CustomerService {
    private String name;
    private String phoneNumber;
    private String email;

    public CustomerService(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static void main(String[] args) {
        CustomerService customerService = new CustomerService("Salman Butt", "123-456-7890", "SalmanButt@example.com");

        String name = customerService.getName();
        String phoneNumber = customerService.getPhoneNumber();
        String email = customerService.getEmail();

        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email: " + email);
    }
}
