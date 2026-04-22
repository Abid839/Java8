package com.enterprise.erp.domain.repository;

import com.enterprise.erp.domain.entity.Billing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BillingRepository extends JpaRepository<Billing, Long> {
    List<Billing> findByField1(String field1);
    List<Billing> findByField2(String field2);
    List<Billing> findByField3(String field3);
    List<Billing> findByField4(String field4);
    List<Billing> findByField5(String field5);
}
