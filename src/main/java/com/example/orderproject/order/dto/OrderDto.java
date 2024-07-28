package com.example.orderproject.order.dto;

import com.example.orderproject.order.domain.Order;
import com.example.orderproject.order.util.Status;
import com.example.orderproject.orderItem.domain.OrderItem;
import com.example.orderproject.orderItem.dto.OrderItemDto;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderDto {

    @NotNull
    private long customer_id;

    @NotNull
    private long store_id;

    @NotNull
    private Status orderStatus;

    @NotNull
    private List<OrderItemDto> Items;

    public OrderDto(Order order) {
        this.setCustomer_id(order.getCustomer_id());
        this.setStore_id(order.getStore_id());
        this.setOrderStatus(order.getOrderStatus());
    }

    public Order toEntity(){
        Order order = Order.builder()
                .customer_id(customer_id)
                .store_id(store_id)
                .orderStatus(Status.RECEIVED)
                .build();

//        List<OrderItem> orderItems = this.Items.stream()
//                .map(orderItemDto -> );
        return order;
    }




}
