package com.section33.section33productservice.service;



import com.section33.section33productservice.domain.dao.ProductDao;
import com.section33.section33productservice.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.Optional;


@Slf4j
@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public ProductDao save(ProductDao request){
        return productRepository.save(request);
    }

    public ProductDao getById(Long Id){
        Optional<ProductDao> product = productRepository.findById(Id);
        if (product.isEmpty()){
            return ProductDao.builder().build();
        }
        return product.get();
    }
}



//    public ResponseEntity<Object> getProductById(Long id) {
//        Optional<ProductDao> productDaoOptional = productRepository.findById(id);
//
//        if (productDaoOptional.isEmpty())
//            return Response.build(ResponseMessage.NOT_FOUND, HttpStatus.BAD_REQUEST, null);
//
//        ProductDao productDao = productDaoOptional.get();
//        return Response.build(ResponseMessage.SUCCESS, HttpStatus.OK, ProductDto.builder()
//                .product_id(productDao.getProduct_id())
//                .product_name(productDao.getProduct_name())
//                .model_year(productDao.getModel_year())
//                .list_year(productDao.getList_year())
//                .build());
//    }
//
//    public ResponseEntity<Object> getAllProduct() {
//        List<ProductDao> productDaoList = productRepository.findAll();
//        List<ProductDto> productDtoList = new ArrayList<>();
//        for(ProductDao product : productDaoList) {
//            productDtoList.add(ProductDto.builder()
//                    .product_id(product.getProduct_id())
//                    .product_name(product.getProduct_name())
//                    .model_year(product.getModel_year())
//                    .list_year(product.getList_year())
//                    .build());
//        }
//        return Response.build(ResponseMessage.SUCCESS, HttpStatus.OK, productDtoList);
//    }
//
//
//
//    public ResponseEntity<Object> createProduct(ProductDto product) {
//        ProductDao productDao = ProductDao.builder()
//                .product_name(product.getProduct_name())
//                .model_year(product.getModel_year())
//                .list_year(product.getList_year())
//                .build();
//
//        productRepository.save(productDao);
//        return Response.build(ResponseMessage.SUCCESS, HttpStatus.CREATED, ProductDto.builder()
//                        .product_id(productDao.getProduct_id())
//                        .product_name(productDao.getProduct_name())
//                        .model_year(productDao.getModel_year())
//                        .list_year(productDao.getList_year())
//                .build());
//    }
//
//    public ResponseEntity<Object> updateProduct(Long id, ProductDto product) {
//        Optional<ProductDao> productDaoOptional = productRepository.findById(id);
//
//        if (productDaoOptional.isEmpty())
//            return Response.build(ResponseMessage.NOT_FOUND, HttpStatus.BAD_REQUEST, null);
//
//        ProductDao productDao = productDaoOptional.get();
//        productDao.setProduct_name(product.getProduct_name());
//        productDao.setModel_year(product.getModel_year());
//        productDao.setList_year(product.getList_year());
//        productRepository.save(productDao);
//
//        return Response.build(ResponseMessage.SUCCESS, HttpStatus.OK, ProductDto.builder()
//                .product_id(product.getProduct_id())
//                .product_name(product.getProduct_name())
//                .model_year(product.getModel_year())
//                .list_year(product.getList_year())
//                .build());
//    }
//
//    public ResponseEntity<Object> deleteProduct(Long id) {
//        Optional<ProductDao> productDaoOptional = productRepository.findById(id);
//
//        if (productDaoOptional.isEmpty())
//            return Response.build(ResponseMessage.NOT_FOUND, HttpStatus.BAD_REQUEST, null);
//
//        productRepository.deleteById(id);
//        return Response.build(ResponseMessage.SUCCESS, HttpStatus.OK, null);
//    }
//}
