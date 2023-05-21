package com.izaanschool.ifelse;

public class ShoppingCart {
    private String items;
    private int quantity;
    private double totalPrice;

    public ShoppingCart(String items, int quantity, double totalPrice) {
        this.items = items;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    public String getItems() {
        return items;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public static void main(String[] args) {
        String items = "Water Bottles";
        int quantity = 25;
        double totalPrice = 100.0;

        ShoppingCart cart = new ShoppingCart(items, quantity, totalPrice);

        System.out.println("Items: " + cart.getItems());
        System.out.println("Quantity: " + cart.getQuantity());
        System.out.println("Total Price: $" + cart.getTotalPrice());

        if (quantity > 50) {
            System.out.println("You are shopaholic");
        } else {
            System.out.println("Keep shopping");
        }
    }
}
