package com.enterprise.erp.web.controller;
import com.enterprise.erp.domain.entity.Territory;
import com.enterprise.erp.core.service.TerritoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/territorys")
public class TerritoryController {
    private final TerritoryService territoryService;
    @Autowired
    public TerritoryController(TerritoryService territoryService) {
        this.territoryService = territoryService;
    }
    @PostMapping
    public org.springframework.http.ResponseEntity<Territory> create(@RequestBody Territory entity) {
        return org.springframework.http.ResponseEntity.ok(territoryService.create(entity));
    }
    @GetMapping
    public org.springframework.http.ResponseEntity<List<Territory>> getAll() {
        return org.springframework.http.ResponseEntity.ok(territoryService.findAll());
    }

    @org.springframework.web.bind.annotation.PostMapping("/1")
    public org.springframework.http.ResponseEntity<Territory> processEndpoint1(@org.springframework.web.bind.annotation.RequestBody Territory entity) {
        return org.springframework.http.ResponseEntity.ok(territoryService.processBusinessLogic1(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/2")
    public org.springframework.http.ResponseEntity<Territory> processEndpoint2(@org.springframework.web.bind.annotation.RequestBody Territory entity) {
        return org.springframework.http.ResponseEntity.ok(territoryService.processBusinessLogic2(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/3")
    public org.springframework.http.ResponseEntity<Territory> processEndpoint3(@org.springframework.web.bind.annotation.RequestBody Territory entity) {
        return org.springframework.http.ResponseEntity.ok(territoryService.processBusinessLogic3(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/4")
    public org.springframework.http.ResponseEntity<Territory> processEndpoint4(@org.springframework.web.bind.annotation.RequestBody Territory entity) {
        return org.springframework.http.ResponseEntity.ok(territoryService.processBusinessLogic4(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/5")
    public org.springframework.http.ResponseEntity<Territory> processEndpoint5(@org.springframework.web.bind.annotation.RequestBody Territory entity) {
        return org.springframework.http.ResponseEntity.ok(territoryService.processBusinessLogic5(entity));
    }

}
