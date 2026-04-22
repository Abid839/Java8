package com.enterprise.erp.domain.repository;

import com.enterprise.erp.domain.entity.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReportRepository extends JpaRepository<Report, Long> {
    List<Report> findByField1(String field1);
    List<Report> findByField2(String field2);
    List<Report> findByField3(String field3);
    List<Report> findByField4(String field4);
    List<Report> findByField5(String field5);
}
