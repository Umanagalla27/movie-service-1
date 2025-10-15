package com.Umanagalla27.tmdb.model;

import lombok.Data;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.util.ArrayList;
import java.util.List;
@Entity
@Data
public class Movie {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String director;

    @ElementCollection
    private List<String> actors = new ArrayList<>();

}