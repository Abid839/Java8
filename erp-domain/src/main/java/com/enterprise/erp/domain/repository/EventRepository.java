package com.enterprise.erp.domain.repository;

import com.enterprise.erp.domain.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
    List<Event> findByField1(String field1);
    List<Event> findByField2(String field2);
    List<Event> findByField3(String field3);
    List<Event> findByField4(String field4);
    List<Event> findByField5(String field5);
}
