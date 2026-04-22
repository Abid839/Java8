package com.enterprise.erp.domain.repository;
import com.enterprise.erp.domain.entity.Requisition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface RequisitionRepository extends JpaRepository<Requisition, Long> {
    List<Requisition> findByField1(String field1);
    List<Requisition> findByField2(String field2);
}
