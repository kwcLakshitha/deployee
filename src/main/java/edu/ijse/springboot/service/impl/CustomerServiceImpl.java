package edu.ijse.springboot.service.impl;

import edu.ijse.springboot.entity.Customer;
import edu.ijse.springboot.rep.CustomerRepo;
import edu.ijse.springboot.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepo customerRepo;

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepo.save(customer);
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return customerRepo.save(customer);
    }

    @Override
    public void deleteCustomer(Customer customer) {
        customerRepo.delete(customer);
    }

    @Override
    public List<Customer> findAllCustomer() {
        return customerRepo.findAll();
    }

    @Override
    public Customer findCustomerById(Long id) {
        return customerRepo.findById(id).get();
    }
}
