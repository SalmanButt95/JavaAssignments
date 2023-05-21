package com.izaanschool.objects;

public class Product {
    private String name;
    private double price;
    private String description;

    public Product(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public static void main(String[] args) {
        Product product = new Product("Glass Bottle 1L", 12.99, "Unbreakable glass that can contain up till 1 liter");
        System.out.println("Product Name: " + product.getName());
        System.out.println("Price: $" + product.getPrice());
        System.out.println("Description: " + product.getDescription());
    }
}
