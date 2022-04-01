package com.example.Alterra.repository;

import com.example.Alterra.domain.dao.ProductsDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends JpaRepository<ProductsDao,Long> {
}
