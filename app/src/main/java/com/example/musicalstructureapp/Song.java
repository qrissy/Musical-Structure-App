package com.example.musicalstructureapp;

public class Song {

    // Name of the song
    private String song_name;

    // Name of the artist
    private String artist_name;

    // Image of the song art
    private int song_art;

    /**
     * Create a new Song object
     *
     * @param songName   is the name of the song
     * @param artistName is the name of the artist
     * @param songArt    is the Image of the song art
     */
    public Song(String songName, String artistName, int songArt) {
        song_name = songName;
        artist_name = artistName;
        song_art = songArt;
    }

    /**
     * Get the name of the song
     *
     * @return song name
     */
    public String getSongName() {
        return song_name;
    }

    /**
     * Get the name of the artist
     *
     * @return artist name
     */
    public String getArtistName() {
        return artist_name;
    }

    /**
     * Get the art of the song
     *
     * @return song art
     */
    public int getSongArt() {
        return song_art;
    }
}
