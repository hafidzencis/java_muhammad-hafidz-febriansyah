package com.alterra.section24.service;

import com.alterra.section24.domain.dao.PriceDao;
import com.alterra.section24.domain.dao.ProductDao;
import com.alterra.section24.domain.dto.PriceDto;
import com.alterra.section24.domain.dto.ProductDto;
import com.alterra.section24.repository.PriceRepository;
import com.alterra.section24.response.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static com.alterra.section24.constant.CONSTANTAPP.KEY_FOUND;
import static com.alterra.section24.constant.CONSTANTAPP.KEY_NOT_FOUND;

@Service
public class PriceService {

    @Autowired
    private PriceRepository priceRepository;

    public ResponseEntity<Object> getAllPrice() {
        return BaseResponse.build(HttpStatus.OK, KEY_FOUND, priceRepository.findAll());

    }

    public ResponseEntity<Object> saveNewPrice(PriceDto request) {
        PriceDao priceDao = PriceDao.builder()
                .jumlahStock(request.getJumlahStock())
                .price(request.getPrice())
                .build();
        priceRepository.save(priceDao);
        return BaseResponse.build(HttpStatus.OK, KEY_FOUND, priceDao);
    }

    public ResponseEntity<Object> updatePrice(Long id, PriceDto update){
        Optional<PriceDao> PriceDaoOptional = priceRepository.findById(id);
        if (PriceDaoOptional.isEmpty()){
            return BaseResponse.build(HttpStatus.BAD_REQUEST,KEY_NOT_FOUND,null);
        }

        PriceDao priceDao= PriceDaoOptional.get();
        priceDao.setJumlahStock(update.getJumlahStock());
        priceDao.setPrice(update.getPrice());
        priceRepository.save(priceDao);


        return BaseResponse.build(HttpStatus.OK,KEY_FOUND,priceDao);
    }

    public ResponseEntity<Object> deletePrice(Long id){
        priceRepository.deleteById(id);
        return BaseResponse.build(HttpStatus.OK,KEY_FOUND,null);
    }

}