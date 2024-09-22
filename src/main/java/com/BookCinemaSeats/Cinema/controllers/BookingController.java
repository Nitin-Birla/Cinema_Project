package com.BookCinemaSeats.Cinema.controllers;


import com.BookCinemaSeats.Cinema.entities.Booking;
import com.BookCinemaSeats.Cinema.repositories.BookingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    @Autowired
    private BookingRepo bookingRepo;

    @PostMapping
    public Booking addBooking(@RequestBody Booking booking) {
        return bookingRepo.save(booking);
    }

    // Get bookings for a particular movie
    @GetMapping("/by-movie")
    public List<Booking> getBookingsByMovie(@RequestParam String movieTitle) {
        return bookingRepo.findByMovieShow_Movie_Title(movieTitle);
    }

    // Get bookings for a particular user
    @GetMapping("/by-user")
    public List<Booking> getBookingsByUser(@RequestParam Long userId) {
        return bookingRepo.findByUser_Id(userId);
    }

}
