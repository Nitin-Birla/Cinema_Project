package com.BookCinemaSeats.Cinema.controllers;


import com.BookCinemaSeats.Cinema.entities.Theater;
import com.BookCinemaSeats.Cinema.repositories.TheaterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/theaters")
public class TheaterController {

    @Autowired
    private TheaterRepo theaterRepo;

    @PostMapping
    public Theater addTheater(@RequestBody Theater theater) {
        return theaterRepo.save(theater);
    }

    @GetMapping
    public List<Theater> getAllTheaters() {
        return theaterRepo.findAll();
    }

}
