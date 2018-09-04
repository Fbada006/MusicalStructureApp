package com.disruption.musicalstructureapp.data;

/**
 * This class contains all the information about the song such as the title.
 */
public class Song {

    /*The name of the song*/
    private String mNameOfSong;

    /*The artist of the song*/
    private String mArtistName;

    /*The time of the song*/
    private String mSongTime;

    /*The album of the song*/
    private String mSongAlbum;

    /*The year of the album*/
    private String mAlbumYear;

    /**
     * This constructor will be used in the all songs {@link com.disruption.musicalstructureapp.SongsActivity}
     * and {@link com.disruption.musicalstructureapp.PlaylistActivity}
     *
     * @param nameOfSong is the name of the song
     * @param artistName is the name of the artist of the song
     * @param timeOfSong is the total time taken by the song
     */
    public Song(String nameOfSong, String artistName, String timeOfSong) {
        mNameOfSong = nameOfSong;
        mArtistName = artistName;
        mSongTime = timeOfSong;
    }

    /**
     * This second constructor will be used in the {@link com.disruption.musicalstructureapp.AlbumActivity}
     *
     * @param songAlbum is the album of the song
     */
    public Song(String songAlbum, String albumYear) {
        mSongAlbum = songAlbum;
        mAlbumYear = albumYear;
    }

    /*All the getters for the song characteristics*/

    public String geNameOfSong() {
        return mNameOfSong;
    }

    public String getArtistName() {
        return mArtistName;
    }

    public String getSongTime() {
        return mSongTime;
    }

    public String getSongAlbum() {
        return mSongAlbum;
    }

    public String getAlbumYear() {
        return mAlbumYear;
    }
}
