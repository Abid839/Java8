package com.enterprise.erp.web.controller;

import com.enterprise.erp.domain.entity.Supplier;
import com.enterprise.erp.core.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/suppliers")
public class SupplierController {

    private final SupplierService supplierService;

    @Autowired
    public SupplierController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    @PostMapping
    public org.springframework.http.ResponseEntity<Supplier> create(@RequestBody Supplier entity) {
        return org.springframework.http.ResponseEntity.ok(supplierService.create(entity));
    }

    @GetMapping
    public org.springframework.http.ResponseEntity<List<Supplier>> getAll() {
        return org.springframework.http.ResponseEntity.ok(supplierService.findAll());
    }

    @org.springframework.web.bind.annotation.PostMapping("/1")
    public org.springframework.http.ResponseEntity<Supplier> processEndpoint1(@org.springframework.web.bind.annotation.RequestBody Supplier entity) {
        return org.springframework.http.ResponseEntity.ok(supplierService.processBusinessLogic1(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/2")
    public org.springframework.http.ResponseEntity<Supplier> processEndpoint2(@org.springframework.web.bind.annotation.RequestBody Supplier entity) {
        return org.springframework.http.ResponseEntity.ok(supplierService.processBusinessLogic2(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/3")
    public org.springframework.http.ResponseEntity<Supplier> processEndpoint3(@org.springframework.web.bind.annotation.RequestBody Supplier entity) {
        return org.springframework.http.ResponseEntity.ok(supplierService.processBusinessLogic3(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/4")
    public org.springframework.http.ResponseEntity<Supplier> processEndpoint4(@org.springframework.web.bind.annotation.RequestBody Supplier entity) {
        return org.springframework.http.ResponseEntity.ok(supplierService.processBusinessLogic4(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/5")
    public org.springframework.http.ResponseEntity<Supplier> processEndpoint5(@org.springframework.web.bind.annotation.RequestBody Supplier entity) {
        return org.springframework.http.ResponseEntity.ok(supplierService.processBusinessLogic5(entity));
    }

}
