package com.enterprise.erp.domain.repository;

import com.enterprise.erp.domain.entity.Compliance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComplianceRepository extends JpaRepository<Compliance, Long> {
    List<Compliance> findByField1(String field1);
    List<Compliance> findByField2(String field2);
    List<Compliance> findByField3(String field3);
    List<Compliance> findByField4(String field4);
    List<Compliance> findByField5(String field5);
}
