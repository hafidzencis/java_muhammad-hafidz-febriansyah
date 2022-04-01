package com.Alterra.Section26.service;


import com.Alterra.Section26.domain.dao.ProductDao;
import com.Alterra.Section26.domain.dto.ProductDto;
import com.Alterra.Section26.repository.ProductRepository;
import com.Alterra.Section26.response.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static com.Alterra.Section26.constant.CONSTANTAPP.KEY_FOUND;
import static com.Alterra.Section26.constant.CONSTANTAPP.KEY_NOT_FOUND;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    private ProductDto request;

    public ResponseEntity<Object> getAllProduct() {
        return BaseResponse.build(HttpStatus.OK, KEY_FOUND, productRepository.findAll());

    }

    public ResponseEntity<Object> saveNewProduct(ProductDto request) {
        ProductDao productDao = ProductDao.builder()
                .name(request.getName())
                .price(request.getPrice())
                .build();
        productRepository.save(productDao);
        return BaseResponse.build(HttpStatus.OK, KEY_FOUND, productDao);
    }


    public ResponseEntity<Object> updateProduct(String id, ProductDto update){
        Optional<ProductDao> ProductDaoOptional = productRepository.findById(id);
        if (ProductDaoOptional.isEmpty()){
            return BaseResponse.build(HttpStatus.BAD_REQUEST,KEY_NOT_FOUND,null);
        }


        ProductDao productDao = ProductDaoOptional.get();
        productDao.setName(update.getName());
        productDao.setPrice(update.getPrice());
        productRepository.save(productDao);

        return BaseResponse.build(HttpStatus.OK,KEY_FOUND,productDao);
    }

    public ResponseEntity<Object> deleteProduct(String id){
        productRepository.deleteById(id);
        return BaseResponse.build(HttpStatus.OK,KEY_FOUND,null);
    }

}
