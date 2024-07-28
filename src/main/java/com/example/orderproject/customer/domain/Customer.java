package com.example.orderproject.customer.domain;

import com.example.orderproject.order.domain.Order;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="customer")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="customer_id")
    private Long customer_id;

    @Column(name="store_id")
    private Long store_id;

    @Column(name="customer_name")
    private String customer_name;

    @Column(name="customer_phone")
    private String customer_phone;

    @Column(name="customer_address")
    private String customer_address;


}
