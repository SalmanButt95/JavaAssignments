package com.izaanschool.methodcreation;

public class Recipe {
    private String name;
    private String[] ingredients;
    private String[] instructions;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public String[] getInstructions() {
        return instructions;
    }

    public void setInstructions(String[] instructions) {
        this.instructions = instructions;
    }

    public static void main(String[] args) {
        Recipe recipe = new Recipe();
        recipe.setName("Chocolate Chip Cookies");
        recipe.setIngredients(new String[]{"Flour", "Sugar", "Butter", "Chocolate Chips"});
        recipe.setInstructions(new String[]{"Preheat oven to 350°F", "Mix ingredients in a bowl", "Bake for 10-12 minutes"});

        System.out.println("Recipe: " + recipe.getName());
        System.out.println("Ingredients: " + String.join(", ", recipe.getIngredients()));
        System.out.println("Instructions: " + String.join(", ", recipe.getInstructions()));
    }
}
