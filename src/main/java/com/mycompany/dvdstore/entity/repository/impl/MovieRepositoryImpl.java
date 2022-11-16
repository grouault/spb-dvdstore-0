package com.mycompany.dvdstore.entity.repository.impl;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.entity.repository.MovieRepository;
import java.util.ArrayList;
import java.util.List;

public class MovieRepositoryImpl implements MovieRepository {

    private List<Movie> movies = new ArrayList<>();

    public void addMovie(Movie movie){
        movies.add(movie);
        System.out.println("[MovieRepositoryImpl] : The movie " + movie.getTitle() + " has been added.");
    }

}
