package com.enterprise.erp.domain.repository;

import com.enterprise.erp.domain.entity.Opportunity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OpportunityRepository extends JpaRepository<Opportunity, Long> {
    List<Opportunity> findByField1(String field1);
    List<Opportunity> findByField2(String field2);
    List<Opportunity> findByField3(String field3);
    List<Opportunity> findByField4(String field4);
    List<Opportunity> findByField5(String field5);
}
