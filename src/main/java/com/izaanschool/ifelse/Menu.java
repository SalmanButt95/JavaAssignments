package com.izaanschool.ifelse;

public class Menu {
    private String[] items;
    private double[] prices;
    private boolean isVegetarian;
    private String[] descriptions;

    public Menu(String[] items, double[] prices, boolean isVegetarian, String[] descriptions) {
        this.items = items;
        this.prices = prices;
        this.isVegetarian = isVegetarian;
        this.descriptions = descriptions;
    }

    public String[] getItems() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }

    public double[] getPrices() {
        return prices;
    }

    public void setPrices(double[] prices) {
        this.prices = prices;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        isVegetarian = vegetarian;
    }

    public String[] getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String[] descriptions) {
        this.descriptions = descriptions;
    }

    public static void main(String[] args) {
        String[] items = { "Chicken Salad", "Mushroom Soup", "Steak & Potatoes" };
        double[] prices = { 9.99, 5.99, 19.99 };
        boolean isVegetarian = false;
        String[] descriptions = { "Fresh chicken salad with mixed greens", "Hot and hearty mushroom soup", "Delicious tender steak with mashed potatoes and veggies" };

        Menu menu = new Menu(items, prices, isVegetarian, descriptions);

        System.out.println("Menu Items:");
        for (String item : menu.getItems()) {
            System.out.println("- " + item);
        }

        System.out.println("\nPrices:");
        for (double price : menu.getPrices()) {
            System.out.println("- $" + price);
        }

        System.out.println("\nDescriptions:");
        for (String description : menu.getDescriptions()) {
            System.out.println("- " + description);
        }
        System.out.println("\nIs Not Vegetarian: " + menu.isVegetarian());
        if (menu.isVegetarian()) {
            System.out.println("\nAll Menu foods are for Vegetarians!");
        } else {
            System.out.println("\nBring some meat too");
        }
    }
}
