package com.example.musicalstructureapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Activity context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Song} object located at this position in the list
        Song currentSong = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID song_name_text_view
        TextView songTextView = (TextView) listItemView.findViewById(R.id.song_name_text_view);
        // Get the song name from the current Song object and
        // set this text on the song TextView
        songTextView.setText(currentSong.getSongName());

        // Find the TextView in the list_item.xml layout with the ID artist_name_text_view
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_name_text_view);
        // Get the artist name from the current Song object and
        // set this text on the artist TextView
        artistTextView.setText(currentSong.getArtistName());

        // Find the ImageView in the list_item.xml layout with the ID song_art_image_view
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.song_art_image_view);
        // Get the image resource ID from the current Song object and
        // set the image to imageView
        imageView.setImageResource(currentSong.getSongArt());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
