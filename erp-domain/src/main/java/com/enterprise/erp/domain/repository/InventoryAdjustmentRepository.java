package com.enterprise.erp.domain.repository;
import com.enterprise.erp.domain.entity.InventoryAdjustment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface InventoryAdjustmentRepository extends JpaRepository<InventoryAdjustment, Long> {
    List<InventoryAdjustment> findByField1(String field1);
    List<InventoryAdjustment> findByField2(String field2);
}
