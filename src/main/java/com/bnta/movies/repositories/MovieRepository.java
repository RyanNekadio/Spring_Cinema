package com.bnta.movies.repositories;

import com.bnta.movies.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long> {

    List<Movie> findByDurationLessThan(int maxDuration);
}
