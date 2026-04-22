package com.enterprise.erp.web.controller;

import com.enterprise.erp.domain.entity.Benefits;
import com.enterprise.erp.core.service.BenefitsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/benefitss")
public class BenefitsController {

    private final BenefitsService benefitsService;

    @Autowired
    public BenefitsController(BenefitsService benefitsService) {
        this.benefitsService = benefitsService;
    }

    @PostMapping
    public org.springframework.http.ResponseEntity<Benefits> create(@RequestBody Benefits entity) {
        return org.springframework.http.ResponseEntity.ok(benefitsService.create(entity));
    }

    @GetMapping
    public org.springframework.http.ResponseEntity<List<Benefits>> getAll() {
        return org.springframework.http.ResponseEntity.ok(benefitsService.findAll());
    }

    @org.springframework.web.bind.annotation.PostMapping("/1")
    public org.springframework.http.ResponseEntity<Benefits> processEndpoint1(@org.springframework.web.bind.annotation.RequestBody Benefits entity) {
        return org.springframework.http.ResponseEntity.ok(benefitsService.processBusinessLogic1(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/2")
    public org.springframework.http.ResponseEntity<Benefits> processEndpoint2(@org.springframework.web.bind.annotation.RequestBody Benefits entity) {
        return org.springframework.http.ResponseEntity.ok(benefitsService.processBusinessLogic2(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/3")
    public org.springframework.http.ResponseEntity<Benefits> processEndpoint3(@org.springframework.web.bind.annotation.RequestBody Benefits entity) {
        return org.springframework.http.ResponseEntity.ok(benefitsService.processBusinessLogic3(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/4")
    public org.springframework.http.ResponseEntity<Benefits> processEndpoint4(@org.springframework.web.bind.annotation.RequestBody Benefits entity) {
        return org.springframework.http.ResponseEntity.ok(benefitsService.processBusinessLogic4(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/5")
    public org.springframework.http.ResponseEntity<Benefits> processEndpoint5(@org.springframework.web.bind.annotation.RequestBody Benefits entity) {
        return org.springframework.http.ResponseEntity.ok(benefitsService.processBusinessLogic5(entity));
    }

}
