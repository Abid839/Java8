package com.enterprise.erp.domain.repository;

import com.enterprise.erp.domain.entity.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WarehouseRepository extends JpaRepository<Warehouse, Long> {
    List<Warehouse> findByField1(String field1);
    List<Warehouse> findByField2(String field2);
    List<Warehouse> findByField3(String field3);
    List<Warehouse> findByField4(String field4);
    List<Warehouse> findByField5(String field5);
}
