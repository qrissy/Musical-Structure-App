package com.example.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create an array of songs
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Kaya", "Bob Marley", R.drawable.kaya));
        songs.add(new Song("Peaches", "Justin Bieber", R.drawable.peaches));
        songs.add(new Song("On Me", "Lil Baby", R.drawable.on_me));
        songs.add(new Song("Blinding Lights", "The Weeknd", R.drawable.blinding_lights));
        songs.add(new Song("Love Yourz", "J. Cole", R.drawable.love_yours));
        songs.add(new Song("Beast of No Nation", "Fela", R.drawable.beast_of_no_nation));
        songs.add(new Song("Bank On It", "Burna Boy", R.drawable.bank_on_it));
        songs.add(new Song("Up", "Cardi B", R.drawable.up));
        songs.add(new Song("Blessed", "Wiz Kid", R.drawable.blessed));
        songs.add(new Song("Holy Ground", "Davido", R.drawable.holy_ground));

        // Create a SongAdapter, whose data source is a list of songs. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter songAdapter = new SongAdapter(this, songs);

        // This is to find the ListView object in the view hierarchy of the Activity.
        ListView listView = (ListView) findViewById(R.id.listview_song);

        // The ListView use the SongAdapter we created above, so that the
        // ListView will display list items for each Song in the list.
        listView.setAdapter(songAdapter);

    }
}