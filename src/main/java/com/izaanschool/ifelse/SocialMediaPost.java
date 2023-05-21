package com.izaanschool.ifelse;

public class SocialMediaPost {
    private String author;
    private String content;
    private String date;

    public SocialMediaPost(String author, String content, String date) {
        this.author = author;
        this.content = content;
        this.date = date;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public String getDate() {
        return date;
    }

    public static void main(String[] args) {
        String author = "Salman Butt";
        String content = "Check out my Blog!";
        String date = "May 19, 2023";

        SocialMediaPost post = new SocialMediaPost(author, content, date);

        System.out.println("Author: " + post.getAuthor());
        System.out.println("Content: " + post.getContent());
        System.out.println("Date: " + post.getDate());

        if (author.equals("Salman Butt")) {
            System.out.println("Press like button");
        } else {
            System.out.println("Press unlike button");
        }
    }
}
