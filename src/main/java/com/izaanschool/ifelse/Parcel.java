package com.izaanschool.ifelse;

public class Parcel {
    private String sender;
    private String recipient;
    private int weight;

    public Parcel(String sender, String recipient, int weight) {
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

    public int getWeight() {
        return weight;
    }

    public static void main(String[] args) {
        String sender = "Salman1";
        String recipient = "Salman2";
        int weight = 3;

        Parcel parcel = new Parcel(sender, recipient, weight);

        System.out.println("Sender: " + parcel.getSender());
        System.out.println("Recipient: " + parcel.getRecipient());
        System.out.println("Weight: " + parcel.getWeight());

        if (weight == 5) {
            System.out.println("Normal Package");
        } else {
            System.out.println("Extra conditions need to be applied");
        }
    }
}
