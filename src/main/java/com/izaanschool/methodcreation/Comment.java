package com.izaanschool.methodcreation;

import java.util.Date;

public class Comment {
    private String author;
    private String content;
    private Date date;


    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public Date getDate() {
        return date;
    }


    public void setAuthor(String author) {
        this.author = author;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public static void main(String[] args) {
        Comment comment = new Comment();

        comment.setAuthor("Salman Butt");
        comment.setContent("This is the best!");
        comment.setDate(new Date());

        System.out.println("Comment Details");
        System.out.println("Author: " + comment.getAuthor());
        System.out.println("Content: " + comment.getContent());
        System.out.println("Date: " + comment.getDate());
    }
}
