package com.section33.section33orderservice.service;

import com.section33.section33orderservice.domain.dto.ProductDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
public class ProductService {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${product-data-service.url}")
    private String productServiceurl;

    public ProductDto getProductById(Long id){
        try {
//          ResponseEntity<Object> responseEntity = restTemplate.getForEntity(String.format("%s/product/%s",productServiceurl,id),ProductDto.class, id);

            ProductDto product = restTemplate.getForObject(String.format("%s/product/%s",productServiceurl,id)
                    ,ProductDto.class);
            return product;
        } catch (Exception e){
            log.error("Fault : ",e);
            throw e;
        }
    }
}
