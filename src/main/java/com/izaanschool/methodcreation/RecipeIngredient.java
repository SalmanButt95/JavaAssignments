package com.izaanschool.methodcreation;

public class RecipeIngredient {
    private String name;
    private double amount;
    private String unit;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public static void main(String[] args) {
        RecipeIngredient ingredient = new RecipeIngredient();
        ingredient.setName("Water");
        ingredient.setAmount(2.5);
        ingredient.setUnit("cups");

        System.out.println("Ingredient: " + ingredient.getName());
        System.out.println("Amount: " + ingredient.getAmount() + " " + ingredient.getUnit());
    }
}
