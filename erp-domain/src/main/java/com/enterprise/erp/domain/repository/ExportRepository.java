package com.enterprise.erp.domain.repository;

import com.enterprise.erp.domain.entity.Export;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExportRepository extends JpaRepository<Export, Long> {
    List<Export> findByField1(String field1);
    List<Export> findByField2(String field2);
    List<Export> findByField3(String field3);
    List<Export> findByField4(String field4);
    List<Export> findByField5(String field5);
}
