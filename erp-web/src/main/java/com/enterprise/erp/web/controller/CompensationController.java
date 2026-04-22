package com.enterprise.erp.web.controller;

import com.enterprise.erp.domain.entity.Compensation;
import com.enterprise.erp.core.service.CompensationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/compensations")
public class CompensationController {

    private final CompensationService compensationService;

    @Autowired
    public CompensationController(CompensationService compensationService) {
        this.compensationService = compensationService;
    }

    @PostMapping
    public org.springframework.http.ResponseEntity<Compensation> create(@RequestBody Compensation entity) {
        return org.springframework.http.ResponseEntity.ok(compensationService.create(entity));
    }

    @GetMapping
    public org.springframework.http.ResponseEntity<List<Compensation>> getAll() {
        return org.springframework.http.ResponseEntity.ok(compensationService.findAll());
    }

    @org.springframework.web.bind.annotation.PostMapping("/1")
    public org.springframework.http.ResponseEntity<Compensation> processEndpoint1(@org.springframework.web.bind.annotation.RequestBody Compensation entity) {
        return org.springframework.http.ResponseEntity.ok(compensationService.processBusinessLogic1(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/2")
    public org.springframework.http.ResponseEntity<Compensation> processEndpoint2(@org.springframework.web.bind.annotation.RequestBody Compensation entity) {
        return org.springframework.http.ResponseEntity.ok(compensationService.processBusinessLogic2(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/3")
    public org.springframework.http.ResponseEntity<Compensation> processEndpoint3(@org.springframework.web.bind.annotation.RequestBody Compensation entity) {
        return org.springframework.http.ResponseEntity.ok(compensationService.processBusinessLogic3(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/4")
    public org.springframework.http.ResponseEntity<Compensation> processEndpoint4(@org.springframework.web.bind.annotation.RequestBody Compensation entity) {
        return org.springframework.http.ResponseEntity.ok(compensationService.processBusinessLogic4(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/5")
    public org.springframework.http.ResponseEntity<Compensation> processEndpoint5(@org.springframework.web.bind.annotation.RequestBody Compensation entity) {
        return org.springframework.http.ResponseEntity.ok(compensationService.processBusinessLogic5(entity));
    }

}
