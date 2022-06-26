package com.example.order.controller;

import com.example.order.model.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    // http://localhost:8081/orders
    @GetMapping(value = "/orders", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Order>> findOrders() {
        List<Order> accounts = List.of(new Order(1L, "Roll", 3), new Order(2L, "Butter", 1));
        return ResponseEntity.status(HttpStatus.OK).body(accounts);
    }
}
