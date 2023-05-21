package com.izaanschool.objects;

import java.util.Date;

public class Feedback {
    private String author;
    private int rating;
    private String comment;

    public Feedback(String author, int rating, String comment) {
        this.author = author;
        this.rating = rating;
        this.comment = comment;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public static void main(String[] args) {
        Feedback feedback = new Feedback("Salman Butt", 5, "Best Class Ever!");

        String author = feedback.getAuthor();
        int rating = feedback.getRating();
        String comment = feedback.getComment();

        System.out.println("Author: " + author);
        System.out.println("Rating: " + rating);
        System.out.println("Comment: " + comment);
    }
}
