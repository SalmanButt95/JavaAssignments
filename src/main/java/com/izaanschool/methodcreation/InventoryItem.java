package com.izaanschool.methodcreation;

public class InventoryItem {
    private String name;
    private int quantity;
    private String location;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public static void main(String[] args) {
        InventoryItem item = new InventoryItem();
        item.setName("Java Book");
        item.setQuantity(10);
        item.setLocation("Shelf 3A");

        System.out.println("Item Name: " + item.getName());
        System.out.println("Quantity: " + item.getQuantity());
        System.out.println("Location: " + item.getLocation());
    }
}
