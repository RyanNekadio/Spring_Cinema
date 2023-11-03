package com.bnta.movies.controllers;

import com.bnta.movies.models.Movie;
import com.bnta.movies.models.Reply;
import com.bnta.movies.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
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

//    Create movie library
    @PostMapping
    public ResponseEntity<Movie> addMovie(@RequestBody Movie movie){
        movieService.saveMovie(movie);
        return new ResponseEntity<>(movie, HttpStatus.CREATED);
    }

//    Display a specified movie
    @GetMapping(value = "/{id}")
    public ResponseEntity<Reply> getMovie(@PathVariable long id) {

        Optional<Movie> movie = movieService.getMovieById(id);

        Reply reply = new Reply(
                movie.get().getTitle(),
                movie.get().getRating(),
                movie.get().getDuration()
        );
        return new ResponseEntity<>(reply, HttpStatus.OK);
    }

//    Display all movies
    @GetMapping
    public List<Movie> getMovies(){
        return movieService.getAllMovies();
    }

//    Delete a movie
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteMovie(@PathVariable long id){
        try {
            movieService.deleteMovie(id);
            return ResponseEntity.noContent().build(); // HTTP 204 No Content
        } catch (EmptyResultDataAccessException e) {
            // Handle not found scenario
            return ResponseEntity.notFound().build(); // HTTP 404 Not Found
        }
    }

}

