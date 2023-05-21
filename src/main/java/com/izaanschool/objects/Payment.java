package com.izaanschool.objects;

import java.time.LocalDate;

public class Payment {
    private String paymentMethod;
    private double amount;
    private LocalDate date;

    public Payment(String paymentMethod, double amount, LocalDate date) {
        this.paymentMethod = paymentMethod;
        this.amount = amount;
        this.date = date;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public static void main(String[] args) {
        LocalDate paymentDate = LocalDate.of(2024, 12, 31);
        Payment payment = new Payment("Debit Card", 100.0, paymentDate);
        System.out.println("Payment Method: " + payment.getPaymentMethod());
        System.out.println("Amount: $" + payment.getAmount());
        System.out.println("Date: " + payment.getDate());
    }
}
