package com.section33.section33productservice.repository;

import com.section33.section33productservice.domain.dao.ProductDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductDao, Long> {
}
