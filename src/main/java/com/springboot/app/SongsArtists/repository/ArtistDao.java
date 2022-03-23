package com.springboot.app.SongsArtists.repository;

import com.springboot.app.SongsArtists.model.Artist;
import org.springframework.data.repository.CrudRepository;

public interface ArtistDao extends CrudRepository<Artist, Long> {
}
