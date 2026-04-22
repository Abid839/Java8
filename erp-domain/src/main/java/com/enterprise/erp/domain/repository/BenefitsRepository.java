package com.enterprise.erp.domain.repository;

import com.enterprise.erp.domain.entity.Benefits;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BenefitsRepository extends JpaRepository<Benefits, Long> {
    List<Benefits> findByField1(String field1);
    List<Benefits> findByField2(String field2);
    List<Benefits> findByField3(String field3);
    List<Benefits> findByField4(String field4);
    List<Benefits> findByField5(String field5);
}
