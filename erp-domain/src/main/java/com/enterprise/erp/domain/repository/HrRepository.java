package com.enterprise.erp.domain.repository;

import com.enterprise.erp.domain.entity.Hr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HrRepository extends JpaRepository<Hr, Long> {
    List<Hr> findByField1(String field1);
    List<Hr> findByField2(String field2);
    List<Hr> findByField3(String field3);
    List<Hr> findByField4(String field4);
    List<Hr> findByField5(String field5);
}
