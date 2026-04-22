package com.enterprise.erp.domain.repository;

import com.enterprise.erp.domain.entity.Risk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RiskRepository extends JpaRepository<Risk, Long> {
    List<Risk> findByField1(String field1);
    List<Risk> findByField2(String field2);
    List<Risk> findByField3(String field3);
    List<Risk> findByField4(String field4);
    List<Risk> findByField5(String field5);
}
