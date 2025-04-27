package ch.fhnw.car_rental.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ch.fhnw.car_rental.data.domain.Customer;
import ch.fhnw.car_rental.data.repository.CustomerRepository;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer findCustomerById(Long customerId) {
        return customerRepository.findById(customerId).orElse(null);
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer findCustomerByCustomerId(Integer customerId) {
        return customerRepository.findByCustomerId(customerId); // Methodennamen geändert
    }

    public Customer addCustomer(Customer customer) throws Exception {
        if (customer.getUsername() == null || customer.getUsername().isEmpty()) {
            throw new Exception("Username cannot be null or empty");
        }
        if (customer.getPassword() == null || customer.getPassword().isEmpty()) {
            throw new Exception("Password cannot be null or empty");
        }
        return customerRepository.save(customer);
    }

    public Customer deleteCustomer(Long customerId) {
        Customer customer = findCustomerById(customerId);
        if (customer != null) {
            customerRepository.delete(customer);
        }
        return customer;
    }

    public Customer updateCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

}
