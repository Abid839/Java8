package com.enterprise.erp.domain.repository;

import com.enterprise.erp.domain.entity.Audit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuditRepository extends JpaRepository<Audit, Long> {
    List<Audit> findByField1(String field1);
    List<Audit> findByField2(String field2);
    List<Audit> findByField3(String field3);
    List<Audit> findByField4(String field4);
    List<Audit> findByField5(String field5);
}
