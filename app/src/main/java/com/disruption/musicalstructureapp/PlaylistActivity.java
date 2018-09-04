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

public class PlaylistActivity extends AppCompatActivity {

    /*Binding instance*/
    MusicListBinding musicListBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        musicListBinding = DataBindingUtil.setContentView(this, R.layout.music_list);

        //Create an ArrayList of songs for the playlist using the appropriate constructor and add songs to it
        List<Song> songs = new ArrayList<>();
        songs.add(new Song("The return", "Machine Gun Kelly", "4:22"));
        songs.add(new Song("Lace up", "Machine Gun Kelly x Lil John", "4:12"));
        songs.add(new Song("The start", "Machine Gun Kelly", "3:10"));
        songs.add(new Song("Invincible", "Machine Gun Kelly", "4:12"));
        songs.add(new Song("Home", "Machine Gun Kelly", "4:30"));
        songs.add(new Song("See my tears", "Machine Gun Kelly", "4:12"));
        songs.add(new Song("Home", "Machine Gun Kelly", "4:12"));
        songs.add(new Song("Renegades", "X Ambassadors", "4:12"));
        songs.add(new Song("Real slow", "Aloe Blacc", "3:12"));
        songs.add(new Song("Promise", "Wiz Khalifa", "4:12"));
        songs.add(new Song("Flames", "David Guetta x Sia", "3:42"));
        songs.add(new Song("Mocking bird", "Eminem", "4:19"));

        //Create an instance of the SongAdapter whose source is the list of songs
        SongAdapter songAdapter = new SongAdapter(getApplicationContext(), songs);

        //Get a reference to the listView to be used and then attach the relevant adapter
        musicListBinding.musicList.setAdapter(songAdapter);

        //Set a listener on the nav button
        musicListBinding.navButton.setText(R.string.playlist_activity_nav_button);
        musicListBinding.navButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent songListIntent = new Intent(PlaylistActivity.this, SongsActivity.class);
                startActivity(songListIntent);
            }
        });
    }
}
