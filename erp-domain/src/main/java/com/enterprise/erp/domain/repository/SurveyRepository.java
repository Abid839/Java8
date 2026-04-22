package com.enterprise.erp.domain.repository;

import com.enterprise.erp.domain.entity.Survey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SurveyRepository extends JpaRepository<Survey, Long> {
    List<Survey> findByField1(String field1);
    List<Survey> findByField2(String field2);
    List<Survey> findByField3(String field3);
    List<Survey> findByField4(String field4);
    List<Survey> findByField5(String field5);
}
