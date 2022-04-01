package com.example.Alterra.service;

import com.example.Alterra.constant.appconstant;
import com.example.Alterra.domain.dao.CategoriesDao;
import com.example.Alterra.domain.dto.CategoriesDto;
import com.example.Alterra.payload.Response;
import com.example.Alterra.repository.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CategoriesService {
    @Autowired
    private CategoriesRepository categoriesRepository;

    public ResponseEntity<Object> createCategory(CategoriesDto category) {
        CategoriesDao categoriesDao = CategoriesDao
                .builder()
                .categoryName(category.getCategoryName())
                .build();

        categoriesRepository.save(categoriesDao);

        return Response.build(appconstant.KEY_SUCCESS, HttpStatus.CREATED, CategoriesDto.builder()
                        .id(categoriesDao.getId())
                        .categoryName(categoriesDao.getCategoryName())
                .build());
    }
}
