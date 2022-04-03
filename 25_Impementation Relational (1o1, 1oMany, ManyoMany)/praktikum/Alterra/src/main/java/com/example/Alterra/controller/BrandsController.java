package com.example.Alterra.controller;

import com.example.Alterra.domain.dto.BrandsDto;
import com.example.Alterra.service.BrandsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/brands")
public class BrandsController {
    @Autowired
    private BrandsService brandsService;

    @PostMapping(value = "")
    public ResponseEntity<Object> createBrands(@RequestBody BrandsDto brandDto) {
        return brandsService.createBrands(brandDto);
    }

}
