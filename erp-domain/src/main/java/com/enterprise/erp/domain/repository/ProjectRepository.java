package com.enterprise.erp.domain.repository;

import com.enterprise.erp.domain.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
    List<Project> findByField1(String field1);
    List<Project> findByField2(String field2);
    List<Project> findByField3(String field3);
    List<Project> findByField4(String field4);
    List<Project> findByField5(String field5);
}
