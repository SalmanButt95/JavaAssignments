package com.izaanschool.methodcreation;

public class Parcel {
    private String sender;
    private String recipient;
    private double weight;


    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public static void main(String[] args) {
        Parcel parcel = new Parcel();
        parcel.setSender("Salman Butt");
        parcel.setRecipient("Salman's Friend");
        parcel.setWeight(2.5);

        System.out.println("Sender: " + parcel.getSender());
        System.out.println("Recipient: " + parcel.getRecipient());
        System.out.println("Weight: " + parcel.getWeight() + " Lbs");
    }
}
