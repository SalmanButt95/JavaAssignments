package com.izaanschool.objects;

public class Parcel {
    private String sender;
    private String recipient;
    private double weight;

    public Parcel(String sender, String recipient, double weight) {
        this.sender = sender;
        this.recipient = recipient;
        this.weight = weight;
    }

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public double getWeight() {
        return weight;
    }

    public static void main(String[] args) {
        Parcel parcel = new Parcel("Salman Butt", "Izaan School", 5.5);
        System.out.println("Sender: " + parcel.getSender());
        System.out.println("Recipient: " + parcel.getRecipient());
        System.out.println("Weight: " + parcel.getWeight() + " lbs");
    }
}
