package com.izaanschool.objects;

class BankAccount {
    private int accountNumber;
    private double balance;
    private String owner;

    public BankAccount(int accountNumber, double balance, String owner) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(123456789, 1500.0, "Salman Butt");

        int accountNumber = account.getAccountNumber();
        double balance = account.getBalance();
        String owner = account.getOwner();

        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
        System.out.println("Owner: " + owner);
    }
}
