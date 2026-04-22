package com.enterprise.erp.domain.repository;
import com.enterprise.erp.domain.entity.Shipping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface ShippingRepository extends JpaRepository<Shipping, Long> {
    List<Shipping> findByField1(String field1);
    List<Shipping> findByField2(String field2);
}
