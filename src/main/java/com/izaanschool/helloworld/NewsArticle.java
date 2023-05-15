package com.izaanschool.helloworld;
public class NewsArticle {

    public static void main(String[] args) {

        System.out.println("Title : 5 Reasons That Explain Why You Need To Learn Java");
        System.out.println("Author: Salman Butt");
        System.out.println("Content");
        String[] names = {"Beginner Friendly and Competitive Edge", "Updated features ", "Code Portability and Versatility", "Open-source Library Support", "Java Enterprise Edition and API"};

        for (int i = 1; i <= names.length; i++) {
            System.out.println(i + ". " + names[i - 1]);

        }

    }
}
