package com.enterprise.erp.domain.repository;

import com.enterprise.erp.domain.entity.Tax;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaxRepository extends JpaRepository<Tax, Long> {
    List<Tax> findByField1(String field1);
    List<Tax> findByField2(String field2);
    List<Tax> findByField3(String field3);
    List<Tax> findByField4(String field4);
    List<Tax> findByField5(String field5);
}
