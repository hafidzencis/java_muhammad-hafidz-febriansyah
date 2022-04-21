package com.section33.section33productservice.controller;

import com.section33.section33productservice.domain.dao.ProductDao;
import com.section33.section33productservice.repository.ProductRepository;
import com.section33.section33productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/product")
public class ProductController {
    @Autowired
    private ProductService  productService;

    @PostMapping(value = "")
    public ProductDao save(@RequestBody ProductDao productDao) {
        return productService.save(productDao);
    }

    @GetMapping(value = "/{id}")
    public ProductDao getById(@PathVariable(value = "id") Long id) {
        return productService.getById(id);
    }

}