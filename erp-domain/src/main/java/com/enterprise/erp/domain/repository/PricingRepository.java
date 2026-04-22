package com.enterprise.erp.domain.repository;
import com.enterprise.erp.domain.entity.Pricing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface PricingRepository extends JpaRepository<Pricing, Long> {
    List<Pricing> findByField1(String field1);
    List<Pricing> findByField2(String field2);
}
