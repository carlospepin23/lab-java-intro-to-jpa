-- Author: Carlos Pepin Delgado <carlos.pepin1@upr.edu>

DROP SCHEMA IF EXISTS lab2;
CREATE SCHEMA lab2;
USE lab2;

CREATE TABLE customer (
	id INT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(255) NOT NULL,
    status VARCHAR(255),
    total_flightMileage INT

);

CREATE TABLE flight (
	id INT AUTO_INCREMENT PRIMARY key,
	customerId INT,
	flightNumber VARCHAR(255),
	aircraft VARCHAR(255),
	totalAircraftSeats INT,
	flightMileage INT,

	FOREIGN KEY (customerId) REFERENCES customer(id)

);


INSERT INTO customer (name, status,  total_flightMileage)
VALUES
    ('Agustine Riviera', 'Silver',115235),
    ('Alaina Sepulvida', 'None',6008),
    ('Tom Jones', 'Gold',205767),
    ('Sam Rio', 'None',2653),
    ('Jessica James', 'Silver',127656),
    ('Ana Janco', 'Silver',136773),
    ('Jennifer Cortez', 'Gold',300582),
    ('Christian Janco', 'Silver',14642);

INSERT INTO flight (customerId, flightNumber, aircraft, totalAircraftSeats,flightMileage) VALUES
    (1, 'DL143','Boeing 747', 400, 135),
    (1, 'DL122','Airbus A330', 236, 4370),
    (2, 'DL122','Airbus A330', 236, 4370),
    (3, 'DL122','Airbus A330', 236, 4370),
    (3, 'DL53','Boeing 777', 264, 2078),
    (4, 'DL143','Boeing 747', 400, 135),
    (3, 'DL222','Boeing 777', 264, 1765),
    (5, 'DL143','Boeing 747', 400, 135),
    (4, 'DL37','Boeing 747', 400, 531),
    (6, 'DL222','Boeing 777', 264, 1765),
    (7, 'DL222','Boeing 777', 264, 1765),
    (5, 'DL122','Airbus A330', 236, 4370),
    (4, 'DL143','Boeing 747', 400, 135),
    (8, 'DL222','Boeing 777', 264, 1765);

