package com.izaanschool.datatype;

import java.util.Scanner;


public class CustomerReview {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String product = "Computer Chair";
        int rating = 9;
        String comments = "Chair is very comfortable";


        System.out.print("Enter the product name: ");
        product = input.nextLine();
        System.out.print("Enter the rating (1-5): ");
        rating = input.nextInt();
        input.nextLine();
        System.out.print("Enter your comments: ");
        comments = input.nextLine();


        System.out.println("Product: " + product);
        System.out.println("Rating: " + rating);
        System.out.println("Comments: " + comments);
    }
}
