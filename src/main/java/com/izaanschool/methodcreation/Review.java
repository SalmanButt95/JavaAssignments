package com.izaanschool.methodcreation;

import java.util.Date;

public class Review {
    private String author;
    private int rating;
    private String content;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public static void main(String[] args) {
        Review review = new Review();
        review.setAuthor("Salman Butt");
        review.setRating(5);
        review.setContent("This glass bottle is amazing!");
        review.setDate(new Date());

        System.out.println("Author: " + review.getAuthor());
        System.out.println("Rating: " + review.getRating());
        System.out.println("Content: " + review.getContent());
        System.out.println("Date: " + review.getDate());
    }
}
