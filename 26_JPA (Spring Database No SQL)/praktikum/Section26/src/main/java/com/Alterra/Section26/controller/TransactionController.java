package com.Alterra.Section26.controller;

import com.Alterra.Section26.domain.dto.ProductDto;
import com.Alterra.Section26.domain.dto.TransactionDto;
import com.Alterra.Section26.service.ProductService;
import com.Alterra.Section26.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1/transaction")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @GetMapping(value = "")
    public ResponseEntity<Object> getAllTransaction(){
        return transactionService.getAllTransaction();
    }

    @PostMapping(value = "")
    public ResponseEntity<Object> saveNewTransaction(@RequestBody TransactionDto transaction){
        return transactionService.saveNewTransaction(transaction);
    }


    @PutMapping(value = "/{id}")
    public ResponseEntity<Object> updateTransaction(@RequestBody TransactionDto transactionDto, @PathVariable String id){
        return transactionService.updateTransaction(id,transactionDto);

    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Object> deleteTransaction(@PathVariable String id){
        return transactionService.deleteTransaction(id);
    }
}