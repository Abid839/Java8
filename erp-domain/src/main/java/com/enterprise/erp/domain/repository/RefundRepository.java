package com.enterprise.erp.domain.repository;
import com.enterprise.erp.domain.entity.Refund;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface RefundRepository extends JpaRepository<Refund, Long> {
    List<Refund> findByField1(String field1);
    List<Refund> findByField2(String field2);
}
