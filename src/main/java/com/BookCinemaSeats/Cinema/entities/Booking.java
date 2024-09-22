package com.BookCinemaSeats.Cinema.entities;

import jakarta.persistence.*;

@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int numberOfSeats;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;  // Many bookings are made by one user

    @ManyToOne
    @JoinColumn(name = "show_id")
    private MovieShow movieShow;  // Many bookings are linked to one show

}
