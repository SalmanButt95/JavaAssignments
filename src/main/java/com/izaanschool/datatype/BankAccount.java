package com.izaanschool.datatype;


public class BankAccount {
    public static void main(String[] args) {

        String accountNumber = "1234567890";
        double balance = 5489.56;
        String owner = "Salman Butt";


        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Owner: " + owner);
        System.out.println("\n");

        boolean isActive = true;
        boolean isClosed = false;


        System.out.println("Is Active: " + isActive);
        System.out.println("Is Closed: " + isClosed);

        System.out.println("\n");
        System.out.println("Is the Account active?: " + (isActive ? "yes" : "no"));
        System.out.println("Is the Account close?: " + (isClosed ? "yes" : "no"));



    }
}
