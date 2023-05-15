package com.izaanschool.datatype;

public class BlogAuthor {

    public static void main(String[] args) {
        String name = "Salman Butt";
        String bio = "Hello! My name is Salman Butt, and welcome to the journey  thru java! We will learn step-by-step why java is the best!";
        String articles = "www.SalmanArticlesforJavaLearning.com";

        System.out.println("Name: " + name);
        System.out.println("Bio: " + bio);
        System.out.println("Articles: " + articles);

        boolean hasPublished = true;
        boolean isCoAuthor = false;

        System.out.println("\n");
        System.out.println("Has published? " + hasPublished);
        System.out.println("is co-author? " + isCoAuthor);
        System.out.println("\n");

        System.out.println("Has the Author been published? " + (hasPublished ? "yes" : "no"));
        System.out.println("Has the Author been co-author? " + (isCoAuthor ? "yes" : "no"));



    }
}
