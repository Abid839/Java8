package com.enterprise.erp.domain.repository;

import com.enterprise.erp.domain.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
    List<Ticket> findByField1(String field1);
    List<Ticket> findByField2(String field2);
    List<Ticket> findByField3(String field3);
    List<Ticket> findByField4(String field4);
    List<Ticket> findByField5(String field5);
}
