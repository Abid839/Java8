package com.enterprise.erp.domain.repository;
import com.enterprise.erp.domain.entity.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface WalletRepository extends JpaRepository<Wallet, Long> {
    List<Wallet> findByField1(String field1);
    List<Wallet> findByField2(String field2);
}
