package com.izaanschool.methodcreation;

import java.util.Date;

public class SocialMediaComment {
    private String author;
    private String content;
    private Date date;

    // Getters and setters methods for the properties
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
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
        SocialMediaComment comment = new SocialMediaComment();
        comment.setAuthor("SalmanButt");
        comment.setContent("This is a great post!");
        comment.setDate(new Date());

        System.out.println("Author: " + comment.getAuthor());
        System.out.println("Content: " + comment.getContent());
        System.out.println("Date: " + comment.getDate());
    }
}
