package com.enterprise.erp.web.controller;

import com.enterprise.erp.domain.entity.Sales;
import com.enterprise.erp.core.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/saless")
public class SalesController {

    private final SalesService salesService;

    @Autowired
    public SalesController(SalesService salesService) {
        this.salesService = salesService;
    }

    @PostMapping
    public org.springframework.http.ResponseEntity<Sales> create(@RequestBody Sales entity) {
        return org.springframework.http.ResponseEntity.ok(salesService.create(entity));
    }

    @GetMapping
    public org.springframework.http.ResponseEntity<List<Sales>> getAll() {
        return org.springframework.http.ResponseEntity.ok(salesService.findAll());
    }

    @org.springframework.web.bind.annotation.PostMapping("/1")
    public org.springframework.http.ResponseEntity<Sales> processEndpoint1(@org.springframework.web.bind.annotation.RequestBody Sales entity) {
        return org.springframework.http.ResponseEntity.ok(salesService.processBusinessLogic1(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/2")
    public org.springframework.http.ResponseEntity<Sales> processEndpoint2(@org.springframework.web.bind.annotation.RequestBody Sales entity) {
        return org.springframework.http.ResponseEntity.ok(salesService.processBusinessLogic2(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/3")
    public org.springframework.http.ResponseEntity<Sales> processEndpoint3(@org.springframework.web.bind.annotation.RequestBody Sales entity) {
        return org.springframework.http.ResponseEntity.ok(salesService.processBusinessLogic3(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/4")
    public org.springframework.http.ResponseEntity<Sales> processEndpoint4(@org.springframework.web.bind.annotation.RequestBody Sales entity) {
        return org.springframework.http.ResponseEntity.ok(salesService.processBusinessLogic4(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/5")
    public org.springframework.http.ResponseEntity<Sales> processEndpoint5(@org.springframework.web.bind.annotation.RequestBody Sales entity) {
        return org.springframework.http.ResponseEntity.ok(salesService.processBusinessLogic5(entity));
    }

}
