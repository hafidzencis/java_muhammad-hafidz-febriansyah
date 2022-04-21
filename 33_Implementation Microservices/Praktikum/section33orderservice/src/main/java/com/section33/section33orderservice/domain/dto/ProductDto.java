package com.section33.section33orderservice.domain.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto  {

//    @Serial
//    private static final long serialVersionUID = 3967977136306081192L;

    private Long id;
    private String product_name;
    private Integer price;
}
