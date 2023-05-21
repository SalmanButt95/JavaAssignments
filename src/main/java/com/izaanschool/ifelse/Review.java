package com.izaanschool.ifelse;

public class Review {
    private String author;
    private int rating;
    private String content;

    public Review(String author, int rating, String content) {
        this.author = author;
        this.rating = rating;
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public int getRating() {
        return rating;
    }

    public String getContent() {
        return content;
    }

    public static void main(String[] args) {
        String author = "Salman Butt";
        int rating = 5;
        String content = "The movie was excellent";

        Review review = new Review(author, rating, content);

        System.out.println("Author: " + review.getAuthor());
        System.out.println("Rating: " + review.getRating());
        System.out.println("Content: " + review.getContent());

        if (rating > 2) {
            System.out.println("Good movie");
        } else {
            System.out.println("Boring");
        }
    }
}
