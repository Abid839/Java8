package com.enterprise.erp.domain.repository;

import com.enterprise.erp.domain.entity.Quality;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QualityRepository extends JpaRepository<Quality, Long> {
    List<Quality> findByField1(String field1);
    List<Quality> findByField2(String field2);
    List<Quality> findByField3(String field3);
    List<Quality> findByField4(String field4);
    List<Quality> findByField5(String field5);
}
