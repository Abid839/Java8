package com.enterprise.erp.domain.repository;

import com.enterprise.erp.domain.entity.Leave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LeaveRepository extends JpaRepository<Leave, Long> {
    List<Leave> findByField1(String field1);
    List<Leave> findByField2(String field2);
    List<Leave> findByField3(String field3);
    List<Leave> findByField4(String field4);
    List<Leave> findByField5(String field5);
}
