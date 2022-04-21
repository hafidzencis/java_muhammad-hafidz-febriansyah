package com.section33.section33orderservice.controller;

import com.section33.section33orderservice.domain.dto.OrderDto;
import com.section33.section33orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping(value = "")
    public OrderDto saveOrder(@RequestBody OrderDto orderDto) {
        return orderService.saveOrder(orderDto);
    }

}
