package com.enterprise.erp.domain.repository;

import com.enterprise.erp.domain.entity.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
    List<Feedback> findByField1(String field1);
    List<Feedback> findByField2(String field2);
    List<Feedback> findByField3(String field3);
    List<Feedback> findByField4(String field4);
    List<Feedback> findByField5(String field5);
}
