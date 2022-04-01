package com.alterra.section24.repository;

import com.alterra.section24.domain.dao.PriceDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceRepository extends JpaRepository<PriceDao,Long> {
}
