package com.BookCinemaSeats.Cinema.repositories;

import com.BookCinemaSeats.Cinema.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}
