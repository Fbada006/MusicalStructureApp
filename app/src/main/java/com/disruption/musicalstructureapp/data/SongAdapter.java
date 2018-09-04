package com.disruption.musicalstructureapp.data;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.disruption.musicalstructureapp.R;
import com.disruption.musicalstructureapp.databinding.MusicItemBinding;

import java.util.List;

/**
 * {@link SongAdapter} is an {@link ArrayAdapter} that creates the layout of the list based on the
 * {@link Song} objects
 */
public class SongAdapter extends ArrayAdapter<Song> {

    /**
     * @param context is the current context to inflate the layout file
     * @param songs   is the list of Song objects to display
     */
    public SongAdapter(@NonNull Context context, List<Song> songs) {
        super(context, 0, songs);
    }

    /**
     * This method provides a list for an AdapterView like a ListView
     *
     * @param position    is the position in the list of data that should be displayed in the list view
     * @param convertView is the recycled view to be populated with data
     * @param parent      the parent viewGroup to be used for inflation purposes
     * @return the view for the position in the adapter View
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        //Binding instance
        MusicItemBinding musicItemBinding;

        //Make sure the current view is empty before inflating it
        if (convertView == null) {
            musicItemBinding = DataBindingUtil.inflate(
                    LayoutInflater.from(getContext()),
                    R.layout.music_item, parent, false);

            //Get the outermost View in the layout file associated with the binding
            convertView = musicItemBinding.getRoot();

            //Set the proper tag. The list gets messed up without it
            convertView.setTag(musicItemBinding);
        } else {
            musicItemBinding = (MusicItemBinding) convertView.getTag();
        }

        //Get the current song in the index "position" of the ArrayList
        Song currentSong = getItem(position);

        //Get the name of the song and set it to the appropriate TextView
        if (musicItemBinding != null && currentSong != null) {
            musicItemBinding.songTitle.setText(currentSong.geNameOfSong());
        }

        //Get the name of the artist and set it to the appropriate view
        if (musicItemBinding != null && currentSong != null) {
            musicItemBinding.songArtist.setText(currentSong.getArtistName());
        }

        //Get the name of the album and set it to the appropriate view
        if (musicItemBinding != null && currentSong != null) {
            musicItemBinding.songAlbum.setText(currentSong.getSongAlbum());
        }

        //Get the album year and set it to the appropriate view
        if (musicItemBinding != null && currentSong != null) {
            musicItemBinding.songAlbumYear.setText(currentSong.getAlbumYear());
        }

        //Get the song time and set it to the correct view
        if (musicItemBinding != null && currentSong != null) {
            musicItemBinding.songTime.setText(currentSong.getSongTime());
        }

        //Return the entire listView with the views
        return convertView;
    }
}
