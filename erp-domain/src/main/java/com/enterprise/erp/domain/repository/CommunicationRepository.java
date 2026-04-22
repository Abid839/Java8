package com.enterprise.erp.domain.repository;

import com.enterprise.erp.domain.entity.Communication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommunicationRepository extends JpaRepository<Communication, Long> {
    List<Communication> findByField1(String field1);
    List<Communication> findByField2(String field2);
    List<Communication> findByField3(String field3);
    List<Communication> findByField4(String field4);
    List<Communication> findByField5(String field5);
}
