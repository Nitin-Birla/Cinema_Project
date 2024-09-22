package com.BookCinemaSeats.Cinema.controllers;


import com.BookCinemaSeats.Cinema.entities.MovieShow;
import com.BookCinemaSeats.Cinema.repositories.MovieShowRepo;
import com.BookCinemaSeats.Cinema.repositories.MovieShowRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/shows")
public class MovieShowController {

    @Autowired
    private MovieShowRepo showRepo;

    @PostMapping
    public MovieShow addShow(@RequestBody MovieShow movieShow) {
        return showRepo.save(movieShow);
    }

    @GetMapping
    public List<MovieShow> getAllShows() {
        return showRepo.findAll();
    }

    // Get all shows in a particular city
    @GetMapping("/by-city")
    public List<MovieShow> getShowsByCity(@RequestParam String city) {
        return showRepo.findByTheater_City(city);
    }

}


