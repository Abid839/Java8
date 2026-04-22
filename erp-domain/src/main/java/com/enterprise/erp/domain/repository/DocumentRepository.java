package com.enterprise.erp.domain.repository;

import com.enterprise.erp.domain.entity.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Long> {
    List<Document> findByField1(String field1);
    List<Document> findByField2(String field2);
    List<Document> findByField3(String field3);
    List<Document> findByField4(String field4);
    List<Document> findByField5(String field5);
}
