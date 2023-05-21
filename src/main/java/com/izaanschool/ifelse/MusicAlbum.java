package com.izaanschool.ifelse;

public class MusicAlbum {
    private String title;
    private String artist;
    private int tracks;

    public MusicAlbum(String title, String artist, int tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getTracks() {
        return tracks;
    }

    public static void main(String[] args) {
        String title = "Salman Beats";
        String artist = "Salman Butt";
        int tracks = 10;

        MusicAlbum album = new MusicAlbum(title, artist, tracks);

        System.out.println("Title: " + album.getTitle());
        System.out.println("Artist: " + album.getArtist());
        System.out.println("Number of Tracks: " + album.getTracks());

        if (tracks == 10) {
            System.out.println("Complete Album");
        } else {
            System.out.println("Not good");
        }
    }
}
