package com.example.Alterra.controller;

import com.example.Alterra.domain.dto.StocksDto;
import com.example.Alterra.service.StocksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/stocks")
public class StocksController {

    @Autowired
    private StocksService stocksService;

    @PostMapping(value = " ")
    public ResponseEntity<Object> createStokcs(@RequestBody StocksDto stocks){
        return stocksService.createStocks(stocks);
    }

}
