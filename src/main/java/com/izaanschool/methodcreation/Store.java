package com.izaanschool.methodcreation;

public class Store {
    // Class properties/variables
    private String name;
    private String location;
    private int inventory;

    // Getters and setters methods for the properties
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    // Main method
    public static void main(String[] args) {

        Store store = new Store();


        store.setName("Salman's Store");
        store.setLocation("New York");
        store.setInventory(100);


        System.out.println("Store Name: " + store.getName());
        System.out.println("Location: " + store.getLocation());
        System.out.println("Inventory: " + store.getInventory());
    }
}
