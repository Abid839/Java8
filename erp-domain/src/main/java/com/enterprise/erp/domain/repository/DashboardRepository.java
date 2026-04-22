package com.enterprise.erp.domain.repository;

import com.enterprise.erp.domain.entity.Dashboard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DashboardRepository extends JpaRepository<Dashboard, Long> {
    List<Dashboard> findByField1(String field1);
    List<Dashboard> findByField2(String field2);
    List<Dashboard> findByField3(String field3);
    List<Dashboard> findByField4(String field4);
    List<Dashboard> findByField5(String field5);
}
