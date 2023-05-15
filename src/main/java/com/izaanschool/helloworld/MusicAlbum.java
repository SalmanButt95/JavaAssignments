package com.izaanschool.helloworld;
public class MusicAlbum {

    public static void main(String[] args) {

        System.out.println("Title : Graduation");
        System.out.println("artist: Kanye West");
        String[] names = {"Flashing Lights", "Homecoming", "Big Brother", "Bittersweet Poetry", "Barry Bonds"};

        for (int i = 1; i <= names.length; i++) {
            System.out.println(i + ". " + names[i-1]);
        }

    }
}
