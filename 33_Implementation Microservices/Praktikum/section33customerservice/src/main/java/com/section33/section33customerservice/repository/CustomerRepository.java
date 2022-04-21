package com.section33.section33customerservice.repository;

import com.section33.section33customerservice.domain.dao.CustomerDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerDao, Long> {
}
