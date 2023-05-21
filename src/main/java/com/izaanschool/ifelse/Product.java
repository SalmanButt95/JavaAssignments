package com.izaanschool.ifelse;

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
        String name = "Glass Bottle";
        double price = 12.99;
        String description = "A unbreakable glass bottle";

        Product product = new Product(name, price, description);

        System.out.println("Product Name: " + product.getName());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Description: " + product.getDescription());

        if (name.equals("Glass Bottle")) {
            System.out.println("Let's buy");
        } else {
            System.out.println("I cannot shop");
        }
    }
}
