package com.izaanschool.ifelse;

public class CustomerReview {

    public static void main(String[] args) {
        String product = "Glass Bottle 1L";
        int rating = 4;
        String comments = "Great product!";


        System.out.println("Product: " + product);
        System.out.println("Rating: " + rating);
        System.out.println("Comments: " + comments);
        if (product.equals("Glass Bottle 1L")) {
            System.out.println("Yes, this is a Glass Bottle 1L");
        }
    }
}
