package com.example.Alterra.repository;

import com.example.Alterra.domain.dao.StocksDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StocksRepository extends JpaRepository<StocksDao,Long> {
}
