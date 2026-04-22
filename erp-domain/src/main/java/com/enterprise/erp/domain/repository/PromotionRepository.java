package com.enterprise.erp.domain.repository;
import com.enterprise.erp.domain.entity.Promotion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface PromotionRepository extends JpaRepository<Promotion, Long> {
    List<Promotion> findByField1(String field1);
    List<Promotion> findByField2(String field2);
}
