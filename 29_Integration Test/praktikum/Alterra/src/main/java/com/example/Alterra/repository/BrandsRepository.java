package com.example.Alterra.repository;

import com.example.Alterra.domain.dao.BrandsDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandsRepository extends JpaRepository<BrandsDao,Long> {
}
