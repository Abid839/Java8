package com.enterprise.erp.web.controller;
import com.enterprise.erp.domain.entity.Transaction;
import com.enterprise.erp.core.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/transactions")
public class TransactionController {
    private final TransactionService transactionService;
    @Autowired
    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }
    @PostMapping
    public org.springframework.http.ResponseEntity<Transaction> create(@RequestBody Transaction entity) {
        return org.springframework.http.ResponseEntity.ok(transactionService.create(entity));
    }
    @GetMapping
    public org.springframework.http.ResponseEntity<List<Transaction>> getAll() {
        return org.springframework.http.ResponseEntity.ok(transactionService.findAll());
    }

    @org.springframework.web.bind.annotation.PostMapping("/1")
    public org.springframework.http.ResponseEntity<Transaction> processEndpoint1(@org.springframework.web.bind.annotation.RequestBody Transaction entity) {
        return org.springframework.http.ResponseEntity.ok(transactionService.processBusinessLogic1(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/2")
    public org.springframework.http.ResponseEntity<Transaction> processEndpoint2(@org.springframework.web.bind.annotation.RequestBody Transaction entity) {
        return org.springframework.http.ResponseEntity.ok(transactionService.processBusinessLogic2(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/3")
    public org.springframework.http.ResponseEntity<Transaction> processEndpoint3(@org.springframework.web.bind.annotation.RequestBody Transaction entity) {
        return org.springframework.http.ResponseEntity.ok(transactionService.processBusinessLogic3(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/4")
    public org.springframework.http.ResponseEntity<Transaction> processEndpoint4(@org.springframework.web.bind.annotation.RequestBody Transaction entity) {
        return org.springframework.http.ResponseEntity.ok(transactionService.processBusinessLogic4(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/5")
    public org.springframework.http.ResponseEntity<Transaction> processEndpoint5(@org.springframework.web.bind.annotation.RequestBody Transaction entity) {
        return org.springframework.http.ResponseEntity.ok(transactionService.processBusinessLogic5(entity));
    }

}
