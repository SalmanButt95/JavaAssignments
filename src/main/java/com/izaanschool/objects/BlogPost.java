package com.izaanschool.objects;
class BlogPost {
    private String title;
    private String author;
    private String content;

    public BlogPost(String title, String author, String content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public static void main(String[] args) {
        BlogPost post = new BlogPost("My Java Blog", "Salman Butt", "Come learn Java with him!");

        String title = post.getTitle();
        String author = post.getAuthor();
        String content = post.getContent();

        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Content: " + content);
    }
}
