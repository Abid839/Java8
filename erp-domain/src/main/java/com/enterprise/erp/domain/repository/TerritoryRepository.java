package com.enterprise.erp.domain.repository;
import com.enterprise.erp.domain.entity.Territory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface TerritoryRepository extends JpaRepository<Territory, Long> {
    List<Territory> findByField1(String field1);
    List<Territory> findByField2(String field2);
}
