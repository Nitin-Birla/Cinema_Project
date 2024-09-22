package com.BookCinemaSeats.Cinema.repositories;

import com.BookCinemaSeats.Cinema.entities.Theater;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheaterRepo extends JpaRepository<Theater,Long> {
}
