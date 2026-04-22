package com.enterprise.erp.domain.repository;
import com.enterprise.erp.domain.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface RegionRepository extends JpaRepository<Region, Long> {
    List<Region> findByField1(String field1);
    List<Region> findByField2(String field2);
}
