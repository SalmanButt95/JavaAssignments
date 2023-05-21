package com.izaanschool.objects;

public class Hotel {
    private String name;
    private String address;
    private int numberOfRooms;

    public Hotel(String name, String address, int numberOfRooms) {
        this.name = name;
        this.address = address;
        this.numberOfRooms = numberOfRooms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public static void main(String[] args) {
        Hotel hotel = new Hotel("The Salman Hotel", "123 Example Street", 100);

        String name = hotel.getName();
        String address = hotel.getAddress();
        int numberOfRooms = hotel.getNumberOfRooms();

        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Number of Rooms: " + numberOfRooms);
    }
}
