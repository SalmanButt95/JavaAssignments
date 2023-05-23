package com.izaanschool.methodcreation;

public class BlogPost {

private String Title;
private String Author;
private String Content;

public String getTitle () {return Title;}
public void setTitle (String Title) {this.Title= Title;}

public String getAuthor () {return Author;}
public void setAuthor (String Author) {this.Author = Author;}

public String getContent ( ) {return Content;}
public void setContent (String Content) { this.Content = Content;}

    public static void main(String[] args) {

        BlogPost bp = new BlogPost();
        bp.setTitle("Welcome to Salman's Blog Post");
        bp.setAuthor("Salman Butt");
        bp.setContent("Java Lessons");

        System.out.println("Blog Post Details");
        System.out.println("Title : " + bp.getTitle());
        System.out.println("Author : " + bp.getContent());
        System.out.println("Content : " + bp.getContent());
    }
}
