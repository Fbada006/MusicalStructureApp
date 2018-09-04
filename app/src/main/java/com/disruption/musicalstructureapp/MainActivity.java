package com.disruption.musicalstructureapp;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.disruption.musicalstructureapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    /*Binding instance*/
    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        //Intent to the SongsActivity
        activityMainBinding.songList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent songListIntent = new Intent(MainActivity.this, SongsActivity.class);
                startActivity(songListIntent);
            }
        });

        //Intent to go to the PlaylistActivity
        activityMainBinding.songPlaylist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playListIntent = new Intent(MainActivity.this, PlaylistActivity.class);
                startActivity(playListIntent);
            }
        });

        //Intent to go to the AlbumActivity
        activityMainBinding.songAlbums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent albumActivityIntent = new Intent(MainActivity.this, AlbumActivity.class);
                startActivity(albumActivityIntent);
            }
        });
    }
}
