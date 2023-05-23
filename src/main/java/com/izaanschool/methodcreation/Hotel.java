package com.izaanschool.methodcreation;

public class Hotel {
    private String name;
    private String address;
    private int numberOfRooms;


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
        Hotel hotel = new Hotel();
        hotel.setName("Salman Hotel");
        hotel.setAddress("123 Salman Street");
        hotel.setNumberOfRooms(1000);

        System.out.println("Hotel Name: " + hotel.getName());
        System.out.println("Address: " + hotel.getAddress());
        System.out.println("Number of Rooms: " + hotel.getNumberOfRooms());
    }
}
