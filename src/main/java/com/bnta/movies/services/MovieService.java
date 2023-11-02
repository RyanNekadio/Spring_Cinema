package com.bnta.movies.services;

import com.bnta.movies.models.Movie;
import com.bnta.movies.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public String startMovieLibrary(){

        Movie onePiece = new Movie("One Piece the Film: RED", 5, 100);
        Movie erasTour = new Movie("Taylor Swift: The Eras Tour", 5, 150);
        movieRepository.save(onePiece);
        movieRepository.save(erasTour);
        return "Starting movie library";
    }

    public Optional<Movie> getMovieById(long id){
        return movieRepository.findById(id);
    }
    
    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }
}
