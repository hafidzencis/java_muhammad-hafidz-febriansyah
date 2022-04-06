package com.example.Alterra.controller;

import com.example.Alterra.domain.dto.CategoriesDto;
import com.example.Alterra.service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/categories")
public class CategoriesController {
    @Autowired
    private CategoriesService categoriesService ;

    @PostMapping(value = "")
    public ResponseEntity<Object> createCategories(@RequestBody CategoriesDto categoriesDto) {
        return categoriesService.createCategory(categoriesDto);
    }

}
