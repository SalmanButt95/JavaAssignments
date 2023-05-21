package com.izaanschool.objects;

public class RecipeIngredient {
    private String name;
    private double amount;
    private String unit;

    public RecipeIngredient(String name, double amount, String unit) {
        this.name = name;
        this.amount = amount;
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    public String getUnit() {
        return unit;
    }

    public static void main(String[] args) {
        RecipeIngredient ingredient = new RecipeIngredient("Rice", 2.5, "cups");
        System.out.println("Ingredient Name: " + ingredient.getName());
        System.out.println("Amount: " + ingredient.getAmount() + " " + ingredient.getUnit());
    }
}
