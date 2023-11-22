package com.bnta.movies.services;

import com.bnta.movies.models.Movie;
import com.bnta.movies.models.Reply;
import com.bnta.movies.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public void saveMovie(Movie movie){
        movieRepository.save(movie);
    }

    public Optional<Movie> getMovieById(long id){
        return movieRepository.findById(id);
    }

    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }

    public void deleteMovie(long id){
        movieRepository.deleteById(id);
    }

    public Movie updateMovie(Movie movie, long id){
        movie.setId(id);
        movieRepository.save(movie);
        return movie;
    }

    public List<Movie> getMoviesByMaxDuration(int maxDuration){
        return movieRepository.findByDurationLessThan(maxDuration);
    };

}
