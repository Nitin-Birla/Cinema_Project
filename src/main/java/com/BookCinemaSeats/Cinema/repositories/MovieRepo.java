package com.BookCinemaSeats.Cinema.repositories;

import com.BookCinemaSeats.Cinema.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepo extends JpaRepository<Movie,Long> {
}
