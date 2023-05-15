package com.izaanschool.datatype;

import java.util.Scanner;
public class Comment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        String author = "Salman Butt";
        String content = "I love Java!";
        String date = "May, 25, 2023";


        System.out.print("Enter author name: ");
        author = input.nextLine();

        System.out.print("Enter content: ");
        content = input.nextLine();

        System.out.print("Enter date: ");
        date = input.nextLine();


        System.out.println("Author: " + author);
        System.out.println("Content: " + content);
        System.out.println("Date: " + date);
    }
}
