package com.enterprise.erp.web.controller;

import com.enterprise.erp.core.service.OrderProcessingService;
import com.enterprise.erp.domain.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderProcessingService orderProcessingService;

    @Autowired
    public OrderController(OrderProcessingService orderProcessingService) {
        this.orderProcessingService = orderProcessingService;
    }

    @PostMapping
    public ResponseEntity<Order> createOrder(@RequestBody Order order) {
        Order processedOrder = orderProcessingService.processNewOrder(order);
        return new ResponseEntity<>(processedOrder, HttpStatus.CREATED);
    }
}
