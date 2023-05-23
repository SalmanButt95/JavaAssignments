package com.izaanschool.methodcreation;

public class PaymentMethod {
    private String type;
    private String accountNumber;
    private String expirationDate;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public static void main(String[] args) {
        PaymentMethod paymentMethod = new PaymentMethod();
        paymentMethod.setType("Credit Card");
        paymentMethod.setAccountNumber("1234-5678-9012-3456");
        paymentMethod.setExpirationDate("05/2025");

        System.out.println("Payment Method Type: " + paymentMethod.getType());
        System.out.println("Account Number: " + paymentMethod.getAccountNumber());
        System.out.println("Expiration Date: " + paymentMethod.getExpirationDate());
    }
}
