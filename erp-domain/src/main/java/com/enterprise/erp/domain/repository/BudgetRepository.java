package com.enterprise.erp.domain.repository;

import com.enterprise.erp.domain.entity.Budget;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BudgetRepository extends JpaRepository<Budget, Long> {
    List<Budget> findByField1(String field1);
    List<Budget> findByField2(String field2);
    List<Budget> findByField3(String field3);
    List<Budget> findByField4(String field4);
    List<Budget> findByField5(String field5);
}
