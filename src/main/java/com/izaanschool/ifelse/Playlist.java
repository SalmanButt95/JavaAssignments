package com.izaanschool.ifelse;

public class Playlist {
    private String name;
    private int songs;
    private int duration;

    public Playlist(String name, int songs, int duration) {
        this.name = name;
        this.songs = songs;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public int getSongs() {
        return songs;
    }

    public int getDuration() {
        return duration;
    }

    public static void main(String[] args) {
        String name = "Salman Butt Playlist";
        int songs = 1;
        int duration = 4;

        Playlist playlist = new Playlist(name, songs, duration);

        System.out.println("Playlist Name: " + playlist.getName());
        System.out.println("Number of Songs: " + playlist.getSongs());
        System.out.println("Duration (minutes): " + playlist.getDuration());

        if (duration > 2) {
            System.out.println("Too long");
        } else {
            System.out.println("Now it is fine");
        }
    }
}
