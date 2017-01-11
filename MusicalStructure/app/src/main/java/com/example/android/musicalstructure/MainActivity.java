package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView myMusic = (TextView) findViewById(R.id.myMusic_MainActivity);
        myMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MyMusicActivity.class);
                startActivity(intent);
            }
        });
        TextView musicLibrary = (TextView) findViewById(R.id.musicLibrary_MainActivity);
        musicLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MusicLibraryActivity.class);
                startActivity(intent);
            }
        });
    }
}
