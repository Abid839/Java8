package com.enterprise.erp.domain.repository;
import com.enterprise.erp.domain.entity.Return;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface ReturnRepository extends JpaRepository<Return, Long> {
    List<Return> findByField1(String field1);
    List<Return> findByField2(String field2);
}
