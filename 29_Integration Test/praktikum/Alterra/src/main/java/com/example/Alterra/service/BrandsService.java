package com.example.Alterra.service;



import com.example.Alterra.constant.appconstant;
import com.example.Alterra.domain.dao.BrandsDao;
import com.example.Alterra.domain.dto.BrandsDto;
import com.example.Alterra.payload.Response;
import com.example.Alterra.repository.BrandsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class BrandsService {
    @Autowired
    private BrandsRepository brandsRepository;

    public ResponseEntity<Object> createBrands(BrandsDto brands) {
        BrandsDao brandsDao = BrandsDao.builder()
                .brandName(brands.getBrandName())
                .build();

        brandsRepository.save(brandsDao);

        return Response.build(appconstant.KEY_SUCCESS, HttpStatus.CREATED, BrandsDto.builder()
                .id(brandsDao.getId())
                .brandName(brandsDao.getBrandName())
                .build());
    }
}
