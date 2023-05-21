package com.izaanschool.ifelse;

public class Expense {

    public static void main(String[] args) {
        String date = "2023-05-21";
        double amount = 275.00;
        String category = "Car Payment";

        System.out.println("Date: " + date);
        System.out.println("Amount: $" + amount);
        System.out.println("Category: " + category);
        if (amount == 275.00) {
            System.out.println("Isn't it too expensive?");
        }

    }
}
