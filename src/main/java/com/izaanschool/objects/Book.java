package com.izaanschool.objects;

class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return isbn;
    }

    public static void main(String[] args) {
        Book book = new Book("The Amazing Life of Salman Butt", "Salman Butt", "12568490");

        String title = book.getTitle();
        String author = book.getAuthor();
        String isbn = book.getISBN();

        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
}
