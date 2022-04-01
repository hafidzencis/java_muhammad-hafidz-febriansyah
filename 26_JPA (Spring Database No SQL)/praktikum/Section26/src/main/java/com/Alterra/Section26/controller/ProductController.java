package com.Alterra.Section26.controller;

import com.Alterra.Section26.domain.dto.ProductDto;
import com.Alterra.Section26.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(value = "")
    public ResponseEntity<Object> getAllProduct(){
        return productService.getAllProduct();
    }

    @PostMapping(value = "")
    public ResponseEntity<Object> saveNewProduct(@RequestBody ProductDto product){
        return productService.saveNewProduct(product);
    }


    @PutMapping(value = "/{id}")
    public ResponseEntity<Object> updateProduct(@RequestBody ProductDto productDto, @PathVariable String id){
        return productService.updateProduct(id,productDto);

    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Object> deleteProduct(@PathVariable String id){
        return productService.deleteProduct(id);
    }
}




