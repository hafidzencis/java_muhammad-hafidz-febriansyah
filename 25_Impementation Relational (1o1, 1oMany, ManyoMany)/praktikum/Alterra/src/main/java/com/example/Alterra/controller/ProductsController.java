package com.example.Alterra.controller;

import com.example.Alterra.domain.dto.ProductsDto;
import com.example.Alterra.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1/products")
public class ProductsController {

    @Autowired
    private ProductsService productsService;

    @GetMapping(value = "")
    public ResponseEntity<Object> getAllProducts() {
        return productsService.getAllProduct();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Object> getProductById(@PathVariable Long id) {
        return productsService.getProductById(id);
    }

    @PostMapping(value = "")
    public ResponseEntity<Object> createProduct(@RequestBody ProductsDto productDto) {
        return productsService.createProduct(productDto);
    }
}
