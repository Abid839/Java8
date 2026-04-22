package com.enterprise.erp.web.controller;

import com.enterprise.erp.domain.entity.Performance;
import com.enterprise.erp.core.service.PerformanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/performances")
public class PerformanceController {

    private final PerformanceService performanceService;

    @Autowired
    public PerformanceController(PerformanceService performanceService) {
        this.performanceService = performanceService;
    }

    @PostMapping
    public org.springframework.http.ResponseEntity<Performance> create(@RequestBody Performance entity) {
        return org.springframework.http.ResponseEntity.ok(performanceService.create(entity));
    }

    @GetMapping
    public org.springframework.http.ResponseEntity<List<Performance>> getAll() {
        return org.springframework.http.ResponseEntity.ok(performanceService.findAll());
    }

    @org.springframework.web.bind.annotation.PostMapping("/1")
    public org.springframework.http.ResponseEntity<Performance> processEndpoint1(@org.springframework.web.bind.annotation.RequestBody Performance entity) {
        return org.springframework.http.ResponseEntity.ok(performanceService.processBusinessLogic1(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/2")
    public org.springframework.http.ResponseEntity<Performance> processEndpoint2(@org.springframework.web.bind.annotation.RequestBody Performance entity) {
        return org.springframework.http.ResponseEntity.ok(performanceService.processBusinessLogic2(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/3")
    public org.springframework.http.ResponseEntity<Performance> processEndpoint3(@org.springframework.web.bind.annotation.RequestBody Performance entity) {
        return org.springframework.http.ResponseEntity.ok(performanceService.processBusinessLogic3(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/4")
    public org.springframework.http.ResponseEntity<Performance> processEndpoint4(@org.springframework.web.bind.annotation.RequestBody Performance entity) {
        return org.springframework.http.ResponseEntity.ok(performanceService.processBusinessLogic4(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/5")
    public org.springframework.http.ResponseEntity<Performance> processEndpoint5(@org.springframework.web.bind.annotation.RequestBody Performance entity) {
        return org.springframework.http.ResponseEntity.ok(performanceService.processBusinessLogic5(entity));
    }

}
