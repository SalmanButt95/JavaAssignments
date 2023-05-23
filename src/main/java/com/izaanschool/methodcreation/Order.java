package com.izaanschool.methodcreation;
import java.util.Date;
public class Order {
    private String orderNumber;
    private String customer;
    private double amount;
    private Date orderDate;


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

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public static void main(String[] args) {
        Order order = new Order();
        order.setOrderNumber("Order Number 1234");
        order.setCustomer("Salman Butt");
        order.setAmount(24.99);


        Date orderDate = new Date();
        order.setOrderDate(orderDate);

        System.out.println("Order Number: " + order.getOrderNumber());
        System.out.println("Customer: " + order.getCustomer());
        System.out.println("Amount: $" + order.getAmount());
        System.out.println("Order Date: " + order.getOrderDate());
    }
}
