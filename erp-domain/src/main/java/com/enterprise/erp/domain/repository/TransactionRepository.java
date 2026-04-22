package com.enterprise.erp.domain.repository;
import com.enterprise.erp.domain.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByField1(String field1);
    List<Transaction> findByField2(String field2);
}
