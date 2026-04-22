package com.enterprise.erp.domain.repository;

import com.enterprise.erp.domain.entity.Quote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuoteRepository extends JpaRepository<Quote, Long> {
    List<Quote> findByField1(String field1);
    List<Quote> findByField2(String field2);
    List<Quote> findByField3(String field3);
    List<Quote> findByField4(String field4);
    List<Quote> findByField5(String field5);
}
