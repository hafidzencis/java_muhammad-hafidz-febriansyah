package com.section33.section33orderservice.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {
    private CustomerDto customer_id;
    private ProductDto product_id;
    private Integer totalPrice;
    private Integer qty;
}
