package com.izaanschool.ifelse;

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

    public int getQuantity() {
        return quantity;
    }

    public String getLocation() {
        return location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public static void main(String[] args) {

        int quantity = 5;


        InventoryItem item = new InventoryItem("Glass Bottle", quantity, "Isle 3a");

        // Access and print the properties of the item
        System.out.println("Name: " + item.getName());
        System.out.println("Quantity: " + item.getQuantity());
        System.out.println("Location: " + item.getLocation());

        if (quantity < 10) {

            System.out.println("Inventory Items has to be less than 10!");
        } else {

            System.out.println("Inventory Items are now: " + quantity);
        }
    }
}
