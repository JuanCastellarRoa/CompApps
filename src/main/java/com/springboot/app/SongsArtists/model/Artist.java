package com.springboot.app.SongsArtists.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "artists")
public class Artist implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
