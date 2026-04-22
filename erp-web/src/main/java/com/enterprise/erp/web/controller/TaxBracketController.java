package com.enterprise.erp.web.controller;
import com.enterprise.erp.domain.entity.TaxBracket;
import com.enterprise.erp.core.service.TaxBracketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/taxbrackets")
public class TaxBracketController {
    private final TaxBracketService taxbracketService;
    @Autowired
    public TaxBracketController(TaxBracketService taxbracketService) {
        this.taxbracketService = taxbracketService;
    }
    @PostMapping
    public org.springframework.http.ResponseEntity<TaxBracket> create(@RequestBody TaxBracket entity) {
        return org.springframework.http.ResponseEntity.ok(taxbracketService.create(entity));
    }
    @GetMapping
    public org.springframework.http.ResponseEntity<List<TaxBracket>> getAll() {
        return org.springframework.http.ResponseEntity.ok(taxbracketService.findAll());
    }

    @org.springframework.web.bind.annotation.PostMapping("/1")
    public org.springframework.http.ResponseEntity<TaxBracket> processEndpoint1(@org.springframework.web.bind.annotation.RequestBody TaxBracket entity) {
        return org.springframework.http.ResponseEntity.ok(taxbracketService.processBusinessLogic1(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/2")
    public org.springframework.http.ResponseEntity<TaxBracket> processEndpoint2(@org.springframework.web.bind.annotation.RequestBody TaxBracket entity) {
        return org.springframework.http.ResponseEntity.ok(taxbracketService.processBusinessLogic2(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/3")
    public org.springframework.http.ResponseEntity<TaxBracket> processEndpoint3(@org.springframework.web.bind.annotation.RequestBody TaxBracket entity) {
        return org.springframework.http.ResponseEntity.ok(taxbracketService.processBusinessLogic3(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/4")
    public org.springframework.http.ResponseEntity<TaxBracket> processEndpoint4(@org.springframework.web.bind.annotation.RequestBody TaxBracket entity) {
        return org.springframework.http.ResponseEntity.ok(taxbracketService.processBusinessLogic4(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/5")
    public org.springframework.http.ResponseEntity<TaxBracket> processEndpoint5(@org.springframework.web.bind.annotation.RequestBody TaxBracket entity) {
        return org.springframework.http.ResponseEntity.ok(taxbracketService.processBusinessLogic5(entity));
    }

}
