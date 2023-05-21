package com.izaanschool.ifelse;

public class BankAccount {

    int accountNumber = 1234567890;
    double balance = 100000.0;
    String owner = "Rich Salman Butt";

    public void info() {
        System.out.println("Account Details:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
        System.out.println("Owner: " + owner);

        if (accountNumber == 1234567890) {
            System.out.println("Account is active");
        }
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.info();
    }
}
