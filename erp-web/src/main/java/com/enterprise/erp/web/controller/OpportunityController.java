package com.enterprise.erp.web.controller;

import com.enterprise.erp.domain.entity.Opportunity;
import com.enterprise.erp.core.service.OpportunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/opportunitys")
public class OpportunityController {

    private final OpportunityService opportunityService;

    @Autowired
    public OpportunityController(OpportunityService opportunityService) {
        this.opportunityService = opportunityService;
    }

    @PostMapping
    public org.springframework.http.ResponseEntity<Opportunity> create(@RequestBody Opportunity entity) {
        return org.springframework.http.ResponseEntity.ok(opportunityService.create(entity));
    }

    @GetMapping
    public org.springframework.http.ResponseEntity<List<Opportunity>> getAll() {
        return org.springframework.http.ResponseEntity.ok(opportunityService.findAll());
    }

    @org.springframework.web.bind.annotation.PostMapping("/1")
    public org.springframework.http.ResponseEntity<Opportunity> processEndpoint1(@org.springframework.web.bind.annotation.RequestBody Opportunity entity) {
        return org.springframework.http.ResponseEntity.ok(opportunityService.processBusinessLogic1(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/2")
    public org.springframework.http.ResponseEntity<Opportunity> processEndpoint2(@org.springframework.web.bind.annotation.RequestBody Opportunity entity) {
        return org.springframework.http.ResponseEntity.ok(opportunityService.processBusinessLogic2(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/3")
    public org.springframework.http.ResponseEntity<Opportunity> processEndpoint3(@org.springframework.web.bind.annotation.RequestBody Opportunity entity) {
        return org.springframework.http.ResponseEntity.ok(opportunityService.processBusinessLogic3(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/4")
    public org.springframework.http.ResponseEntity<Opportunity> processEndpoint4(@org.springframework.web.bind.annotation.RequestBody Opportunity entity) {
        return org.springframework.http.ResponseEntity.ok(opportunityService.processBusinessLogic4(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/5")
    public org.springframework.http.ResponseEntity<Opportunity> processEndpoint5(@org.springframework.web.bind.annotation.RequestBody Opportunity entity) {
        return org.springframework.http.ResponseEntity.ok(opportunityService.processBusinessLogic5(entity));
    }

}
