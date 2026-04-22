package com.enterprise.erp.domain.repository;
import com.enterprise.erp.domain.entity.ExchangeRate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface ExchangeRateRepository extends JpaRepository<ExchangeRate, Long> {
    List<ExchangeRate> findByField1(String field1);
    List<ExchangeRate> findByField2(String field2);
}
