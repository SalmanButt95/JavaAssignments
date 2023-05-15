package com.izaanschool.datatype;
public class Advertisement {
    public static void main(String[] args) {
        String title = "IzaanSchool";
        String description = "Come Learn and Grow with Izaan School!";
        String targetAudience = "For Beginners and Experts!";

        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("Target Audience: " + targetAudience);

        boolean isSponsored = false;
        boolean isFeatured = true;
        System.out.println("\n");


        System.out.println("Is Sponsored: " + isSponsored);
        System.out.println("Is Featured: " + isFeatured);
        System.out.println("\n");

        System.out.println("Is the advertisement sponsored?: " + (isSponsored ? "yes" : "no"));
        System.out.println("Is the advertisement featured?: " + (isFeatured ? "yes" : "no"));

    }

    }

