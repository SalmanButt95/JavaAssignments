package com.izaanschool.objects;

public class Order {
    private String orderNumber;
    private String customer;
    private double amount;

    public Order(String orderNumber, String customer, double amount) {
        this.orderNumber = orderNumber;
        this.customer = customer;
        this.amount = amount;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public static void main(String[] args) {
        // Create an object instance of the class
        Order order = new Order("1234", "Salman Butt", 1000.0);

        // Access the object's properties
        String orderNumber = order.getOrderNumber();
        String customer = order.getCustomer();
        double amount = order.getAmount();

        // Print the object's properties
        System.out.println("Order Number: " + orderNumber);
        System.out.println("Customer: " + customer);
        System.out.println("Amount: " + amount);
    }
}
