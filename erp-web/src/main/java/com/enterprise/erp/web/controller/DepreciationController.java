package com.enterprise.erp.web.controller;
import com.enterprise.erp.domain.entity.Depreciation;
import com.enterprise.erp.core.service.DepreciationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/depreciations")
public class DepreciationController {
    private final DepreciationService depreciationService;
    @Autowired
    public DepreciationController(DepreciationService depreciationService) {
        this.depreciationService = depreciationService;
    }
    @PostMapping
    public org.springframework.http.ResponseEntity<Depreciation> create(@RequestBody Depreciation entity) {
        return org.springframework.http.ResponseEntity.ok(depreciationService.create(entity));
    }
    @GetMapping
    public org.springframework.http.ResponseEntity<List<Depreciation>> getAll() {
        return org.springframework.http.ResponseEntity.ok(depreciationService.findAll());
    }

    @org.springframework.web.bind.annotation.PostMapping("/1")
    public org.springframework.http.ResponseEntity<Depreciation> processEndpoint1(@org.springframework.web.bind.annotation.RequestBody Depreciation entity) {
        return org.springframework.http.ResponseEntity.ok(depreciationService.processBusinessLogic1(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/2")
    public org.springframework.http.ResponseEntity<Depreciation> processEndpoint2(@org.springframework.web.bind.annotation.RequestBody Depreciation entity) {
        return org.springframework.http.ResponseEntity.ok(depreciationService.processBusinessLogic2(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/3")
    public org.springframework.http.ResponseEntity<Depreciation> processEndpoint3(@org.springframework.web.bind.annotation.RequestBody Depreciation entity) {
        return org.springframework.http.ResponseEntity.ok(depreciationService.processBusinessLogic3(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/4")
    public org.springframework.http.ResponseEntity<Depreciation> processEndpoint4(@org.springframework.web.bind.annotation.RequestBody Depreciation entity) {
        return org.springframework.http.ResponseEntity.ok(depreciationService.processBusinessLogic4(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/5")
    public org.springframework.http.ResponseEntity<Depreciation> processEndpoint5(@org.springframework.web.bind.annotation.RequestBody Depreciation entity) {
        return org.springframework.http.ResponseEntity.ok(depreciationService.processBusinessLogic5(entity));
    }

}
