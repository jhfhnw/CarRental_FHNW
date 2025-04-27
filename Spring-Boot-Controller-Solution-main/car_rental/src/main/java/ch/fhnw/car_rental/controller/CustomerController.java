package ch.fhnw.car_rental.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import ch.fhnw.car_rental.service.CarService;
import ch.fhnw.car_rental.service.CustomerService;
import ch.fhnw.car_rental.data.domain.Customer;
import ch.fhnw.car_rental.data.repository.CustomerRepository;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping(path = "/api")
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    
        // GET: Hole einen Kunden anhand der ID
        @GetMapping(path = "/customer/{id}", produces = "application/json")
        public ResponseEntity<Customer> getCustomerById(@PathVariable Long id) {
            try {
                Customer customer = customerService.findCustomerById(id);
                if (customer == null) {
                    throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Customer not found");
                }
                return ResponseEntity.ok(customer);
            } catch (Exception e) {
                throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
            }
        }
    
        // GET: Hole alle Kunden
        @GetMapping(path = "/customerlist", produces = "application/json")
        public ResponseEntity<List<Customer>> getAllCustomers() {
            try {
                List<Customer> customers = customerService.getAllCustomers();
                if (customers.isEmpty()) {
                    throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No customers found");
                }
                return ResponseEntity.ok(customers);
            } catch (Exception e) {
                throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
            }
        }
    
        // POST: Füge einen neuen Kunden hinzu
        @PostMapping(path="/customer", consumes="application/json", produces = "application/json")
        public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {
            try {
                Customer savedCustomer = customerService.addCustomer(customer);
                return ResponseEntity.status(HttpStatus.CREATED).body(savedCustomer);
            } catch (Exception e) {
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
            }
        }
    
        // PUT: Aktualisiere einen bestehenden Kunden
        @PutMapping(path = "/customer/{id}", consumes = "application/json", produces = "application/json")
        public ResponseEntity<Customer> updateCustomer(@PathVariable Long id, @RequestBody Customer customer) {
            try {
                customer.setCustomerId(id.intValue());
                Customer updatedCustomer = customerService.updateCustomer(customer);
                return ResponseEntity.ok(updatedCustomer);
            } catch (Exception e) {
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
            }
        }
    
        // DELETE: Lösche einen Kunden anhand der ID
        @DeleteMapping(path = "customer/{id}")
        public ResponseEntity<Void> deleteCustomer(@PathVariable Long id) {
            try {
                Customer deletedCustomer = customerService.deleteCustomer(id);
                if (deletedCustomer == null) {
                    throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Customer not found");
                }
                return ResponseEntity.noContent().build();
            } catch (Exception e) {
                throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
            }
        }
    }
