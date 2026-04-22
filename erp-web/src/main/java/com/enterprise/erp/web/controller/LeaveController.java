package com.enterprise.erp.web.controller;

import com.enterprise.erp.domain.entity.Leave;
import com.enterprise.erp.core.service.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/leaves")
public class LeaveController {

    private final LeaveService leaveService;

    @Autowired
    public LeaveController(LeaveService leaveService) {
        this.leaveService = leaveService;
    }

    @PostMapping
    public org.springframework.http.ResponseEntity<Leave> create(@RequestBody Leave entity) {
        return org.springframework.http.ResponseEntity.ok(leaveService.create(entity));
    }

    @GetMapping
    public org.springframework.http.ResponseEntity<List<Leave>> getAll() {
        return org.springframework.http.ResponseEntity.ok(leaveService.findAll());
    }

    @org.springframework.web.bind.annotation.PostMapping("/1")
    public org.springframework.http.ResponseEntity<Leave> processEndpoint1(@org.springframework.web.bind.annotation.RequestBody Leave entity) {
        return org.springframework.http.ResponseEntity.ok(leaveService.processBusinessLogic1(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/2")
    public org.springframework.http.ResponseEntity<Leave> processEndpoint2(@org.springframework.web.bind.annotation.RequestBody Leave entity) {
        return org.springframework.http.ResponseEntity.ok(leaveService.processBusinessLogic2(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/3")
    public org.springframework.http.ResponseEntity<Leave> processEndpoint3(@org.springframework.web.bind.annotation.RequestBody Leave entity) {
        return org.springframework.http.ResponseEntity.ok(leaveService.processBusinessLogic3(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/4")
    public org.springframework.http.ResponseEntity<Leave> processEndpoint4(@org.springframework.web.bind.annotation.RequestBody Leave entity) {
        return org.springframework.http.ResponseEntity.ok(leaveService.processBusinessLogic4(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/5")
    public org.springframework.http.ResponseEntity<Leave> processEndpoint5(@org.springframework.web.bind.annotation.RequestBody Leave entity) {
        return org.springframework.http.ResponseEntity.ok(leaveService.processBusinessLogic5(entity));
    }

}
