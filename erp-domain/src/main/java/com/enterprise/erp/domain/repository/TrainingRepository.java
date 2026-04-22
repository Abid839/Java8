package com.enterprise.erp.domain.repository;

import com.enterprise.erp.domain.entity.Training;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrainingRepository extends JpaRepository<Training, Long> {
    List<Training> findByField1(String field1);
    List<Training> findByField2(String field2);
    List<Training> findByField3(String field3);
    List<Training> findByField4(String field4);
    List<Training> findByField5(String field5);
}
