package edu.ijse.springboot.rep;

import edu.ijse.springboot.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer,Long> {

}
