package com.izaanschool.methodcreation;
public class Advertisement {
    // Declare Class properties/variables
    private String title;
    private String description;
    private String targetAudience;

    // Getters and setters methods for the properties
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTargetAudience() {
        return targetAudience;
    }

    public void setTargetAudience(String targetAudience) {
        this.targetAudience = targetAudience;
    }

    // Declare Main Method
    public static void main(String[] args) {
        // Create an object instance of the class
        Advertisement ad = new Advertisement();

        // Set the property values using the setter methods
        ad.setTitle("New Product Launch");
        ad.setDescription("Introducing our latest product with advanced features.");
        ad.setTargetAudience("Tech enthusiasts");

        // Access the object's properties using the getter methods
        System.out.println("Advertisement Details:");
        System.out.println("Title: " + ad.getTitle());
        System.out.println("Description: " + ad.getDescription());
        System.out.println("Target Audience: " + ad.getTargetAudience());
    }
}
