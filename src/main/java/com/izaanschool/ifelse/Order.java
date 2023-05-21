package com.izaanschool.ifelse;

public class Order {
    private int orderNumber;
    private String customerType;
    private double amount;

    public Order(int orderNumber, String customerType, double amount) {
        this.orderNumber = orderNumber;
        this.customerType = customerType;
        this.amount = amount;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getCustomerType() {
        return customerType;
    }

    public double getAmount() {
        return amount;
    }

    public static void main(String[] args) {
        int orderNumber = 001;
        String customerType = "regular";
        double amount = 120.0;

        Order order = new Order(orderNumber, customerType, amount);

        System.out.println("Order Number: " + order.getOrderNumber());
        System.out.println("Customer Type: " + order.getCustomerType());
        System.out.println("Amount: " + order.getAmount());

        if (customerType.equals("regular")) {
            System.out.println("Give extra discount");
        } else {
            System.out.println("No discount");
        }
    }
}
