package com.bnta.movies.controllers;

import com.bnta.movies.models.Movie;
import com.bnta.movies.models.Reply;
import com.bnta.movies.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {

    @Autowired
    MovieService movieService;

    @PostMapping
    public String movieStatus(){
        return movieService.startMovieLibrary();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Reply> getMovieStatus(@PathVariable long id) {

        Optional<Movie> movie = movieService.getMovieById(id);

        Reply reply = new Reply(
                "Movie information",
                movie.get().getTitle(),
                movie.get().getRating(),
                movie.get().getDuration()
        );
        return new ResponseEntity<>(reply, HttpStatus.OK);
    }

    @GetMapping
    public List<Movie> getAllMovies(){
        return movieService.getAllMovies();
    }

}

