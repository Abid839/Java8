package com.enterprise.erp.web.controller;

import com.enterprise.erp.domain.entity.Tax;
import com.enterprise.erp.core.service.TaxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/taxs")
public class TaxController {

    private final TaxService taxService;

    @Autowired
    public TaxController(TaxService taxService) {
        this.taxService = taxService;
    }

    @PostMapping
    public org.springframework.http.ResponseEntity<Tax> create(@RequestBody Tax entity) {
        return org.springframework.http.ResponseEntity.ok(taxService.create(entity));
    }

    @GetMapping
    public org.springframework.http.ResponseEntity<List<Tax>> getAll() {
        return org.springframework.http.ResponseEntity.ok(taxService.findAll());
    }

    @org.springframework.web.bind.annotation.PostMapping("/1")
    public org.springframework.http.ResponseEntity<Tax> processEndpoint1(@org.springframework.web.bind.annotation.RequestBody Tax entity) {
        return org.springframework.http.ResponseEntity.ok(taxService.processBusinessLogic1(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/2")
    public org.springframework.http.ResponseEntity<Tax> processEndpoint2(@org.springframework.web.bind.annotation.RequestBody Tax entity) {
        return org.springframework.http.ResponseEntity.ok(taxService.processBusinessLogic2(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/3")
    public org.springframework.http.ResponseEntity<Tax> processEndpoint3(@org.springframework.web.bind.annotation.RequestBody Tax entity) {
        return org.springframework.http.ResponseEntity.ok(taxService.processBusinessLogic3(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/4")
    public org.springframework.http.ResponseEntity<Tax> processEndpoint4(@org.springframework.web.bind.annotation.RequestBody Tax entity) {
        return org.springframework.http.ResponseEntity.ok(taxService.processBusinessLogic4(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/5")
    public org.springframework.http.ResponseEntity<Tax> processEndpoint5(@org.springframework.web.bind.annotation.RequestBody Tax entity) {
        return org.springframework.http.ResponseEntity.ok(taxService.processBusinessLogic5(entity));
    }

}
