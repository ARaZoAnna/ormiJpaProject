package com.example.orderproject.store.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="store")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="store_id")
    private long store_id;

    @Column(name="store_name")
    private String store_name;

    @Column(name="store_address")
    private String store_address;

    @Column(name="store_phone")
    private String store_phone;
}
