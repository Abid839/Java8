package com.enterprise.erp.web.controller;
import com.enterprise.erp.domain.entity.Currency;
import com.enterprise.erp.core.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/currencys")
public class CurrencyController {
    private final CurrencyService currencyService;
    @Autowired
    public CurrencyController(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }
    @PostMapping
    public org.springframework.http.ResponseEntity<Currency> create(@RequestBody Currency entity) {
        return org.springframework.http.ResponseEntity.ok(currencyService.create(entity));
    }
    @GetMapping
    public org.springframework.http.ResponseEntity<List<Currency>> getAll() {
        return org.springframework.http.ResponseEntity.ok(currencyService.findAll());
    }

    @org.springframework.web.bind.annotation.PostMapping("/1")
    public org.springframework.http.ResponseEntity<Currency> processEndpoint1(@org.springframework.web.bind.annotation.RequestBody Currency entity) {
        return org.springframework.http.ResponseEntity.ok(currencyService.processBusinessLogic1(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/2")
    public org.springframework.http.ResponseEntity<Currency> processEndpoint2(@org.springframework.web.bind.annotation.RequestBody Currency entity) {
        return org.springframework.http.ResponseEntity.ok(currencyService.processBusinessLogic2(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/3")
    public org.springframework.http.ResponseEntity<Currency> processEndpoint3(@org.springframework.web.bind.annotation.RequestBody Currency entity) {
        return org.springframework.http.ResponseEntity.ok(currencyService.processBusinessLogic3(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/4")
    public org.springframework.http.ResponseEntity<Currency> processEndpoint4(@org.springframework.web.bind.annotation.RequestBody Currency entity) {
        return org.springframework.http.ResponseEntity.ok(currencyService.processBusinessLogic4(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/5")
    public org.springframework.http.ResponseEntity<Currency> processEndpoint5(@org.springframework.web.bind.annotation.RequestBody Currency entity) {
        return org.springframework.http.ResponseEntity.ok(currencyService.processBusinessLogic5(entity));
    }

}
