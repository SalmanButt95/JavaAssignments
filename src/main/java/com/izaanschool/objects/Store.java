package com.izaanschool.objects;

class Store {
    private String name;
    private String location;
    private int inventory;

    public Store(String name, String location, int inventory) {
        this.name = name;
        this.location = location;
        this.inventory = inventory;
    }

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

    public static void main(String[] args) {
        String name = "Glass Bottle 1L";
        String location = "Isle 3 Section B";
        int inventory = 25;
        Store store = new Store(name, location, inventory);

        System.out.println("Name: " + store.getName());
        System.out.println("Location: " + store.getLocation());
        System.out.println("Inventory: " + store.getInventory());
    }
}
