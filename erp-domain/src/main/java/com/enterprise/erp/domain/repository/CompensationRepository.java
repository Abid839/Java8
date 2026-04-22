package com.enterprise.erp.domain.repository;

import com.enterprise.erp.domain.entity.Compensation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompensationRepository extends JpaRepository<Compensation, Long> {
    List<Compensation> findByField1(String field1);
    List<Compensation> findByField2(String field2);
    List<Compensation> findByField3(String field3);
    List<Compensation> findByField4(String field4);
    List<Compensation> findByField5(String field5);
}
