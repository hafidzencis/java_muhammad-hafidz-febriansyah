package com.alterra.springbootrelationship.service;

import com.alterra.springbootrelationship.domain.dao.Product;
import com.alterra.springbootrelationship.domain.dto.ProductDto;
import com.alterra.springbootrelationship.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = ProductService.class)
public class ProductServiceTest {
    @MockBean
    private ProductRepository productRepository;

    @MockBean
    private ModelMapper modelMapper;

    @Autowired
    private ProductService productService;

    @Test
    void addProductSuccess_Test(){
        Product product = Product.builder()
                .id(1L)
                .productName("Boneka Jokowi")
                .modelYear("1966")
                .price(1000000)
                .build();

        ProductDto productDto = ProductDto.builder()
                .id(1L)
                .productName("Boneka Jokowi")
                .modelYear("1966")
                .price(1000000)
                .build();

        when(modelMapper.map(any(),e))
    }
}
