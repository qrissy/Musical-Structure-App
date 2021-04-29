package com.example.musicalstructureapp;

public class Song {

    // Name of the song
    private String song;

    // Name of the artist
    private String artist;

    // Image of the song art
    private int image;

    /**
     * Create a new Song object
     *
     * @param songName   is the name of the song
     * @param artistName is the name of the artist
     * @param songArt    is the Image of the song art
     */
    public Song(String songName, String artistName, int songArt) {
        song = songName;
        artist = artistName;
        image = songArt;
    }

    /**
     * Get the name of the song
     *
     * @return song name
     */
    public String getSongName() {
        return song;
    }

    /**
     * Get the name of the artist
     *
     * @return artist name
     */
    public String getArtistName() {
        return artist;
    }

    /**
     * Get the art of the song
     *
     * @return song art
     */
    public int getSongArt() {
        return image;
    }
}
