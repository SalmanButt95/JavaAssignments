package com.izaanschool.objects;

import java.time.LocalDate;

class SocialMediaComment {
    private String author;
    private String content;
    private LocalDate date;

    public SocialMediaComment(String author, String content, LocalDate date) {
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public static void main(String[] args) {
        String author = "Salman Butt";
        String content = "Post daily content of the life of Salman Butt";
        LocalDate date = LocalDate.now();
        SocialMediaComment comment = new SocialMediaComment(author, content, date);

        System.out.println("Author: " + comment.getAuthor());
        System.out.println("Content: " + comment.getContent());
        System.out.println("Date: " + comment.getDate());
    }
}
