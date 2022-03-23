package com.springboot.app.SongsArtists.service;

import com.springboot.app.SongsArtists.model.Song;
import com.springboot.app.SongsArtists.repository.SongDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SongServiceImpl implements ISongService {

    @Autowired
    private SongDao songDao;

    @Override
    @Transactional(readOnly = true)
    public List<Song> findAll() {
        return (List<Song>) songDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Song findById(Long id) {
        return songDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public Song save(Song newSong) {
        return songDao.save(newSong);
    }
}
