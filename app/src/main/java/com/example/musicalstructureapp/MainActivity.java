package com.example.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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
        songs.add(new Song(getString(R.string.kaya), getString(R.string.bob_marley), R.drawable.kaya));
        songs.add(new Song(getString(R.string.peaches), getString(R.string.justin_bieber), R.drawable.peaches));
        songs.add(new Song(getString(R.string.on_me), getString(R.string.lil_baby), R.drawable.on_me));
        songs.add(new Song(getString(R.string.blinding_lights), getString(R.string.the_weeknd), R.drawable.blinding_lights));
        songs.add(new Song(getString(R.string.love_yourz), getString(R.string.j_cole), R.drawable.love_yours));
        songs.add(new Song(getString(R.string.beast_of_no_nation), getString(R.string.fela), R.drawable.beast_of_no_nation));
        songs.add(new Song(getString(R.string.bank_on_it), getString(R.string.burna_boy), R.drawable.bank_on_it));
        songs.add(new Song(getString(R.string.up), getString(R.string.cardi_b), R.drawable.up));
        songs.add(new Song(getString(R.string.blessed), getString(R.string.wiz_kid), R.drawable.blessed));
        songs.add(new Song(getString(R.string.holy_ground), getString(R.string.davido), R.drawable.holy_ground));

        // Create a SongAdapter, whose data source is a list of songs. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter songAdapter = new SongAdapter(this, songs);

        // This is to find the ListView object in the view hierarchy of the Activity.
        ListView listView = (ListView) findViewById(R.id.listview_song);

        // The ListView use the SongAdapter we created above, so that the
        // ListView will display list items for each Song in the list.
        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Song songClicked = (Song) adapterView.getItemAtPosition(i);
                Intent intent = new Intent(MainActivity.this, NowPlayingActivity.class);
                intent.putExtra(getString(R.string.song_name), songClicked.getSongName());
                intent.putExtra(getString(R.string.artist_name), songClicked.getArtistName());
                intent.putExtra(getString(R.string.song_image), songClicked.getSongArt());
                startActivity(intent);
            }
        });

    }
}