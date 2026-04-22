package com.enterprise.erp.web.controller;

import com.enterprise.erp.domain.entity.Quote;
import com.enterprise.erp.core.service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/quotes")
public class QuoteController {

    private final QuoteService quoteService;

    @Autowired
    public QuoteController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }

    @PostMapping
    public org.springframework.http.ResponseEntity<Quote> create(@RequestBody Quote entity) {
        return org.springframework.http.ResponseEntity.ok(quoteService.create(entity));
    }

    @GetMapping
    public org.springframework.http.ResponseEntity<List<Quote>> getAll() {
        return org.springframework.http.ResponseEntity.ok(quoteService.findAll());
    }

    @org.springframework.web.bind.annotation.PostMapping("/1")
    public org.springframework.http.ResponseEntity<Quote> processEndpoint1(@org.springframework.web.bind.annotation.RequestBody Quote entity) {
        return org.springframework.http.ResponseEntity.ok(quoteService.processBusinessLogic1(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/2")
    public org.springframework.http.ResponseEntity<Quote> processEndpoint2(@org.springframework.web.bind.annotation.RequestBody Quote entity) {
        return org.springframework.http.ResponseEntity.ok(quoteService.processBusinessLogic2(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/3")
    public org.springframework.http.ResponseEntity<Quote> processEndpoint3(@org.springframework.web.bind.annotation.RequestBody Quote entity) {
        return org.springframework.http.ResponseEntity.ok(quoteService.processBusinessLogic3(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/4")
    public org.springframework.http.ResponseEntity<Quote> processEndpoint4(@org.springframework.web.bind.annotation.RequestBody Quote entity) {
        return org.springframework.http.ResponseEntity.ok(quoteService.processBusinessLogic4(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/5")
    public org.springframework.http.ResponseEntity<Quote> processEndpoint5(@org.springframework.web.bind.annotation.RequestBody Quote entity) {
        return org.springframework.http.ResponseEntity.ok(quoteService.processBusinessLogic5(entity));
    }

}
