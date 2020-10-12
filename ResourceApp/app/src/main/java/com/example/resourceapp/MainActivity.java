package com.example.resourceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton imageButton;
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageButton = findViewById(R.id.imageButton);
        mediaPlayer = MediaPlayer.create(this, R.raw.something); // R.raw.hasty-ba-dum-tss-615

        imageButton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    mediaPlayer.start();
                    Log.d("message", "played");
                }
            });
    }
}