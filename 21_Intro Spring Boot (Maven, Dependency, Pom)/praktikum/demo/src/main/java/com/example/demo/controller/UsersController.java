package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/messages")
public class UsersController {

    @GetMapping()
    public String getUsers() {
        return "GET Hello World";
    }

    @PostMapping()
    public String createUser(){
        return "POST Hello World";
    }

    @DeleteMapping()
    public String deleteUser(){
        return "DELETE Hello World";
    }
}
