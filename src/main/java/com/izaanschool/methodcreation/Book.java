package com.izaanschool.methodcreation;

public class Book {
    private String title;
    private String author;
    private String ISBN;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public static void main(String[] args) {
        Book book = new Book();

        book.setTitle("Java Made Easy");
        book.setAuthor("Salman Butt");
        book.setISBN("123456-0987");

        System.out.println("Book Details");
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("ISBN: " + book.getISBN());
    }
}
