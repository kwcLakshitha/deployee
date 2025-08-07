package edu.ijse.springboot.service;

import edu.ijse.springboot.entity.Customer;

import java.util.List;

public interface CustomerService {
    Customer saveCustomer(Customer customer);
    Customer updateCustomer(Customer customer);
    void deleteCustomer(Customer customer);
    List<Customer> findAllCustomer();
    Customer findCustomerById(Long id);

}
