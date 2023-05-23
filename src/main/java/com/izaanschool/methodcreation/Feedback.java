package com.izaanschool.methodcreation;

import java.util.Date;

public class Feedback {
    private String author;
    private int rating;
    private String comment;
    private Date date;


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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    public static void main(String[] args) {

        Feedback feedback = new Feedback();

        Date currentDate = new Date();
        feedback.setDate(currentDate);


        feedback.setAuthor("Glass Bottle 1L");
        feedback.setRating(5);
        feedback.setComment("Great bottle!");

        System.out.println("Author: " + feedback.getAuthor());
        System.out.println("Rating: " + feedback.getRating());
        System.out.println("Comment: " + feedback.getComment());
        System.out.println("Date: " + feedback.getDate());
    }
}

