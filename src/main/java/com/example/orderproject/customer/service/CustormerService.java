package com.example.orderproject.customer.service;

import com.example.orderproject.customer.domain.Customer;
import com.example.orderproject.customer.dto.CustomerDto;
import com.example.orderproject.customer.respository.CustomerRepository;
import com.example.orderproject.store.domain.Store;
import com.example.orderproject.store.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustormerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustormerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

//    public Customer convertToEntity(CustomerDto customerDto) {
//        Optional<Store> storeOptional = storeRepository.findByStoreName(customerDto.getStore_name());
//
//        if (storeOptional.isPresent()) {
//            Store store = storeOptional.get();
//            return Customer.builder()
//                    .store_id(store.getStore_id())
//                    .customer_name(customerDto.getCustomer_name())
//                    .customer_address(customerDto.getCustomer_address())
//                    .customer_phone(customerDto.getCustomer_phone())
//                    .build();
//        } else {
//            // 예외 처리: store_name에 해당하는 Store가 없을 경우
//            throw new RuntimeException("Store not found with name: " + customerDto.getStore_name());
//        }
//    }

    public void save(CustomerDto customerDto) {
        Customer customer = customerDto.toEntity();
        customerRepository.save(customer);
    }

    public List<CustomerDto> findAll() {
        List<Customer> customers = customerRepository.findAll();
        List<CustomerDto> customerDtos = new ArrayList<>();
        for (Customer customer : customers) {
            CustomerDto customerDto = new CustomerDto(customer);
            customerDtos.add(customerDto);
        }
        return customerDtos;
    }

    public void delete(Long id) {
        customerRepository.deleteById(id);
    }

    public Optional<CustomerDto> update(CustomerDto customerDto, Long id) {
        Optional<Customer> customer = customerRepository.findById(id);
        if (customer.isPresent()) {
            Customer customerToUpdate = customer.get();
            customerToUpdate.setCustomer_name(customerDto.getCustomer_name());
            customerToUpdate.setCustomer_phone(customerDto.getCustomer_phone());
            customerToUpdate.setCustomer_address(customerDto.getCustomer_address());
        }
        return Optional.ofNullable(customerDto);
    }

}
