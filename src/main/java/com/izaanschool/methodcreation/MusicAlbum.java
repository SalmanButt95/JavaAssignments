package com.izaanschool.methodcreation;

public class MusicAlbum {
    private String title;
    private String artist;
    private String[] tracks;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String[] getTracks() {
        return tracks;
    }

    public void setTracks(String[] tracks) {
        this.tracks = tracks;
    }

    public static void main(String[] args) {
        MusicAlbum album = new MusicAlbum();
        album.setTitle("ExampleTitle");
        album.setArtist("ExampleArtist");
        album.setTracks(new String[]{"Song1", "Song2", "Song3"});

        System.out.println("Album Title: " + album.getTitle());
        System.out.println("Artist: " + album.getArtist());
        System.out.println("Tracks: " + String.join(", ", album.getTracks()));
    }
}
