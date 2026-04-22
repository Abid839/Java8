package com.enterprise.erp.domain.repository;

import com.enterprise.erp.domain.entity.Support;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SupportRepository extends JpaRepository<Support, Long> {
    List<Support> findByField1(String field1);
    List<Support> findByField2(String field2);
    List<Support> findByField3(String field3);
    List<Support> findByField4(String field4);
    List<Support> findByField5(String field5);
}
