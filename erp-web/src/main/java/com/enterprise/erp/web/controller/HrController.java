package com.enterprise.erp.web.controller;

import com.enterprise.erp.domain.entity.Hr;
import com.enterprise.erp.core.service.HrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hrs")
public class HrController {

    private final HrService hrService;

    @Autowired
    public HrController(HrService hrService) {
        this.hrService = hrService;
    }

    @PostMapping
    public org.springframework.http.ResponseEntity<Hr> create(@RequestBody Hr entity) {
        return org.springframework.http.ResponseEntity.ok(hrService.create(entity));
    }

    @GetMapping
    public org.springframework.http.ResponseEntity<List<Hr>> getAll() {
        return org.springframework.http.ResponseEntity.ok(hrService.findAll());
    }

    @org.springframework.web.bind.annotation.PostMapping("/1")
    public org.springframework.http.ResponseEntity<Hr> processEndpoint1(@org.springframework.web.bind.annotation.RequestBody Hr entity) {
        return org.springframework.http.ResponseEntity.ok(hrService.processBusinessLogic1(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/2")
    public org.springframework.http.ResponseEntity<Hr> processEndpoint2(@org.springframework.web.bind.annotation.RequestBody Hr entity) {
        return org.springframework.http.ResponseEntity.ok(hrService.processBusinessLogic2(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/3")
    public org.springframework.http.ResponseEntity<Hr> processEndpoint3(@org.springframework.web.bind.annotation.RequestBody Hr entity) {
        return org.springframework.http.ResponseEntity.ok(hrService.processBusinessLogic3(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/4")
    public org.springframework.http.ResponseEntity<Hr> processEndpoint4(@org.springframework.web.bind.annotation.RequestBody Hr entity) {
        return org.springframework.http.ResponseEntity.ok(hrService.processBusinessLogic4(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/5")
    public org.springframework.http.ResponseEntity<Hr> processEndpoint5(@org.springframework.web.bind.annotation.RequestBody Hr entity) {
        return org.springframework.http.ResponseEntity.ok(hrService.processBusinessLogic5(entity));
    }

}
