package com.ironhack.intro_JPA.model;

import jakarta.persistence.*;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String status;
    private Integer totalFlightMileage;


    public Customer() {
    }

    public Customer(String name, String status, Integer totalFlightMileage) {
        this.name = name;
        this.status = status;
        this.totalFlightMileage = totalFlightMileage;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getTotal_Flight_Mileage() {
        return totalFlightMileage;
    }

    public void setTotal_Flight_Mileage(Integer total_Flight_Mileage) {
        this.totalFlightMileage = total_Flight_Mileage;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", total_Flight_Mileage=" + totalFlightMileage +
                '}';
    }
}
