package com.izaanschool.objects;
import java.time.LocalDate;

class Transaction {
    private LocalDate date;
    private double amount;
    private String description;

    public Transaction(LocalDate date, double amount, String description) {
        this.date = date;
        this.amount = amount;
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
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
        LocalDate lastWeek = LocalDate.now().minusWeeks(1);
        double amount = 100.00;
        String description = "Car Payment";

        Transaction transaction = new Transaction(lastWeek, amount, description);

        System.out.println("Date: " + transaction.getDate());
        System.out.println("Amount: " + transaction.getAmount());
        System.out.println("Description: " + transaction.getDescription());
    }
}
