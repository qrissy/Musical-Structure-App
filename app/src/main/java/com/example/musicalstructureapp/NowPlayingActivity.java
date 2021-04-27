package com.example.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        // Song name view
        TextView songNameTextView = (TextView) findViewById(R.id.song_name_text_view);
        songNameTextView.setText(getIntent().getStringExtra("song_name"));

        // Artist name View
        TextView artistNameTextView = (TextView) findViewById(R.id.artist_name_text_view);
        artistNameTextView.setText(getIntent().getStringExtra("artist_name"));

        // Song art View
        ImageView songArtImageView = (ImageView) findViewById(R.id.song_art_image_view);
        songArtImageView.setImageResource(getIntent().getIntExtra("song_art", 0));

        // Previous button view
        Button prevButton = (Button) findViewById(R.id.previous_button);
        prevButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(NowPlayingActivity.this, "Previous Song", Toast.LENGTH_SHORT).show();
            }
        });

        // Play button view
        Button playButton = (Button) findViewById(R.id.play_button);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(NowPlayingActivity.this, "Play Song", Toast.LENGTH_SHORT).show();
            }
        });

        // Next button view
        Button nextButton = (Button) findViewById(R.id.next_button);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(NowPlayingActivity.this, "Next Song", Toast.LENGTH_SHORT).show();
            }
        });

    }
}