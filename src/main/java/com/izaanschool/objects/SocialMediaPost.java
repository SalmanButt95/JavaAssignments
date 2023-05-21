package com.izaanschool.objects;

import java.util.Date;

class SocialMediaPost {
    private String author;
    private String content;
    private Date date;

    public SocialMediaPost(String author, String content, Date date) {
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
        String author = "Salman Butt";
        String content = "This is the post from Salman Butt";
        Date date = new Date();
        date.setHours(02);
        date.setMinutes(30);
        date.setSeconds(43);
        SocialMediaPost post = new SocialMediaPost(author, content, date);

        System.out.println("Author: " + post.getAuthor());
        System.out.println("Content: " + post.getContent());
        System.out.println("Date: " + post.getDate());
    }
}
