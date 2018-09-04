package com.disruption.musicalstructureapp;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.disruption.musicalstructureapp.data.Song;
import com.disruption.musicalstructureapp.data.SongAdapter;
import com.disruption.musicalstructureapp.databinding.MusicListBinding;

import java.util.ArrayList;
import java.util.List;

public class AlbumActivity extends AppCompatActivity {

    /*Binding instance*/
    MusicListBinding musicListBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        musicListBinding = DataBindingUtil.setContentView(this, R.layout.music_list);

        //Create an ArrayList of albums containing random data
        List<Song> albums = new ArrayList<>();
        albums.add(new Song("Lace Up", "2007"));
        albums.add(new Song("The Return", "2010"));
        albums.add(new Song("Unknown album", "Unknown"));
        albums.add(new Song("Overgrown", "2013"));
        albums.add(new Song("Lace Up", "2007"));
        albums.add(new Song("The Return", "2010"));
        albums.add(new Song("Unknown album", "Unknown"));
        albums.add(new Song("Overgrown", "2013"));
        albums.add(new Song("Lace Up", "2007"));
        albums.add(new Song("The Return", "2010"));
        albums.add(new Song("Unknown album", "Unknown"));
        albums.add(new Song("Overgrown", "2013"));

        //Create an instance of the SongAdapter whose source is the list of albums
        SongAdapter songAdapter = new SongAdapter(getApplicationContext(), albums);

        //Get a reference to the listView to be used and then attach the relevant adapter
        musicListBinding.musicList.setAdapter(songAdapter);

        //Set a listener to the navigation button to go to the songs activity
        musicListBinding.navButton.setText(R.string.album_activity_nav_button);
        musicListBinding.navButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent songListIntent = new Intent(AlbumActivity.this, SongsActivity.class);
                startActivity(songListIntent);
            }
        });

    }
}
