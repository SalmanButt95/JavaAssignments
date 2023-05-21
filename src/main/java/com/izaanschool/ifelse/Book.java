package com.izaanschool.ifelse;

public class Book {

    String title = "The Adventures of Salman Butt";
    String author = "Everyone bruh";
    String ISBN = "0011223344-55";

    public void info() {
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);

        if (title.equals("laptop")) {
            System.out.println("Yes, this is about a laptop");
        }
    }

    public static void main(String[] args) {
        Book book = new Book();
        book.info();
    }
}
