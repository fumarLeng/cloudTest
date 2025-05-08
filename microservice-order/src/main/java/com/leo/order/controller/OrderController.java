package com.leo.order.controller;

import com.leo.order.dto.OrderDto;
import com.leo.order.entity.Order;
import com.leo.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.NoSuchElementException;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {

    private  final OrderService orderService;

    @GetMapping("/{id}")
    public OrderDto queryOrderById(@PathVariable("id") String orderId) {
        try {
            return this.orderService.queryOrderById(orderId);
        } catch (NoSuchElementException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
    }

}


