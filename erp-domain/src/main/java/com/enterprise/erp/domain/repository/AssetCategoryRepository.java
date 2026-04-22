package com.enterprise.erp.domain.repository;
import com.enterprise.erp.domain.entity.AssetCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface AssetCategoryRepository extends JpaRepository<AssetCategory, Long> {
    List<AssetCategory> findByField1(String field1);
    List<AssetCategory> findByField2(String field2);
}
