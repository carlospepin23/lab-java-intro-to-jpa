package com.ironhack.intro_JPA.repository;

import com.ironhack.intro_JPA.model.Customer;
import com.ironhack.intro_JPA.model.CustomerStatus;
import com.ironhack.intro_JPA.model.Flight;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FlightBookingRepositoryTest {

    @Autowired
    FlightRepository flightRepository;
    @Autowired
    CustomerRepository customerRepository;

    Flight flight;
    Customer customer1;
    Customer customer;


    @BeforeEach
    void setUp() {
        customer1 = new Customer("New", CustomerStatus.Gold.toString(), 235);
        customerRepository.save(customer1);

        customer= new Customer("Juanca", CustomerStatus.Silver.toString(), 2500);
        customerRepository.save(customer);

        flight = new Flight(customer.getId(),"DL122", "Boeing 787", 615, 5160);
        flightRepository.save(flight);

    }

    @AfterEach
    void tearDown() {
        customerRepository.deleteById(customer1.getId());
        flightRepository.deleteById(flight.getId());
        customerRepository.deleteById(customer.getId());
    }

    @Test
    public void createsNewCustomer_customerList_customerSaved() {

        List<Customer> customerList = customerRepository.findAll();
        System.out.println(customerList);
        assertEquals(10, customerList.size(), "Expected 10 customers in the list");
    }

    @Test
    public void findByName_CustomerList_correctCustomer() {
        Optional<Customer> customerOptional = customerRepository.findByName("New");
        assertTrue(customerOptional.isPresent());
        System.out.println(customerOptional.get());
        assertEquals("New", customerOptional.get().getName(), "Expected customer with name 'New'");
    }

    @Test
    public void findAllByStatus_CustomerList_correctCustomers() {
        List<Customer> customers = customerRepository.findAllByStatus("Gold");
        assertEquals(3, customers.size(), "Expected 3 customers with status 'Gold'");
        for(int i=0;i<customers.size();i++){
            assertEquals("Gold", customers.get(i).getStatus());
        }
    }

    @Test
    public void createsNewFlight_flightList_flightSaved() {
        List<Flight> flightList = flightRepository.findAll();
        System.out.println(flightList);
        assertEquals(15, flightList.size(), "Expected 15 flights in the list");
    }

    @Test
    public void findAllByFlight_Number_AirlineList_correctAirlines() {
        List<Flight> flights = flightRepository.findAllByFlightNumber("DL122");

        assertTrue(!flights.isEmpty(), "List of airlines should not be empty");
        assertEquals(5, flights.size(), "Expected 5 airlines with flight number 'DL122'");

        for(int i = 0; i< flights.size(); i++){
            assertEquals("DL122", flights.get(i).getFlightNumber());
        }
    }

    @Test
    public void testFindAircraftByAircraftNameContaining() {
        List<Flight> flights = flightRepository.findByAircraftContaining("Boeing");

        assertTrue(!flights.isEmpty(), "List of airlines should not be empty");
        assertEquals(11, flights.size(), "Expected 11 airlines with aircraft names containing 'Boeing'");

        for (Flight flight : flights) {
            assertTrue(flight.getAircraft().contains("Boeing"), "Aircraft name should contain 'Boeing'");
        }
    }

    @Test
    public void testFindFlightsByDistanceGreaterThan500Miles() {

        List<Flight> flights = flightRepository.findByFlightMileageGreaterThan(500);

        assertTrue(!flights.isEmpty(), "List of flights should not be empty");
        assertEquals(11, flights.size(), "Expected 11 flights with distance greater than 500 miles");

        for (Flight flight : flights) {
            assertTrue(flight.getFlightMileage() > 500, "Flight mileage should be greater than 500 miles");
        }
    }


}