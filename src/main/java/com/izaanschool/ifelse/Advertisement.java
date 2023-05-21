package com.izaanschool.ifelse;
public class Advertisement {

    public static void main(String[] args) {

        System.out.println("Hello From Advertisement Class!\n");

        String title = "Java 101";
        String description = "Java made easy 101!";
        String targetAudience = "Everyone who wants to learn!";


        if (title.equals("Java 101")) {
            System.out.println("Java 101 is the Title\n");
        }
        if (description.equals("Java made easy 101!"))
            System.out.println("Description : Java made easy 101!\n");
        if (targetAudience.equals("Everyone who wants to learn!")) {
            System.out.println("Everyone is the targeted audience for this Advertisement.\n");
        }
    }
}
