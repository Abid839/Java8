package com.enterprise.erp.domain.repository;
import com.enterprise.erp.domain.entity.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder, Long> {
    List<PurchaseOrder> findByField1(String field1);
    List<PurchaseOrder> findByField2(String field2);
}
