package com.enterprise.erp.domain.repository;
import com.enterprise.erp.domain.entity.Currency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface CurrencyRepository extends JpaRepository<Currency, Long> {
    List<Currency> findByField1(String field1);
    List<Currency> findByField2(String field2);
}
