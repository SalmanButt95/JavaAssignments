package com.izaanschool.objects;

public class LibraryBook {
    private String title;
    private String author;
    private String ISBN;

    public LibraryBook(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
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

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public static void main(String[] args) {
        LibraryBook book = new LibraryBook("The Book of Salman Butt", "Salman Butt", "112233445566");

        String title = book.getTitle();
        String author = book.getAuthor();
        String ISBN = book.getISBN();

        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
    }
}
