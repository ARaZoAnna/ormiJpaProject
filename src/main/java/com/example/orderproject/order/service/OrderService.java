package com.example.orderproject.order.service;

import com.example.orderproject.order.domain.Order;
import com.example.orderproject.order.dto.OrderDto;
import com.example.orderproject.order.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
//주문 생성
    public void save(OrderDto orderDto) {
        Order order = orderDto.toEntity();
        orderRepository.save(order);
    }
//주문 수정


}
