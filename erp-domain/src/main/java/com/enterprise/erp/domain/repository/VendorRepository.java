package com.enterprise.erp.domain.repository;

import com.enterprise.erp.domain.entity.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VendorRepository extends JpaRepository<Vendor, Long> {
    List<Vendor> findByField1(String field1);
    List<Vendor> findByField2(String field2);
    List<Vendor> findByField3(String field3);
    List<Vendor> findByField4(String field4);
    List<Vendor> findByField5(String field5);
}
