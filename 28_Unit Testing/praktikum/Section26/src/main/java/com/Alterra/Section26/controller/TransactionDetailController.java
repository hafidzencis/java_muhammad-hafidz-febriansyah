package com.Alterra.Section26.controller;

import com.Alterra.Section26.domain.dto.TransactionDetailDto;
import com.Alterra.Section26.domain.dto.TransactionDto;
import com.Alterra.Section26.service.TransactionDetailsService;
import com.Alterra.Section26.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1/transactiondetail")
public class TransactionDetailController {

    @Autowired
    private TransactionDetailsService transactionDetailsService;

    @GetMapping(value = "")
    public ResponseEntity<Object> getAllTransactionDetail(){
        return transactionDetailsService.getAllTransactionDetail();
    }

    @PostMapping(value = "")
    public ResponseEntity<Object> saveNewTransactionDetail(@RequestBody TransactionDetailDto transaction){
        return transactionDetailsService.saveNewTransactionDetails(transaction);
    }


    @PutMapping(value = "/{id}")
    public ResponseEntity<Object> updateTransactionDetail(@RequestBody TransactionDetailDto transactionDetailDto, @PathVariable String id){
        return transactionDetailsService.updateTransactionDetails(id,transactionDetailDto);

    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Object> deleteTransactionDetail(@PathVariable String id){
        return transactionDetailsService.deleteTransactionDetail(id);
    }
}
