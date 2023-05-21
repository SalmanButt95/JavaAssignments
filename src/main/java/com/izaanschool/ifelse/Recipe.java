package com.izaanschool.ifelse;

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
        String name = "Grilled Steak";
        String ingredients = "meat, salt, pepper";
        String instructions = "1. Season the meat with salt and pepper. 2. Grill the meat ";

        Recipe recipe = new Recipe(name, ingredients, instructions);

        System.out.println("Recipe Name: " + recipe.getName());
        System.out.println("Ingredients: " + recipe.getIngredients());
        System.out.println("Instructions: " + recipe.getInstructions());

        if (ingredients.contains("meat")) {
            System.out.println("Let's cook");
        } else {
            System.out.println("I do not like vegetables much");
        }
    }
}
