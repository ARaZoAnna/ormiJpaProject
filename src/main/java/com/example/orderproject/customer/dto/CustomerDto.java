package com.example.orderproject.customer.dto;

import com.example.orderproject.customer.domain.Customer;
import com.example.orderproject.store.domain.Store;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerDto {
    @NotNull
    private Long store_id;

    @NotNull
    private String customer_name;

    private String customer_phone;

    private String customer_address;

    public CustomerDto(Customer customer) {
        this.store_id = customer.getStore_id();
        this.customer_name = customer.getCustomer_name();
        this.customer_phone = customer.getCustomer_phone();
        this.customer_address = customer.getCustomer_address();
    }

    public Customer toEntity(){
        return Customer.builder()
                .store_id(store_id)
                .customer_name(customer_name)
                .customer_address(customer_address)
                .customer_phone(customer_phone)
                .build();
    }

}
