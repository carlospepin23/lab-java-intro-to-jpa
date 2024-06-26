package com.ironhack.intro_JPA.repository;

import com.ironhack.intro_JPA.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<Flight,Integer> {
    List<Flight> findAllByFlightNumber(String flightNumber);
    List<Flight> findByAircraftContaining(String str);
    List<Flight> findByFlightMileageGreaterThan(int mileage);

}
