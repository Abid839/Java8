package com.enterprise.erp.web.controller;
import com.enterprise.erp.domain.entity.Discount;
import com.enterprise.erp.core.service.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/discounts")
public class DiscountController {
    private final DiscountService discountService;
    @Autowired
    public DiscountController(DiscountService discountService) {
        this.discountService = discountService;
    }
    @PostMapping
    public org.springframework.http.ResponseEntity<Discount> create(@RequestBody Discount entity) {
        return org.springframework.http.ResponseEntity.ok(discountService.create(entity));
    }
    @GetMapping
    public org.springframework.http.ResponseEntity<List<Discount>> getAll() {
        return org.springframework.http.ResponseEntity.ok(discountService.findAll());
    }

    @org.springframework.web.bind.annotation.PostMapping("/1")
    public org.springframework.http.ResponseEntity<Discount> processEndpoint1(@org.springframework.web.bind.annotation.RequestBody Discount entity) {
        return org.springframework.http.ResponseEntity.ok(discountService.processBusinessLogic1(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/2")
    public org.springframework.http.ResponseEntity<Discount> processEndpoint2(@org.springframework.web.bind.annotation.RequestBody Discount entity) {
        return org.springframework.http.ResponseEntity.ok(discountService.processBusinessLogic2(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/3")
    public org.springframework.http.ResponseEntity<Discount> processEndpoint3(@org.springframework.web.bind.annotation.RequestBody Discount entity) {
        return org.springframework.http.ResponseEntity.ok(discountService.processBusinessLogic3(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/4")
    public org.springframework.http.ResponseEntity<Discount> processEndpoint4(@org.springframework.web.bind.annotation.RequestBody Discount entity) {
        return org.springframework.http.ResponseEntity.ok(discountService.processBusinessLogic4(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/5")
    public org.springframework.http.ResponseEntity<Discount> processEndpoint5(@org.springframework.web.bind.annotation.RequestBody Discount entity) {
        return org.springframework.http.ResponseEntity.ok(discountService.processBusinessLogic5(entity));
    }

}
