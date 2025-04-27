package ch.fhnw.car_rental.data.repository;

import ch.fhnw.car_rental.data.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByCustomerId(Integer customerId); // Methodennamen geändert
}