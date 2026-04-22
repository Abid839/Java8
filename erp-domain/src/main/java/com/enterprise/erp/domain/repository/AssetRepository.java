package com.enterprise.erp.domain.repository;

import com.enterprise.erp.domain.entity.Asset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssetRepository extends JpaRepository<Asset, Long> {
    List<Asset> findByField1(String field1);
    List<Asset> findByField2(String field2);
    List<Asset> findByField3(String field3);
    List<Asset> findByField4(String field4);
    List<Asset> findByField5(String field5);
}
