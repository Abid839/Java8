package com.enterprise.erp.web.controller;
import com.enterprise.erp.domain.entity.Shipping;
import com.enterprise.erp.core.service.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/shippings")
public class ShippingController {
    private final ShippingService shippingService;
    @Autowired
    public ShippingController(ShippingService shippingService) {
        this.shippingService = shippingService;
    }
    @PostMapping
    public org.springframework.http.ResponseEntity<Shipping> create(@RequestBody Shipping entity) {
        return org.springframework.http.ResponseEntity.ok(shippingService.create(entity));
    }
    @GetMapping
    public org.springframework.http.ResponseEntity<List<Shipping>> getAll() {
        return org.springframework.http.ResponseEntity.ok(shippingService.findAll());
    }

    @org.springframework.web.bind.annotation.PostMapping("/1")
    public org.springframework.http.ResponseEntity<Shipping> processEndpoint1(@org.springframework.web.bind.annotation.RequestBody Shipping entity) {
        return org.springframework.http.ResponseEntity.ok(shippingService.processBusinessLogic1(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/2")
    public org.springframework.http.ResponseEntity<Shipping> processEndpoint2(@org.springframework.web.bind.annotation.RequestBody Shipping entity) {
        return org.springframework.http.ResponseEntity.ok(shippingService.processBusinessLogic2(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/3")
    public org.springframework.http.ResponseEntity<Shipping> processEndpoint3(@org.springframework.web.bind.annotation.RequestBody Shipping entity) {
        return org.springframework.http.ResponseEntity.ok(shippingService.processBusinessLogic3(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/4")
    public org.springframework.http.ResponseEntity<Shipping> processEndpoint4(@org.springframework.web.bind.annotation.RequestBody Shipping entity) {
        return org.springframework.http.ResponseEntity.ok(shippingService.processBusinessLogic4(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/5")
    public org.springframework.http.ResponseEntity<Shipping> processEndpoint5(@org.springframework.web.bind.annotation.RequestBody Shipping entity) {
        return org.springframework.http.ResponseEntity.ok(shippingService.processBusinessLogic5(entity));
    }

}
