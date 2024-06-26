package com.ironhack.intro_JPA.repository;

import com.ironhack.intro_JPA.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    Optional<Customer> findByName(String name);
    List<Customer> findAllByStatus(String status);
}
