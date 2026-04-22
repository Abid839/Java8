package com.enterprise.erp.domain.repository;
import com.enterprise.erp.domain.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {
    List<Location> findByField1(String field1);
    List<Location> findByField2(String field2);
}
