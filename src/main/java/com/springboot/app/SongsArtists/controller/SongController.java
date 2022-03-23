package com.springboot.app.SongsArtists.controller;

import com.springboot.app.SongsArtists.model.Song;
import com.springboot.app.SongsArtists.service.ISongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SongController {

    @Autowired
    private ISongService songService;

    @GetMapping("/songs")
    public List<Song> findAll() {
        return songService.findAll();
    }

    @GetMapping("/songs/{id}")
    public Song findById(@PathVariable Long id) {
        return songService.findById(id);
    }

    @PostMapping("/songs")
    public Song newSong(@RequestBody Song newSong) {
        return songService.save(newSong);
    }

}

