package com.example.musicalstructureapp;

public class Song {

    // Name of the song
    private String mSongName;

    // Name of the artist
    private String mArtistName;

    // Image of the song art
    private int mSongArt;

    /**
     * Create a new Song object
     *
     * @param songName   is the name of the song
     * @param artistName is the name of the artist
     * @param songArt    is the Image of the song art
     */
    public Song(String songName, String artistName, int songArt) {
        mSongName = songName;
        mArtistName = artistName;
        mSongArt = songArt;
    }

    /**
     * Get the name of the song
     *
     * @return song name
     */
    public String getSongName() {
        return mSongName;
    }

    /**
     * Get the name of the artist
     *
     * @return artist name
     */
    public String getArtistName() {
        return mArtistName;
    }

    /**
     * Get the art of the song
     *
     * @return song art
     */
    public int getSongArt() {
        return mSongArt;
    }
}
