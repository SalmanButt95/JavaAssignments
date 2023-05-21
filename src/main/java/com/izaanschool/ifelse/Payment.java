package com.izaanschool.ifelse;

public class Payment {
    private String paymentMethod;
    private double amount;
    private String date;

    public Payment(String paymentMethod, double amount, String date) {
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

    public String getDate() {
        return date;
    }

    public static void main(String[] args) {
        String paymentMethod = "Credit card";
        double amount = 100.0;
        String date = "2023-05-21";

        Payment payment = new Payment(paymentMethod, amount, date);

        System.out.println("Payment Method: " + payment.getPaymentMethod());
        System.out.println("Amount: " + payment.getAmount());
        System.out.println("Date: " + payment.getDate());

        if (paymentMethod.equals("Credit card")) {
            System.out.println("Enter card number");
        } else {
            System.out.println("Pay in cash");
        }
    }
}
