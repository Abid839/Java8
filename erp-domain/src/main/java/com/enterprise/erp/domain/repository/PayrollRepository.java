package com.enterprise.erp.domain.repository;

import com.enterprise.erp.domain.entity.Payroll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PayrollRepository extends JpaRepository<Payroll, Long> {
    List<Payroll> findByField1(String field1);
    List<Payroll> findByField2(String field2);
    List<Payroll> findByField3(String field3);
    List<Payroll> findByField4(String field4);
    List<Payroll> findByField5(String field5);
}
