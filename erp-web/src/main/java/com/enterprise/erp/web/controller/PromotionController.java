package com.enterprise.erp.web.controller;
import com.enterprise.erp.domain.entity.Promotion;
import com.enterprise.erp.core.service.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/promotions")
public class PromotionController {
    private final PromotionService promotionService;
    @Autowired
    public PromotionController(PromotionService promotionService) {
        this.promotionService = promotionService;
    }
    @PostMapping
    public org.springframework.http.ResponseEntity<Promotion> create(@RequestBody Promotion entity) {
        return org.springframework.http.ResponseEntity.ok(promotionService.create(entity));
    }
    @GetMapping
    public org.springframework.http.ResponseEntity<List<Promotion>> getAll() {
        return org.springframework.http.ResponseEntity.ok(promotionService.findAll());
    }

    @org.springframework.web.bind.annotation.PostMapping("/1")
    public org.springframework.http.ResponseEntity<Promotion> processEndpoint1(@org.springframework.web.bind.annotation.RequestBody Promotion entity) {
        return org.springframework.http.ResponseEntity.ok(promotionService.processBusinessLogic1(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/2")
    public org.springframework.http.ResponseEntity<Promotion> processEndpoint2(@org.springframework.web.bind.annotation.RequestBody Promotion entity) {
        return org.springframework.http.ResponseEntity.ok(promotionService.processBusinessLogic2(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/3")
    public org.springframework.http.ResponseEntity<Promotion> processEndpoint3(@org.springframework.web.bind.annotation.RequestBody Promotion entity) {
        return org.springframework.http.ResponseEntity.ok(promotionService.processBusinessLogic3(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/4")
    public org.springframework.http.ResponseEntity<Promotion> processEndpoint4(@org.springframework.web.bind.annotation.RequestBody Promotion entity) {
        return org.springframework.http.ResponseEntity.ok(promotionService.processBusinessLogic4(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/5")
    public org.springframework.http.ResponseEntity<Promotion> processEndpoint5(@org.springframework.web.bind.annotation.RequestBody Promotion entity) {
        return org.springframework.http.ResponseEntity.ok(promotionService.processBusinessLogic5(entity));
    }

}
