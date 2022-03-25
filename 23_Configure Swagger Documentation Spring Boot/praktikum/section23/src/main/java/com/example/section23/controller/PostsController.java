package com.example.section23.controller;
import java.util.List;
import java.util.Optional;
import com.example.section23.entity.ObjectThings;
import com.example.section23.repository.PostRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")

public class PostsController {

    @Autowired
    private PostRepository postRepository;

    @GetMapping("/posts")
    public List<ObjectThings> getAllCategories(){
        return postRepository.findAll();
    }

    @GetMapping("/posts/{id}")
    public Optional<ObjectThings> getDetailCategory(@PathVariable Long id){
        return postRepository.findById(id);
    }

    @PostMapping("/posts")
    public ObjectThings createNewCategory(@RequestBody ObjectThings payload){
        return postRepository.save(payload);
    }

    @PutMapping("/posts/{id}")
    public Optional<ObjectThings> updateCategory(@PathVariable Long id,
                                             @RequestBody ObjectThings objectthing){
        Optional<ObjectThings> objThingById = postRepository.findById(id);

        objThingById.ifPresent(res -> {
            res.setProduct(objectthing.getProduct());
            res.setName(objectthing.getName());
            res.setDescription(objectthing.getDescription());
            res.setStock(objectthing.getStock());
            res.setPrice(objectthing.getPrice());

            postRepository.save(res);
        });

        return objThingById;
    }

    @DeleteMapping("/posts/{id}")
    public void deleteCategory(@PathVariable Long id){
        Optional<ObjectThings> categoryById = postRepository.findById(id);

        categoryById.ifPresent(res -> {
            postRepository.delete(res);

        });
    }
}
