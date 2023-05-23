package com.izaanschool.methodcreation;

public class CustomerService {
    private String name;
    private String phoneNumber;
    private String email;

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static void main(String[] args) {
        CustomerService customerService = new CustomerService();

        customerService.setName("Salman Butt");
        customerService.setPhoneNumber("123-456-7890");
        customerService.setEmail("SalmanButt@example.com");

        System.out.println("Customer Service Details");
        System.out.println("Name: " + customerService.getName());
        System.out.println("Phone Number: " + customerService.getPhoneNumber());
        System.out.println("Email: " + customerService.getEmail());
    }
}
