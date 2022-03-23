package com.springboot.app.SongsArtists.repository;

import com.springboot.app.SongsArtists.model.Song;
import org.springframework.data.repository.CrudRepository;

public interface SongDao extends CrudRepository<Song, Long> {
}
