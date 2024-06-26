package com.ironhack.intro_JPA.model;

import jakarta.persistence.*;

@Entity
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer customerId;
    private String flightNumber;
    private String aircraft;
    private Integer totalAircraftSeats;
    private Integer flightMileage;

    public Flight() {
    }

    public Flight(Integer customerId, String flightNumber, String aircraft, Integer totalAircraftSeats, Integer flightMileage) {
        this.customerId = customerId;
        this.flightNumber = flightNumber;
        this.aircraft = aircraft;
        this.totalAircraftSeats = totalAircraftSeats;
        this.flightMileage = flightMileage;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAircraft() {
        return aircraft;
    }

    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
    }

    public Integer getTotalAircraftSeats() {
        return totalAircraftSeats;
    }

    public void setTotalAircraftSeats(Integer totalAircraftSeats) {
        this.totalAircraftSeats = totalAircraftSeats;
    }

    public Integer getFlightMileage() {
        return flightMileage;
    }

    public void setFlightMileage(Integer flightMileage) {
        this.flightMileage = flightMileage;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "id=" + this.id +
                ", customerId=" + this.customerId +
                ", flightNumber='" + this.flightNumber + '\'' +
                ", aircraft='" + this.aircraft + '\'' +
                ", totalAircraftSeats=" + this.totalAircraftSeats +
                ", flightMileage=" + this.flightMileage +
                '}'+"\n";
    }
}
