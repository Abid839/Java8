package com.enterprise.erp.web.controller;

import com.enterprise.erp.domain.entity.Vendor;
import com.enterprise.erp.core.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vendors")
public class VendorController {

    private final VendorService vendorService;

    @Autowired
    public VendorController(VendorService vendorService) {
        this.vendorService = vendorService;
    }

    @PostMapping
    public org.springframework.http.ResponseEntity<Vendor> create(@RequestBody Vendor entity) {
        return org.springframework.http.ResponseEntity.ok(vendorService.create(entity));
    }

    @GetMapping
    public org.springframework.http.ResponseEntity<List<Vendor>> getAll() {
        return org.springframework.http.ResponseEntity.ok(vendorService.findAll());
    }

    @org.springframework.web.bind.annotation.PostMapping("/1")
    public org.springframework.http.ResponseEntity<Vendor> processEndpoint1(@org.springframework.web.bind.annotation.RequestBody Vendor entity) {
        return org.springframework.http.ResponseEntity.ok(vendorService.processBusinessLogic1(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/2")
    public org.springframework.http.ResponseEntity<Vendor> processEndpoint2(@org.springframework.web.bind.annotation.RequestBody Vendor entity) {
        return org.springframework.http.ResponseEntity.ok(vendorService.processBusinessLogic2(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/3")
    public org.springframework.http.ResponseEntity<Vendor> processEndpoint3(@org.springframework.web.bind.annotation.RequestBody Vendor entity) {
        return org.springframework.http.ResponseEntity.ok(vendorService.processBusinessLogic3(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/4")
    public org.springframework.http.ResponseEntity<Vendor> processEndpoint4(@org.springframework.web.bind.annotation.RequestBody Vendor entity) {
        return org.springframework.http.ResponseEntity.ok(vendorService.processBusinessLogic4(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/5")
    public org.springframework.http.ResponseEntity<Vendor> processEndpoint5(@org.springframework.web.bind.annotation.RequestBody Vendor entity) {
        return org.springframework.http.ResponseEntity.ok(vendorService.processBusinessLogic5(entity));
    }

}
