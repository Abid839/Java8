package com.enterprise.erp.web.controller;
import com.enterprise.erp.domain.entity.PurchaseOrder;
import com.enterprise.erp.core.service.PurchaseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/purchaseorders")
public class PurchaseOrderController {
    private final PurchaseOrderService purchaseorderService;
    @Autowired
    public PurchaseOrderController(PurchaseOrderService purchaseorderService) {
        this.purchaseorderService = purchaseorderService;
    }
    @PostMapping
    public org.springframework.http.ResponseEntity<PurchaseOrder> create(@RequestBody PurchaseOrder entity) {
        return org.springframework.http.ResponseEntity.ok(purchaseorderService.create(entity));
    }
    @GetMapping
    public org.springframework.http.ResponseEntity<List<PurchaseOrder>> getAll() {
        return org.springframework.http.ResponseEntity.ok(purchaseorderService.findAll());
    }

    @org.springframework.web.bind.annotation.PostMapping("/1")
    public org.springframework.http.ResponseEntity<PurchaseOrder> processEndpoint1(@org.springframework.web.bind.annotation.RequestBody PurchaseOrder entity) {
        return org.springframework.http.ResponseEntity.ok(purchaseorderService.processBusinessLogic1(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/2")
    public org.springframework.http.ResponseEntity<PurchaseOrder> processEndpoint2(@org.springframework.web.bind.annotation.RequestBody PurchaseOrder entity) {
        return org.springframework.http.ResponseEntity.ok(purchaseorderService.processBusinessLogic2(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/3")
    public org.springframework.http.ResponseEntity<PurchaseOrder> processEndpoint3(@org.springframework.web.bind.annotation.RequestBody PurchaseOrder entity) {
        return org.springframework.http.ResponseEntity.ok(purchaseorderService.processBusinessLogic3(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/4")
    public org.springframework.http.ResponseEntity<PurchaseOrder> processEndpoint4(@org.springframework.web.bind.annotation.RequestBody PurchaseOrder entity) {
        return org.springframework.http.ResponseEntity.ok(purchaseorderService.processBusinessLogic4(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/5")
    public org.springframework.http.ResponseEntity<PurchaseOrder> processEndpoint5(@org.springframework.web.bind.annotation.RequestBody PurchaseOrder entity) {
        return org.springframework.http.ResponseEntity.ok(purchaseorderService.processBusinessLogic5(entity));
    }

}
