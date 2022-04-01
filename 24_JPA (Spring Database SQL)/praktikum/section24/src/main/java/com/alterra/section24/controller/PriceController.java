package com.alterra.section24.controller;

import com.alterra.section24.domain.dto.PriceDto;

import com.alterra.section24.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1/price")
public class PriceController {

    @Autowired
    private PriceService priceService;

    @GetMapping(value = "")
    public ResponseEntity<Object> getAllPrice(){
        return priceService.getAllPrice();
    }

    @PostMapping(value = "")
    public ResponseEntity<Object> saveNewPrice(@RequestBody PriceDto price){
        return priceService.saveNewPrice(price);
    }


    @PutMapping(value = "/{id}")
    public ResponseEntity<Object> updatePrice(@RequestBody PriceDto priceDto, @PathVariable Long id){
        return priceService.updatePrice(id,priceDto);

    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Object> deletePrice(@PathVariable Long id){
        return priceService.deletePrice(id);
    }
}
