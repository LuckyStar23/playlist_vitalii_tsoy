package com.example.playlist_vitalii_tsoy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textView = findViewById(R.id.value);
        Song song = (Song) getIntent().getSerializableExtra("song");
        textView.setText(song.getName());

    }
}