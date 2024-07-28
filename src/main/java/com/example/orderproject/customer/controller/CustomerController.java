package com.example.orderproject.customer.controller;

import com.example.orderproject.customer.dto.CustomerDto;
import com.example.orderproject.customer.service.CustormerService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("customer")
public class CustomerController {

    CustormerService custormerService;

    @Autowired
    public CustomerController(CustormerService custormerService) {
        this.custormerService = custormerService;
    }

    @PostMapping("/create")
    public void createCustomer(@RequestBody CustomerDto customerDto) {
        custormerService.save(customerDto);
    }

    @GetMapping("/findAll")
    public List<CustomerDto> findAllCustomers() {
        return custormerService.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCustomer(@RequestParam long id) {
        custormerService.delete(id);
    }

    @PutMapping("/update/{id}")
    public void updateCustomer(@PathVariable long id, @RequestBody CustomerDto customerDto) {
        custormerService.update(customerDto, id);
    }
}
