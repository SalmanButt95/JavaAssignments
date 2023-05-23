package com.izaanschool.methodcreation;

public class Payment {
    private String paymentMethod;
    private double amount;
    private String date;


    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.setPaymentMethod("Credit Card");
        payment.setAmount(100.0);
        payment.setDate("2023-05-23");

        System.out.println("Payment Method: " + payment.getPaymentMethod());
        System.out.println("Amount: $" + payment.getAmount());
        System.out.println("Date: " + payment.getDate());
    }
}
