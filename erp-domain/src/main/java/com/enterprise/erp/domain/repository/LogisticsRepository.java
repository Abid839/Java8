package com.enterprise.erp.domain.repository;

import com.enterprise.erp.domain.entity.Logistics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LogisticsRepository extends JpaRepository<Logistics, Long> {
    List<Logistics> findByField1(String field1);
    List<Logistics> findByField2(String field2);
    List<Logistics> findByField3(String field3);
    List<Logistics> findByField4(String field4);
    List<Logistics> findByField5(String field5);
}
