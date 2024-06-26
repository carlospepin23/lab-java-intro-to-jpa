package com.ironhack.intro_JPA.repository;

import com.ironhack.intro_JPA.model.FlightBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightBookingRepository extends JpaRepository<FlightBooking,Integer> {
}

