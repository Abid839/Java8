package com.enterprise.erp.domain.repository;

import com.enterprise.erp.domain.entity.Procurement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProcurementRepository extends JpaRepository<Procurement, Long> {
    List<Procurement> findByField1(String field1);
    List<Procurement> findByField2(String field2);
    List<Procurement> findByField3(String field3);
    List<Procurement> findByField4(String field4);
    List<Procurement> findByField5(String field5);
}
