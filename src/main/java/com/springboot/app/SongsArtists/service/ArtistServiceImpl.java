package com.springboot.app.SongsArtists.service;


import com.springboot.app.SongsArtists.model.Artist;
import com.springboot.app.SongsArtists.repository.ArtistDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ArtistServiceImpl implements IArtistService {

    @Autowired
    private ArtistDao artistDao;

    @Override
    @Transactional(readOnly = true)
    public List<Artist> findAll() {
        return (List<Artist>) artistDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Artist findById(Long id) {
        return artistDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public Artist save(Artist newArtist) {
        return artistDao.save(newArtist);
    }
}
