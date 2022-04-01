package com.alterra.section27.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 */

@RestController
@RequestMapping(value = "/v1/auth")
public class UserController {

    @GetMapping(value = "")
    public ResponseEntity<?>
    
}