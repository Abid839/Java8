package com.enterprise.erp.domain.repository;

import com.enterprise.erp.domain.entity.Legal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LegalRepository extends JpaRepository<Legal, Long> {
    List<Legal> findByField1(String field1);
    List<Legal> findByField2(String field2);
    List<Legal> findByField3(String field3);
    List<Legal> findByField4(String field4);
    List<Legal> findByField5(String field5);
}
