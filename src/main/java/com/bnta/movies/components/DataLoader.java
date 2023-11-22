package com.bnta.movies.components;
import com.bnta.movies.models.Movie;
import com.bnta.movies.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    MovieService movieService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

//        MOVIES
        Movie titanic = new Movie("Titanic", 13, 135);
        movieService.saveMovie(titanic);
        Movie onePiece = new Movie("One Piece the Film: RED", 8, 160);
        movieService.saveMovie(onePiece);
        Movie dragonBall = new Movie("DragonBall Evolution", 8, 100);
        movieService.saveMovie(dragonBall);

    }
}
