package com.enterprise.erp.domain.repository;
import com.enterprise.erp.domain.entity.Discount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface DiscountRepository extends JpaRepository<Discount, Long> {
    List<Discount> findByField1(String field1);
    List<Discount> findByField2(String field2);
}
