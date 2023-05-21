package com.izaanschool.objects;

import java.time.LocalDate;

public class PaymentMethod {
    private String type;
    private String accountNumber;
    private LocalDate expirationDate;

    public PaymentMethod(String type, String accountNumber, LocalDate expirationDate) {
        this.type = type;
        this.accountNumber = accountNumber;
        this.expirationDate = expirationDate;
    }

    public String getType() {
        return type;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public static void main(String[] args) {
        LocalDate expirationDate = LocalDate.of(2025, 12, 31);
        PaymentMethod paymentMethod = new PaymentMethod("Credit Card", "1234-5678-9012-3456", expirationDate);
        System.out.println("Payment Method Type: " + paymentMethod.getType());
        System.out.println("Account Number: " + paymentMethod.getAccountNumber());
        System.out.println("Expiration Date: " + paymentMethod.getExpirationDate());
    }
}
