package com.springboot.app.SongsArtists.service;

import com.springboot.app.SongsArtists.model.Artist;

import java.util.List;

public interface IArtistService {

    List<Artist> findAll();

    Artist findById(Long id);

    Artist save(Artist newArtist);
}
