package com.enterprise.erp.domain.repository;

import com.enterprise.erp.domain.entity.Contract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContractRepository extends JpaRepository<Contract, Long> {
    List<Contract> findByField1(String field1);
    List<Contract> findByField2(String field2);
    List<Contract> findByField3(String field3);
    List<Contract> findByField4(String field4);
    List<Contract> findByField5(String field5);
}
