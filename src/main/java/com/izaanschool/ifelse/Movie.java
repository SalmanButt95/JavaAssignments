package com.izaanschool.ifelse;

public class Movie {
    private String title;
    private String director;
    private double rating;

    public Movie(String title, String director, double rating) {
        this.title = title;
        this.director = director;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public double getRating() {
        return rating;
    }

    public static void main(String[] args) {
        String title = "Salman, The Movie";
        String director = "Salman Butt";
        double rating = 3;

        Movie movie = new Movie(title, director, rating);

        System.out.println("Title: " + movie.getTitle());
        System.out.println("Director: " + movie.getDirector());
        System.out.println("Rating: " + movie.getRating());

        if (rating == 3) {
            System.out.println("Average movie");
        } else {
            System.out.println("Not sure yet");
        }
    }
}
