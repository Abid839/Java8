package com.enterprise.erp.domain.repository;

import com.enterprise.erp.domain.entity.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {
    List<Subscription> findByField1(String field1);
    List<Subscription> findByField2(String field2);
    List<Subscription> findByField3(String field3);
    List<Subscription> findByField4(String field4);
    List<Subscription> findByField5(String field5);
}
