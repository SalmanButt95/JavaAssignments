package com.izaanschool.objects;

public class Advertisement {

private String title;
private String description;
private String target_audience;

    public static void main(String[] args) {
        System.out.println("Hello from Advertisement Class\n");

        Advertisement obj = new Advertisement();
        obj.title = "Izaan School Advertisement";
        obj.description = "Join us for Java Lessons";
        obj.target_audience = "Anybody can join!";

        System.out.println("Title : " + obj.title);
        System.out.println("\n");
        System.out.println("Description : " + obj.description);
        System.out.println("\n");
        System.out.println("Target Audience : " + obj.target_audience);


    }

}
