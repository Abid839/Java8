package com.enterprise.erp.web.controller;
import com.enterprise.erp.domain.entity.ExchangeRate;
import com.enterprise.erp.core.service.ExchangeRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/exchangerates")
public class ExchangeRateController {
    private final ExchangeRateService exchangerateService;
    @Autowired
    public ExchangeRateController(ExchangeRateService exchangerateService) {
        this.exchangerateService = exchangerateService;
    }
    @PostMapping
    public org.springframework.http.ResponseEntity<ExchangeRate> create(@RequestBody ExchangeRate entity) {
        return org.springframework.http.ResponseEntity.ok(exchangerateService.create(entity));
    }
    @GetMapping
    public org.springframework.http.ResponseEntity<List<ExchangeRate>> getAll() {
        return org.springframework.http.ResponseEntity.ok(exchangerateService.findAll());
    }

    @org.springframework.web.bind.annotation.PostMapping("/1")
    public org.springframework.http.ResponseEntity<ExchangeRate> processEndpoint1(@org.springframework.web.bind.annotation.RequestBody ExchangeRate entity) {
        return org.springframework.http.ResponseEntity.ok(exchangerateService.processBusinessLogic1(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/2")
    public org.springframework.http.ResponseEntity<ExchangeRate> processEndpoint2(@org.springframework.web.bind.annotation.RequestBody ExchangeRate entity) {
        return org.springframework.http.ResponseEntity.ok(exchangerateService.processBusinessLogic2(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/3")
    public org.springframework.http.ResponseEntity<ExchangeRate> processEndpoint3(@org.springframework.web.bind.annotation.RequestBody ExchangeRate entity) {
        return org.springframework.http.ResponseEntity.ok(exchangerateService.processBusinessLogic3(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/4")
    public org.springframework.http.ResponseEntity<ExchangeRate> processEndpoint4(@org.springframework.web.bind.annotation.RequestBody ExchangeRate entity) {
        return org.springframework.http.ResponseEntity.ok(exchangerateService.processBusinessLogic4(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/5")
    public org.springframework.http.ResponseEntity<ExchangeRate> processEndpoint5(@org.springframework.web.bind.annotation.RequestBody ExchangeRate entity) {
        return org.springframework.http.ResponseEntity.ok(exchangerateService.processBusinessLogic5(entity));
    }

}
