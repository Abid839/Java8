package com.enterprise.erp.domain.repository;
import com.enterprise.erp.domain.entity.Depreciation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface DepreciationRepository extends JpaRepository<Depreciation, Long> {
    List<Depreciation> findByField1(String field1);
    List<Depreciation> findByField2(String field2);
}
