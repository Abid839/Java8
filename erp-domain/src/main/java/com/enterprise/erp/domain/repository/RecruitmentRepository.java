package com.enterprise.erp.domain.repository;

import com.enterprise.erp.domain.entity.Recruitment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecruitmentRepository extends JpaRepository<Recruitment, Long> {
    List<Recruitment> findByField1(String field1);
    List<Recruitment> findByField2(String field2);
    List<Recruitment> findByField3(String field3);
    List<Recruitment> findByField4(String field4);
    List<Recruitment> findByField5(String field5);
}
