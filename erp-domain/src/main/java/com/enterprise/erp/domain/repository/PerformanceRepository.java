package com.enterprise.erp.domain.repository;

import com.enterprise.erp.domain.entity.Performance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PerformanceRepository extends JpaRepository<Performance, Long> {
    List<Performance> findByField1(String field1);
    List<Performance> findByField2(String field2);
    List<Performance> findByField3(String field3);
    List<Performance> findByField4(String field4);
    List<Performance> findByField5(String field5);
}
