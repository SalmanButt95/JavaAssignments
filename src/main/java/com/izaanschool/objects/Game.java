package com.izaanschool.objects;

import java.util.Calendar;
import java.util.Date;

public class Game {
    private String name;
    private String genre;
    private Date releaseDate;

    public Game(String name, String genre, Date releaseDate) {
        this.name = name;
        this.genre = genre;
        this.releaseDate = releaseDate;
    }

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

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, 5);
        Date releaseDate = calendar.getTime();

        Game game = new Game("The Legend of Salman", "Awesome-ness", releaseDate);

        String name = game.getName();
        String genre = game.getGenre();
        releaseDate = game.getReleaseDate();

        System.out.println("Name: " + name);
        System.out.println("Genre: " + genre);
        System.out.println("Release Date: " + releaseDate);
    }
}
