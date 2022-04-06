package com.example.Alterra.service;

import com.example.Alterra.constant.appconstant;

import com.example.Alterra.domain.dao.StocksDao;
import com.example.Alterra.domain.dto.CategoriesDto;
import com.example.Alterra.domain.dto.StocksDto;
import com.example.Alterra.payload.Response;
import com.example.Alterra.repository.CategoriesRepository;
import com.example.Alterra.repository.StocksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class StocksService {
    @Autowired
    private StocksRepository stocksRepository;

    public ResponseEntity<Object> createStocks(StocksDto stocks) {
       StocksDao stocksDao = StocksDao.builder()
                .productId(stocks.getProductId())
                .quantity(stocks.getQuantity())
                .build();

    stocksRepository.save(stocksDao);

        return Response.build(appconstant.KEY_SUCCESS, HttpStatus.CREATED, StocksDto.builder()
                .id(stocksDao.getId())
                .productId(stocksDao.getProductId())
                .quantity(stocksDao.getQuantity())
                .build());
    }
}
