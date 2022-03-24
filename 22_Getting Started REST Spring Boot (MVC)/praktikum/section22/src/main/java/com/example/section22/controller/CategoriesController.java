package com.example.section22.controller;

import java.util.List;
import java.util.Optional;

import com.example.section22.entity.Category;
import com.example.section22.repository.CategoryRepository;

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

    @GetMapping("/posts")
    public List<Category> getAllCategories(){
        return categoryRepository.findAll();
    }

    @GetMapping("/posts/{id}")
    public Optional<Category> getDetailCategory(@PathVariable Long id){
        return categoryRepository.findById(id);
    }

    @PostMapping("/posts")
    public Category createNewCategory(@RequestBody Category payload){
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