package com.enterprise.erp.domain.repository;

import com.enterprise.erp.domain.entity.Campaign;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CampaignRepository extends JpaRepository<Campaign, Long> {
    List<Campaign> findByField1(String field1);
    List<Campaign> findByField2(String field2);
    List<Campaign> findByField3(String field3);
    List<Campaign> findByField4(String field4);
    List<Campaign> findByField5(String field5);
}
