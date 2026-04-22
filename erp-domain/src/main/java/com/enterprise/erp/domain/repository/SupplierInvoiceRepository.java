package com.enterprise.erp.domain.repository;
import com.enterprise.erp.domain.entity.SupplierInvoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface SupplierInvoiceRepository extends JpaRepository<SupplierInvoice, Long> {
    List<SupplierInvoice> findByField1(String field1);
    List<SupplierInvoice> findByField2(String field2);
}
