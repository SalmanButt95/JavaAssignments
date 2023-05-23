package com.izaanschool.methodcreation;

public class SubscriptionPlan {

    private String name;
    private double price;
    private String features;


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

        SubscriptionPlan plan = new SubscriptionPlan();


        plan.setName("Netflix Subscription");
        plan.setPrice(14.99);
        plan.setFeatures("Unlimited access to all HD content");


        System.out.println("Plan Name: " + plan.getName());
        System.out.println("Price: $" + plan.getPrice());
        System.out.println("Features: " + plan.getFeatures());
    }
}
