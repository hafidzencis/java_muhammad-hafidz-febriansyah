package com.Alterra.Section26.repository;

import com.Alterra.Section26.domain.dao.ProductDao;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<ProductDao,String> {
}
