package com.izaanschool.methodcreation;

public class Movie {
    private String title;
    private String director;
    private double rating;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setTitle("The Life of Salman Butt");
        movie.setDirector("Salman Butt");
        movie.setRating(9.3);

        System.out.println("Movie Title: " + movie.getTitle());
        System.out.println("Director: " + movie.getDirector());
        System.out.println("Rating: " + movie.getRating());
    }
}
