package com.izaanschool.objects;

public class InventoryItem {
    private String name;
    private int quantity;
    private String location;

    public InventoryItem(String name, int quantity, String location) {
        this.name = name;
        this.quantity = quantity;
        this.location = location;
    }

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
        InventoryItem item = new InventoryItem("Glass Bottle 1L", 5, "Storage Room");

        String name = item.getName();
        int quantity = item.getQuantity();
        String location = item.getLocation();

        System.out.println("Name: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Location: " + location);
    }
}
