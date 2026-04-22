package com.enterprise.erp.domain.repository;

import com.enterprise.erp.domain.entity.Analytics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnalyticsRepository extends JpaRepository<Analytics, Long> {
    List<Analytics> findByField1(String field1);
    List<Analytics> findByField2(String field2);
    List<Analytics> findByField3(String field3);
    List<Analytics> findByField4(String field4);
    List<Analytics> findByField5(String field5);
}
