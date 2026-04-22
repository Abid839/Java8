package com.enterprise.erp.domain.repository;

import com.enterprise.erp.domain.entity.Fleet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FleetRepository extends JpaRepository<Fleet, Long> {
    List<Fleet> findByField1(String field1);
    List<Fleet> findByField2(String field2);
    List<Fleet> findByField3(String field3);
    List<Fleet> findByField4(String field4);
    List<Fleet> findByField5(String field5);
}
