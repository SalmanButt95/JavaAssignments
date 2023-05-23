package com.izaanschool.methodcreation;

public class OrderItem {
    private String product;
    private int quantity;
    private double price;


    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void main(String[] args) {
        OrderItem item = new OrderItem();
        item.setProduct("Glass Bottle 1L");
        item.setQuantity(1);
        item.setPrice(9.99);

        System.out.println("Product: " + item.getProduct());
        System.out.println("Quantity: " + item.getQuantity());
        System.out.println("Price: $" + item.getPrice());
    }
}
