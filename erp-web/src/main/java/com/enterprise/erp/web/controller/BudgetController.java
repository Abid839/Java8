package com.enterprise.erp.web.controller;

import com.enterprise.erp.domain.entity.Budget;
import com.enterprise.erp.core.service.BudgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/budgets")
public class BudgetController {

    private final BudgetService budgetService;

    @Autowired
    public BudgetController(BudgetService budgetService) {
        this.budgetService = budgetService;
    }

    @PostMapping
    public org.springframework.http.ResponseEntity<Budget> create(@RequestBody Budget entity) {
        return org.springframework.http.ResponseEntity.ok(budgetService.create(entity));
    }

    @GetMapping
    public org.springframework.http.ResponseEntity<List<Budget>> getAll() {
        return org.springframework.http.ResponseEntity.ok(budgetService.findAll());
    }

    @org.springframework.web.bind.annotation.PostMapping("/1")
    public org.springframework.http.ResponseEntity<Budget> processEndpoint1(@org.springframework.web.bind.annotation.RequestBody Budget entity) {
        return org.springframework.http.ResponseEntity.ok(budgetService.processBusinessLogic1(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/2")
    public org.springframework.http.ResponseEntity<Budget> processEndpoint2(@org.springframework.web.bind.annotation.RequestBody Budget entity) {
        return org.springframework.http.ResponseEntity.ok(budgetService.processBusinessLogic2(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/3")
    public org.springframework.http.ResponseEntity<Budget> processEndpoint3(@org.springframework.web.bind.annotation.RequestBody Budget entity) {
        return org.springframework.http.ResponseEntity.ok(budgetService.processBusinessLogic3(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/4")
    public org.springframework.http.ResponseEntity<Budget> processEndpoint4(@org.springframework.web.bind.annotation.RequestBody Budget entity) {
        return org.springframework.http.ResponseEntity.ok(budgetService.processBusinessLogic4(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/5")
    public org.springframework.http.ResponseEntity<Budget> processEndpoint5(@org.springframework.web.bind.annotation.RequestBody Budget entity) {
        return org.springframework.http.ResponseEntity.ok(budgetService.processBusinessLogic5(entity));
    }

}
