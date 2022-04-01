package com.alterra.section24.service;

import com.alterra.section24.domain.dao.ProductDao;
import com.alterra.section24.domain.dto.ProductDto;
import com.alterra.section24.repository.ProductRepository;
import com.alterra.section24.response.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import java.util.Optional;

import static com.alterra.section24.constant.CONSTANTAPP.KEY_FOUND;
import static com.alterra.section24.constant.CONSTANTAPP.KEY_NOT_FOUND;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public ResponseEntity<Object> getAllPost(){
        return BaseResponse.build(HttpStatus.OK,KEY_FOUND,productRepository.findAll());

    }

    public ResponseEntity<Object> saveNewProduct(ProductDto request){
        ProductDao productDao = ProductDao.builder()
                .name(request.getName())
                .description(request.getDescription())
                .build();
        productRepository.save(productDao);
        return BaseResponse.build(HttpStatus.OK,KEY_FOUND,productDao);
    }

    public ResponseEntity<Object> updateProduct(Long id,ProductDto update){
        Optional<ProductDao> ProductDaoOptional = productRepository.findById(id);
        if (ProductDaoOptional.isEmpty()){
            return BaseResponse.build(HttpStatus.BAD_REQUEST,KEY_NOT_FOUND,null);
        }

        ProductDao  productDao= ProductDaoOptional.get();
        productDao.setName(update.getName());
        productDao.setDescription(update.getDescription());
        productRepository.save(productDao);

        return BaseResponse.build(HttpStatus.OK,KEY_FOUND,productDao);
    }

    public ResponseEntity<Object> deleteProduct(Long id){
        productRepository.deleteById(id);
        return BaseResponse.build(HttpStatus.OK,KEY_FOUND,null);
    }
}
