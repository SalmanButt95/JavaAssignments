package com.izaanschool.objects;

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
        // Create an object instance of the class
        Movie movie = new Movie("Salman's Life, the Movie", "Salman Butt", 10.0);

        // Access the object's properties
        String title = movie.getTitle();
        String director = movie.getDirector();
        double rating = movie.getRating();

        // Print the object's properties
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Rating: " + rating);
    }
}
