package com.section33.section33customerservice.controller;


import com.section33.section33customerservice.domain.dao.CustomerDao;
import com.section33.section33customerservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping(value = "")
    public CustomerDao save(@RequestBody CustomerDao customerDao) {
        return customerService.save(customerDao);
    }

    @GetMapping(value = "/{id}")
    public CustomerDao getById(@PathVariable(value = "id") Long id) {
        return customerService.getById(id);

    }
}
