package com.enterprise.erp.domain.repository;

import com.enterprise.erp.domain.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {
    List<Expense> findByField1(String field1);
    List<Expense> findByField2(String field2);
    List<Expense> findByField3(String field3);
    List<Expense> findByField4(String field4);
    List<Expense> findByField5(String field5);
}
