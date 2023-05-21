package com.izaanschool.objects;

public class MusicAlbum {
    private String title;
    private String artist;
    private String[] tracks;

    public MusicAlbum(String title, String artist, String[] tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }

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
        // Create an object instance of the class
        String[] tracks = { "Salman Track 1", "Salman Track 2", "Salman Track 3" };
        MusicAlbum album = new MusicAlbum("The album of Salman", "Salman Butt", tracks);

        // Access the object's properties
        String title = album.getTitle();
        String artist = album.getArtist();
        String[] albumTracks = album.getTracks();

        // Print the object's properties
        System.out.println("Album Title: " + title);
        System.out.println("Artist: " + artist);
        System.out.println("Tracks: ");
        for (String track : albumTracks) {
            System.out.println(track);
        }
    }
}
