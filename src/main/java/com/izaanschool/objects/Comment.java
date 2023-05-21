package com.izaanschool.objects;

import java.util.Date;

public class Comment {
    private String author;
    private String content;
    private Date date;

    public Comment(String author, String content, Date date) {
        this.author = author;
        this.content = content;
        this.date = date;
    }

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
        Comment comment = new Comment("Salman Butt", "This is awesome!", new Date(2023-05-20));

        String author = comment.getAuthor();
        String content = comment.getContent();
        Date date = comment.getDate();

        System.out.println("Author: " + author);
        System.out.println("Content: " + content);
        System.out.println("Date: " + date);
    }
}
