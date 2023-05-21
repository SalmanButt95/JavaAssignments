package com.izaanschool.objects;

public class Recipe {
    private String name;
    private String ingredients;
    private String instructions;

    public Recipe(String name, String ingredients, String instructions) {
        this.name = name;
        this.ingredients = ingredients;
        this.instructions = instructions;
    }

    public String getName() {
        return name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    public static void main(String[] args) {
        Recipe recipe = new Recipe("Java Expert", "Commitment, Desire, Determination", "\nStep 1: Study \nStep 2: Study a lot more");
        System.out.println("Recipe Name: " + recipe.getName());
        System.out.println("Ingredients: " + recipe.getIngredients());
        System.out.println("Instructions: " + recipe.getInstructions());
    }
}
