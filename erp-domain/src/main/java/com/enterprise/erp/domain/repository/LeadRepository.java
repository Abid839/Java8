package com.enterprise.erp.domain.repository;

import com.enterprise.erp.domain.entity.Lead;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LeadRepository extends JpaRepository<Lead, Long> {
    List<Lead> findByField1(String field1);
    List<Lead> findByField2(String field2);
    List<Lead> findByField3(String field3);
    List<Lead> findByField4(String field4);
    List<Lead> findByField5(String field5);
}
