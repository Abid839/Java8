package com.enterprise.erp.web.controller;
import com.enterprise.erp.domain.entity.SupplierInvoice;
import com.enterprise.erp.core.service.SupplierInvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/supplierinvoices")
public class SupplierInvoiceController {
    private final SupplierInvoiceService supplierinvoiceService;
    @Autowired
    public SupplierInvoiceController(SupplierInvoiceService supplierinvoiceService) {
        this.supplierinvoiceService = supplierinvoiceService;
    }
    @PostMapping
    public org.springframework.http.ResponseEntity<SupplierInvoice> create(@RequestBody SupplierInvoice entity) {
        return org.springframework.http.ResponseEntity.ok(supplierinvoiceService.create(entity));
    }
    @GetMapping
    public org.springframework.http.ResponseEntity<List<SupplierInvoice>> getAll() {
        return org.springframework.http.ResponseEntity.ok(supplierinvoiceService.findAll());
    }

    @org.springframework.web.bind.annotation.PostMapping("/1")
    public org.springframework.http.ResponseEntity<SupplierInvoice> processEndpoint1(@org.springframework.web.bind.annotation.RequestBody SupplierInvoice entity) {
        return org.springframework.http.ResponseEntity.ok(supplierinvoiceService.processBusinessLogic1(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/2")
    public org.springframework.http.ResponseEntity<SupplierInvoice> processEndpoint2(@org.springframework.web.bind.annotation.RequestBody SupplierInvoice entity) {
        return org.springframework.http.ResponseEntity.ok(supplierinvoiceService.processBusinessLogic2(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/3")
    public org.springframework.http.ResponseEntity<SupplierInvoice> processEndpoint3(@org.springframework.web.bind.annotation.RequestBody SupplierInvoice entity) {
        return org.springframework.http.ResponseEntity.ok(supplierinvoiceService.processBusinessLogic3(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/4")
    public org.springframework.http.ResponseEntity<SupplierInvoice> processEndpoint4(@org.springframework.web.bind.annotation.RequestBody SupplierInvoice entity) {
        return org.springframework.http.ResponseEntity.ok(supplierinvoiceService.processBusinessLogic4(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/5")
    public org.springframework.http.ResponseEntity<SupplierInvoice> processEndpoint5(@org.springframework.web.bind.annotation.RequestBody SupplierInvoice entity) {
        return org.springframework.http.ResponseEntity.ok(supplierinvoiceService.processBusinessLogic5(entity));
    }

}
