package com.izaanschool.methodcreation;

public class Product {
    private String name;
    private double price;
    private String description;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Glass Bottle 1L");
        product.setPrice(12.99);
        product.setDescription("Glass bottle that is unbreakable");

        System.out.println("Name: " + product.getName());
        System.out.println("Price: $" + product.getPrice());
        System.out.println("Description: " + product.getDescription());
    }
}
