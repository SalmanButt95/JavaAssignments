package com.izaanschool.objects;

import java.util.Date;

public class Expense {
    private Date date;
    private double amount;
    private String category;

    public Expense(Date date, double amount, String category) {
        this.date = date;
        this.amount = amount;
        this.category = category;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public static void main(String[] args) {
        Expense expense = new Expense(new Date(), 326.0, "Car Payment");

        Date date = new Date();
        expense.setDate(date);

        Date expenseDate = expense.getDate();
        double amount = expense.getAmount();
        String category = expense.getCategory();

        System.out.println("Date: " + expenseDate);
        System.out.println("Amount: " + amount);
        System.out.println("Category: " + category);
    }
}
