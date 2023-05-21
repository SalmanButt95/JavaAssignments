package com.izaanschool.objects;

public class OrderItem {
    private String product;
    private int quantity;
    private double price;

    public OrderItem(String product, int quantity, double price) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public static void main(String[] args) {
        OrderItem orderItem = new OrderItem("Glass Bottle 1L", 1, 12.99);
        System.out.println("Product: " + orderItem.getProduct());
        System.out.println("Quantity: " + orderItem.getQuantity());
        System.out.println("Price: $" + orderItem.getPrice());
    }
}
