package com.izaanschool.objects;

class SubscriptionPlan {
    private String name;
    private double price;
    private String features;

    public SubscriptionPlan(String name, double price, String features) {
        this.name = name;
        this.price = price;
        this.features = features;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public static void main(String[] args) {
        String name = "Netflix Subscription";
        double price = 14.99;
        String features = "Access to HD streaming and unlimited downloads";

        SubscriptionPlan plan = new SubscriptionPlan(name, price, features);

        System.out.println("Name: " + plan.getName());
        System.out.println("Price: " + plan.getPrice());
        System.out.println("Features: " + plan.getFeatures());
    }
}
