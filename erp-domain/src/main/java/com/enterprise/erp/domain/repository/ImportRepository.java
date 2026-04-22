package com.enterprise.erp.domain.repository;

import com.enterprise.erp.domain.entity.Import;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImportRepository extends JpaRepository<Import, Long> {
    List<Import> findByField1(String field1);
    List<Import> findByField2(String field2);
    List<Import> findByField3(String field3);
    List<Import> findByField4(String field4);
    List<Import> findByField5(String field5);
}
