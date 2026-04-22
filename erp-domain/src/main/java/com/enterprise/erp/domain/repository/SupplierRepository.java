package com.enterprise.erp.domain.repository;

import com.enterprise.erp.domain.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {
    List<Supplier> findByField1(String field1);
    List<Supplier> findByField2(String field2);
    List<Supplier> findByField3(String field3);
    List<Supplier> findByField4(String field4);
    List<Supplier> findByField5(String field5);
}
