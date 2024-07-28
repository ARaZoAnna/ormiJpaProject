package com.example.orderproject.customer.respository;

import com.example.orderproject.customer.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    //public Long save(Customer customer);

    //public List<Customer> findAll();

    //public void deleteById(Long id);


}
