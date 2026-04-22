package com.enterprise.erp.web.controller;

import com.enterprise.erp.domain.entity.Import;
import com.enterprise.erp.core.service.ImportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/imports")
public class ImportController {

    private final ImportService importService;

    @Autowired
    public ImportController(ImportService importService) {
        this.importService = importService;
    }

    @PostMapping
    public org.springframework.http.ResponseEntity<Import> create(@RequestBody Import entity) {
        return org.springframework.http.ResponseEntity.ok(importService.create(entity));
    }

    @GetMapping
    public org.springframework.http.ResponseEntity<List<Import>> getAll() {
        return org.springframework.http.ResponseEntity.ok(importService.findAll());
    }

    @org.springframework.web.bind.annotation.PostMapping("/1")
    public org.springframework.http.ResponseEntity<Import> processEndpoint1(@org.springframework.web.bind.annotation.RequestBody Import entity) {
        return org.springframework.http.ResponseEntity.ok(importService.processBusinessLogic1(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/2")
    public org.springframework.http.ResponseEntity<Import> processEndpoint2(@org.springframework.web.bind.annotation.RequestBody Import entity) {
        return org.springframework.http.ResponseEntity.ok(importService.processBusinessLogic2(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/3")
    public org.springframework.http.ResponseEntity<Import> processEndpoint3(@org.springframework.web.bind.annotation.RequestBody Import entity) {
        return org.springframework.http.ResponseEntity.ok(importService.processBusinessLogic3(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/4")
    public org.springframework.http.ResponseEntity<Import> processEndpoint4(@org.springframework.web.bind.annotation.RequestBody Import entity) {
        return org.springframework.http.ResponseEntity.ok(importService.processBusinessLogic4(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/5")
    public org.springframework.http.ResponseEntity<Import> processEndpoint5(@org.springframework.web.bind.annotation.RequestBody Import entity) {
        return org.springframework.http.ResponseEntity.ok(importService.processBusinessLogic5(entity));
    }

}
