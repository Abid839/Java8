package com.enterprise.erp.web.controller;

import com.enterprise.erp.domain.entity.Expense;
import com.enterprise.erp.core.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {

    private final ExpenseService expenseService;

    @Autowired
    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @PostMapping
    public org.springframework.http.ResponseEntity<Expense> create(@RequestBody Expense entity) {
        return org.springframework.http.ResponseEntity.ok(expenseService.create(entity));
    }

    @GetMapping
    public org.springframework.http.ResponseEntity<List<Expense>> getAll() {
        return org.springframework.http.ResponseEntity.ok(expenseService.findAll());
    }

    @org.springframework.web.bind.annotation.PostMapping("/1")
    public org.springframework.http.ResponseEntity<Expense> processEndpoint1(@org.springframework.web.bind.annotation.RequestBody Expense entity) {
        return org.springframework.http.ResponseEntity.ok(expenseService.processBusinessLogic1(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/2")
    public org.springframework.http.ResponseEntity<Expense> processEndpoint2(@org.springframework.web.bind.annotation.RequestBody Expense entity) {
        return org.springframework.http.ResponseEntity.ok(expenseService.processBusinessLogic2(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/3")
    public org.springframework.http.ResponseEntity<Expense> processEndpoint3(@org.springframework.web.bind.annotation.RequestBody Expense entity) {
        return org.springframework.http.ResponseEntity.ok(expenseService.processBusinessLogic3(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/4")
    public org.springframework.http.ResponseEntity<Expense> processEndpoint4(@org.springframework.web.bind.annotation.RequestBody Expense entity) {
        return org.springframework.http.ResponseEntity.ok(expenseService.processBusinessLogic4(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/5")
    public org.springframework.http.ResponseEntity<Expense> processEndpoint5(@org.springframework.web.bind.annotation.RequestBody Expense entity) {
        return org.springframework.http.ResponseEntity.ok(expenseService.processBusinessLogic5(entity));
    }

}
