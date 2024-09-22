package com.BookCinemaSeats.Cinema.controllers;

import com.BookCinemaSeats.Cinema.entities.Movie;
import com.BookCinemaSeats.Cinema.repositories.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieRepo movieRepo;

    @PostMapping
    public Movie addMovie(@RequestBody Movie movie) {
        return movieRepo.save(movie);
    }

    @GetMapping
    public List<Movie> getAllMovies() {
        return movieRepo.findAll();
    }
}
