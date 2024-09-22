package com.BookCinemaSeats.Cinema.repositories;

import com.BookCinemaSeats.Cinema.entities.MovieShow;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieShowRepo extends JpaRepository<MovieShow,Long> {
    List<MovieShow> findByTheater_City(String city);
}
