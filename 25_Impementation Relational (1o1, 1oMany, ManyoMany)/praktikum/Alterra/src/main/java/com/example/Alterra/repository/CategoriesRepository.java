package com.example.Alterra.repository;

import com.example.Alterra.domain.dao.CategoriesDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriesRepository extends JpaRepository<CategoriesDao,Long> {
}
