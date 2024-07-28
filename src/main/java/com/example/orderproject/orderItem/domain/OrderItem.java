package com.example.orderproject.orderItem.domain;

import com.example.orderproject.order.domain.Order;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="orderItem")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="orderItemId")
    private long orderItemId;

    @Column(name="orderId")
    private Long orderId;

    @Column(name="menuId")
    private Long menuId;

    @Column(name="count")
    private Integer count;

    @ManyToOne
    @JoinColumn(name="order_id")
    private Order order;

    public void setOrder(Order order) {
        this.order = order;
    }

}
