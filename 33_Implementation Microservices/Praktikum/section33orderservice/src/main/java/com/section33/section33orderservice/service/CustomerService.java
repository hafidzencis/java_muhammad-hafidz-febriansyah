package com.section33.section33orderservice.service;

import com.section33.section33orderservice.domain.dto.CustomerDto;
import com.section33.section33orderservice.domain.dto.ProductDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Slf4j
@Service
public class CustomerService {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${customer-data-service.url}")
    private String customerServiceurl;

    public CustomerDto getCustomerById(Long id){
        try {
//          ResponseEntity<Object> responseEntity = restTemplate.getForEntity(String.format("%s/product/%s",productServiceurl,id),ProductDto.class, id);

            CustomerDto customer = restTemplate.getForObject(String.format("%s/customer/%s",customerServiceurl,id)
                    ,CustomerDto.class);
            return customer;
        } catch (Exception e){
            log.error("Fault : ",e);
            throw e;
        }
    }
}
