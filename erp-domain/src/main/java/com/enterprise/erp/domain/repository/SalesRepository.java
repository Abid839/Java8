package com.enterprise.erp.domain.repository;

import com.enterprise.erp.domain.entity.Sales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SalesRepository extends JpaRepository<Sales, Long> {
    List<Sales> findByField1(String field1);
    List<Sales> findByField2(String field2);
    List<Sales> findByField3(String field3);
    List<Sales> findByField4(String field4);
    List<Sales> findByField5(String field5);
}
