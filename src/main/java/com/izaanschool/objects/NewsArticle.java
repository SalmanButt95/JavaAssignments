package com.izaanschool.objects;

public class NewsArticle {
    private String title;
    private String author;
    private String content;

    public NewsArticle(String title, String author, String content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }

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

    public static void main(String[] args) {

        NewsArticle article = new NewsArticle("This is a news article", "Salman Butt", "This is all about Salman Butt");


        String title = article.getTitle();
        String author = article.getAuthor();
        String content = article.getContent();


        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Content: " + content);
    }
}
