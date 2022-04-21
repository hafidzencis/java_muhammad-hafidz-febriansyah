package com.section33.section33orderservice.service;

import com.section33.section33orderservice.domain.dto.CustomerDto;
import com.section33.section33orderservice.domain.dto.OrderDto;
import com.section33.section33orderservice.domain.dto.ProductDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OrderService {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private ProductService productService;

    public OrderDto saveOrder(OrderDto request){
        log.info("Get Customer By Id");
        CustomerDto customerDto = customerService.getCustomerById(request.getCustomer().getId());

        log.info("Get Product By Id");
        ProductDto productDto = productService.getProductById(request.getProduct().getId());

        Integer totalPrice = productDto.getPrice() * request.getQty();

        return OrderDto.builder()
                .customer(customerDto)
                .product(productDto)
                .totalPrice(totalPrice)
                .qty(request.getQty())
                .build();
    }
}
