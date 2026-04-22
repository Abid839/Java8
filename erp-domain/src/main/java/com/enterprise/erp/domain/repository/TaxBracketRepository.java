package com.enterprise.erp.domain.repository;
import com.enterprise.erp.domain.entity.TaxBracket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface TaxBracketRepository extends JpaRepository<TaxBracket, Long> {
    List<TaxBracket> findByField1(String field1);
    List<TaxBracket> findByField2(String field2);
}
