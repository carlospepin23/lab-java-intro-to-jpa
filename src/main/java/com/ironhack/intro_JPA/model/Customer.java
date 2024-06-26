package com.ironhack.intro_JPA.model;

import jakarta.persistence.*;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String status;
    private Integer total_Flight_Mileage;

    public Customer() {
    }

    public Customer(String name, String status, Integer total_Flight_Mileage) {
        this.name = name;
        this.status = status;
        this.total_Flight_Mileage = total_Flight_Mileage;
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
        return total_Flight_Mileage;
    }

    public void setTotal_Flight_Mileage(Integer total_Flight_Mileage) {
        this.total_Flight_Mileage = total_Flight_Mileage;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", total_Flight_Mileage=" + total_Flight_Mileage +
                '}';
    }
}
