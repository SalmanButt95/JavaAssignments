package com.izaanschool.methodcreation;

public class LibraryBook {
    private String title;
    private String author;
    private String isbn;


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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public static void main(String[] args) {
        LibraryBook book = new LibraryBook();
        book.setTitle("The Great Story of Salman Butt");
        book.setAuthor("Salman Butt");
        book.setIsbn("12-34567-890");

        System.out.println("Book Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("ISBN: " + book.getIsbn());
    }
}
