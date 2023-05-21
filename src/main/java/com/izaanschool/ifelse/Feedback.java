package com.izaanschool.ifelse;

public class Feedback {

    public static void main(String[] args) {
        String author = "Salman";
        int rating = 5;
        String comment = "Awesome Java Expert";

        System.out.println("Author: " + author);
        System.out.println("Rating: " + rating);
        System.out.println("Comment: " + comment);
        if (author.equals("Salman")) {
            System.out.println("He is the author.");
        }
    }
}
