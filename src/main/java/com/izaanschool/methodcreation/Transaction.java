package com.izaanschool.methodcreation;

public class Transaction {

    private String date;
    private double amount;
    private String description;


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public static void main(String[] args) {

        Transaction transaction = new Transaction();


        transaction.setDate("12/12/12");
        transaction.setAmount(12.99);
        transaction.setDescription("Glass Bottle 1L");


        System.out.println("Transaction Date: " + transaction.getDate());
        System.out.println("Transaction Amount: " + transaction.getAmount());
        System.out.println("Transaction Description: " + transaction.getDescription());
    }
}
