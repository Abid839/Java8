package com.enterprise.erp.domain.repository;

import com.enterprise.erp.domain.entity.TimeSheet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TimeSheetRepository extends JpaRepository<TimeSheet, Long> {
    List<TimeSheet> findByField1(String field1);
    List<TimeSheet> findByField2(String field2);
    List<TimeSheet> findByField3(String field3);
    List<TimeSheet> findByField4(String field4);
    List<TimeSheet> findByField5(String field5);
}
