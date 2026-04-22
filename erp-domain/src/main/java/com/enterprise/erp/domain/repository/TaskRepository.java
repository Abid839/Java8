package com.enterprise.erp.domain.repository;

import com.enterprise.erp.domain.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByField1(String field1);
    List<Task> findByField2(String field2);
    List<Task> findByField3(String field3);
    List<Task> findByField4(String field4);
    List<Task> findByField5(String field5);
}
