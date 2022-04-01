package com.example.Alterra.service;

import com.example.Alterra.constant.appconstant;
import com.example.Alterra.domain.dao.BrandsDao;
import com.example.Alterra.domain.dao.CategoriesDao;
import com.example.Alterra.domain.dao.ProductsDao;
import com.example.Alterra.domain.dto.BrandsDto;
import com.example.Alterra.domain.dto.CategoriesDto;
import com.example.Alterra.domain.dto.ProductsDto;
import com.example.Alterra.payload.Response;
import com.example.Alterra.repository.BrandsRepository;
import com.example.Alterra.repository.CategoriesRepository;
import com.example.Alterra.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductsService {
    @Autowired
    private ProductsRepository productsRepository;

    @Autowired
    private BrandsRepository brandsRepository;

    @Autowired
    private CategoriesRepository categoriesRepository;

    public ResponseEntity<Object> getProductById(Long id) {
        Optional<ProductsDao> productsDaoOptional = productsRepository.findById(id);

        if (productsDaoOptional.isEmpty())
            return Response.build(appconstant.KEY_NOT_FOUND, HttpStatus.BAD_REQUEST, null);

        ProductsDao productsDao = productsDaoOptional.get();
        return Response.build(appconstant.KEY_SUCCESS, HttpStatus.OK, ProductsDto.builder()
                .id(productsDao.getId())
                .listPrice(productsDao.getListPrice())
                .productName(productsDao.getProductName())
                .modelYear(productsDao.getModelYear())
                .build());
    }

    public ResponseEntity<Object> getAllProduct() {
        List<ProductsDao> productsDaoList = productsRepository.findAll();
        List<ProductsDto> productDtoList = new ArrayList<>();
        for(ProductsDao products : productsDaoList) {
            productDtoList.add(
                    ProductsDto.builder()
                            .id(products.getId())
                            .listPrice(products.getListPrice())
                            .productName(products.getProductName())
                            .modelYear(products.getModelYear())
                            .brandDao(
                                    BrandsDto
                                            .builder()
                                            .id(products.getBrandDao().getId())
                                            .brandName(products.getBrandDao().getBrandName())
                                            .build()
                            )
                            .categoryDao(
                                    CategoriesDto
                                            .builder()
                                            .id(products.getCategoryDao().getId())
                                            .categoryName(products.getCategoryDao().getCategoryName())
                                            .build()
                            )
                            .build()
            );
        }
        return Response.build(appconstant.KEY_SUCCESS, HttpStatus.OK, productDtoList);
    }

    public ResponseEntity<Object> createProduct(ProductsDto product) {
        Optional<BrandsDao> brandDao = brandsRepository.findById(product.getBrandDao().getId());
        if (brandDao.isEmpty())
            return Response.build(appconstant.KEY_NOT_FOUND, HttpStatus.BAD_REQUEST, null);

        Optional<CategoriesDao> categoryDao = categoriesRepository.findById(product.getCategoryDao().getId());
        if (categoryDao.isEmpty())
            return Response.build(appconstant.KEY_NOT_FOUND, HttpStatus.BAD_REQUEST, null);

        ProductsDao productsDao = ProductsDao
                .builder()
                .productName(product.getProductName())
                .modelYear(product.getModelYear())
                .listPrice(product.getListPrice())
                .brandDao(brandDao.get())
                .categoryDao(categoryDao.get())
                .build();

        productsRepository.save(productsDao);
        return Response.build(appconstant.KEY_SUCCESS, HttpStatus.CREATED, ProductsDto.builder()
                .id(productsDao.getId())
                .productName(product.getProductName())
                .modelYear(product.getModelYear())
                .listPrice(product.getListPrice())
                .brandDao(
                        BrandsDto
                                .builder()
                                .id(brandDao.get().getId())
                                .brandName(brandDao.get().getBrandName())
                                .build()
                )
                .categoryDao(
                        CategoriesDto
                                .builder()
                                .id(categoryDao.get().getId())
                                .categoryName(categoryDao.get().getCategoryName())
                                .build()
                )
                .build());
    }

    public ResponseEntity<Object> updateProduct(Long id, ProductsDto products) {
        Optional<ProductsDao> productsDaoOptional = productsRepository.findById(id);

        if (productsDaoOptional.isEmpty())
            return Response.build(appconstant.KEY_NOT_FOUND, HttpStatus.BAD_REQUEST, null);

        ProductsDao productsDao = productsDaoOptional.get();
        productsDao.setProductName(products.getProductName());
        productsDao.setListPrice(products.getListPrice());
        productsRepository.save(productsDao);

        return Response.build(appconstant.KEY_SUCCESS, HttpStatus.OK, ProductsDto.builder()
                .id(productsDao.getId())
                .listPrice(productsDao.getListPrice())
                .productName(productsDao.getProductName())
                .build());
    }

    public ResponseEntity<Object> deleteProduct(Long id) {
        Optional<ProductsDao> productsDaoOptional = productsRepository.findById(id);

        if (productsDaoOptional.isEmpty())
            return Response.build(appconstant.KEY_NOT_FOUND, HttpStatus.BAD_REQUEST, null);

        productsRepository.deleteById(id);
        return Response.build(appconstant.KEY_SUCCESS, HttpStatus.OK, null);
    }

}
