package com.izaanschool.methodcreation;
import java.util.Date;

public class NewsArticle {
    private String title;
    private String author;
    private String content;
    private Date publishDate;

    // Getters and setters methods for the properties
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public static void main(String[] args) {
        NewsArticle article = new NewsArticle();
        article.setTitle("Breaking News: Java made easy to learn");
        article.setAuthor("Salman Butt");
        article.setContent("Java is easy to learn, just follow these steps");


        Date publishDate = new Date();
        article.setPublishDate(publishDate);

        System.out.println("Title: " + article.getTitle());
        System.out.println("Author: " + article.getAuthor());
        System.out.println("Content: " + article.getContent());
        System.out.println("Publish Date: " + article.getPublishDate());
    }
}
