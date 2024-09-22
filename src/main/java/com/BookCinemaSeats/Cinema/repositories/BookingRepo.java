package com.BookCinemaSeats.Cinema.repositories;

import com.BookCinemaSeats.Cinema.entities.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepo extends JpaRepository<Booking,Long> {
    List<Booking> findByMovieShow_Movie_Title(String movieTitle);
    List<Booking> findByUser_Id(Long userId);
}
