package com.example.orderproject.order.domain;

import com.example.orderproject.order.util.Status;
import com.example.orderproject.orderItem.domain.OrderItem;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="order")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="order_id")
    private long order_id;

    @Column(name="customer_id")
    private long customer_id;

    @Column(name="store_id")
    private long store_id;

    @Enumerated(EnumType.STRING)
    @Column(name="orderStatus")
    private Status orderStatus;

    @Column(name="orderTime")
    private LocalDateTime orderTime;

    @Column(name="total_price")
    private int total_price;

    @OneToMany(mappedBy = "order")
    private List<OrderItem> orders = new ArrayList<OrderItem>();
}
