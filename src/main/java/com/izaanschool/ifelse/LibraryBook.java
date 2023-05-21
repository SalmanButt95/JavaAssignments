package com.izaanschool.ifelse;

public class LibraryBook {
    private String title;
    private String author;
    private String ISBN;
    private boolean isOverdue;

    public LibraryBook(String title, String author, String ISBN, boolean isOverdue) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isOverdue = isOverdue;
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

    public boolean isOverdue() {
        return isOverdue;
    }

    public void setOverdue(boolean overdue) {
        isOverdue = overdue;
    }

    public static void main(String[] args) {

        LibraryBook book = new LibraryBook("The Great Salman Butt", "Salman Butt", "978074", false);


        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("ISBN: " + book.getISBN());
        System.out.println("Is Overdue: " + book.isOverdue());


        if (book.isOverdue()) {
            System.out.println("It's overdue");
        } else {
            System.out.println("Not overdue");
        }
    }
}
