package com.izaanschool.objects;

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
        Review review = new Review("Salman Butt", 5, "This product is best!");
        System.out.println("Author: " + review.getAuthor());
        System.out.println("Rating: " + review.getRating());
        System.out.println("Content: " + review.getContent());
    }
}
