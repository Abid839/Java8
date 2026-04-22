package com.enterprise.erp.domain.repository;

import com.enterprise.erp.domain.entity.Forecasting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ForecastingRepository extends JpaRepository<Forecasting, Long> {
    List<Forecasting> findByField1(String field1);
    List<Forecasting> findByField2(String field2);
    List<Forecasting> findByField3(String field3);
    List<Forecasting> findByField4(String field4);
    List<Forecasting> findByField5(String field5);
}
