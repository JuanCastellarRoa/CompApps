package com.springboot.app.SongsArtists.controller;

import com.springboot.app.SongsArtists.model.Artist;
import com.springboot.app.SongsArtists.service.IArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ArtistController {

    @Autowired
    private IArtistService artistService;

    @GetMapping("/artists")
    public List<Artist> findAll() {
        return artistService.findAll();
    }

    @GetMapping("/artists/{id}")
    public Artist findById(@PathVariable Long id) {
        return artistService.findById(id);
    }

    @PostMapping("/artists")
    public Artist newArtist(@RequestBody Artist newArtist) {
        return artistService.save(newArtist);
    }

}
