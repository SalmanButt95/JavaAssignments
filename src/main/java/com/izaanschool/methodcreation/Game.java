package com.izaanschool.methodcreation;

public class Game {
    private String name;
    private String genre;
    private String releaseDate;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.setName("The Legend of Salman Butt");
        game.setGenre("Action");
        game.setReleaseDate("March 2025");

        System.out.println("Game Name: " + game.getName());
        System.out.println("Genre: " + game.getGenre());
        System.out.println("Release Date: " + game.getReleaseDate());
    }
}
