package com.example.orderproject.order.controller;

import com.example.orderproject.order.dto.OrderDto;
import com.example.orderproject.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/create")
    public void createOrder(OrderDto orderDto) {
        orderService.save(orderDto);
    }


}
