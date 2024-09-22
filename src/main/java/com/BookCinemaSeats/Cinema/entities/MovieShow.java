package com.BookCinemaSeats.Cinema.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class MovieShow {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String showTime;  // e.g., "7:00 PM"

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;  // Many shows are linked to one movie

    @ManyToOne
    @JoinColumn(name = "theater_id")
    private Theater theater;  // Many shows are linked to one theater

    @OneToMany(mappedBy = "movieShow", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Booking> bookings;  // A show can have many bookings
}
