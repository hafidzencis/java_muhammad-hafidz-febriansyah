package com.Alterra.Section26.service;
import com.Alterra.Section26.domain.dao.ProductDao;
import com.Alterra.Section26.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Optional;
@SpringBootTest
public class ProdutServiceTest {
    @Autowired
    private ProductRepository productRepository;
    @Test
    public void createNewProduct(){
        ProductDao productDao = new ProductDao();
        productDao.setId("6246bb89197c937cd0042291");
        productDao.setName("Jokowi 1 9");
        productDao.setPrice(100000);
        productRepository.save(productDao);
        org.junit.jupiter.api.Assertions.assertNotNull(productRepository.findById("6246bb89197c937cd0042291").get());
    }

  @Test
    public void testUpdateProduct(){
        ProductDao productDao = productRepository.findById("6246bb89197c937cd0042291").get();
        productDao.setPrice(70000);
        productRepository.save(productDao);
        org.junit.jupiter.api.Assertions.assertNotEquals(200.00, Optional.ofNullable(productRepository.findById("6246bb89197c937cd0042291")));

  }
}
