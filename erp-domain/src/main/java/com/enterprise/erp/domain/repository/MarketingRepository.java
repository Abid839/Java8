package com.enterprise.erp.domain.repository;

import com.enterprise.erp.domain.entity.Marketing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MarketingRepository extends JpaRepository<Marketing, Long> {
    List<Marketing> findByField1(String field1);
    List<Marketing> findByField2(String field2);
    List<Marketing> findByField3(String field3);
    List<Marketing> findByField4(String field4);
    List<Marketing> findByField5(String field5);
}
