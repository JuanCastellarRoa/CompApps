package com.springboot.app.SongsArtists.service;

import com.springboot.app.SongsArtists.model.Song;

import java.util.List;

public interface ISongService {
    List<Song> findAll();

    Song findById(Long id);

    Song save(Song newSong);
}
