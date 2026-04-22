package com.enterprise.erp.domain.repository;

import com.enterprise.erp.domain.entity.Maintenance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MaintenanceRepository extends JpaRepository<Maintenance, Long> {
    List<Maintenance> findByField1(String field1);
    List<Maintenance> findByField2(String field2);
    List<Maintenance> findByField3(String field3);
    List<Maintenance> findByField4(String field4);
    List<Maintenance> findByField5(String field5);
}
