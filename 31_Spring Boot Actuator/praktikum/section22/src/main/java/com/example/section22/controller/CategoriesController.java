package com.example.section22.controller;

import java.util.List;
import java.util.Optional;

import com.example.section22.entity.Category;
import com.example.section22.repository.CategoryRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class CategoriesController {
    @Autowired
    private CategoryRepository categoryRepository;

    Logger logger = LoggerFactory.getLogger(CategoriesController.class);

    @GetMapping("/posts")
    public List<Category> getAllCategories(){

        logger.info("An Info Message");
        return categoryRepository.findAll();
    }

    @GetMapping("/posts/{id}")
    public Optional<Category> getDetailCategory(@PathVariable Long id){

        logger.info("An Info Message");
        return categoryRepository.findById(id);
    }

    @PostMapping("/posts")
    public Category createNewCategory(@RequestBody Category payload){
        logger.debug("A Debug Message ");
        return categoryRepository.save(payload);
    }

    @DeleteMapping("/posts/{id}")
    public void deleteCategory(@PathVariable Long id){
        Optional<Category> categoryById = categoryRepository.findById(id);
        categoryById.ifPresent(res -> {
            categoryRepository.delete(res);

        });
    }
}