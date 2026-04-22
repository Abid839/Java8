package com.enterprise.erp.web.controller;

import com.enterprise.erp.domain.entity.Campaign;
import com.enterprise.erp.core.service.CampaignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/campaigns")
public class CampaignController {

    private final CampaignService campaignService;

    @Autowired
    public CampaignController(CampaignService campaignService) {
        this.campaignService = campaignService;
    }

    @PostMapping
    public org.springframework.http.ResponseEntity<Campaign> create(@RequestBody Campaign entity) {
        return org.springframework.http.ResponseEntity.ok(campaignService.create(entity));
    }

    @GetMapping
    public org.springframework.http.ResponseEntity<List<Campaign>> getAll() {
        return org.springframework.http.ResponseEntity.ok(campaignService.findAll());
    }

    @org.springframework.web.bind.annotation.PostMapping("/1")
    public org.springframework.http.ResponseEntity<Campaign> processEndpoint1(@org.springframework.web.bind.annotation.RequestBody Campaign entity) {
        return org.springframework.http.ResponseEntity.ok(campaignService.processBusinessLogic1(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/2")
    public org.springframework.http.ResponseEntity<Campaign> processEndpoint2(@org.springframework.web.bind.annotation.RequestBody Campaign entity) {
        return org.springframework.http.ResponseEntity.ok(campaignService.processBusinessLogic2(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/3")
    public org.springframework.http.ResponseEntity<Campaign> processEndpoint3(@org.springframework.web.bind.annotation.RequestBody Campaign entity) {
        return org.springframework.http.ResponseEntity.ok(campaignService.processBusinessLogic3(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/4")
    public org.springframework.http.ResponseEntity<Campaign> processEndpoint4(@org.springframework.web.bind.annotation.RequestBody Campaign entity) {
        return org.springframework.http.ResponseEntity.ok(campaignService.processBusinessLogic4(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/5")
    public org.springframework.http.ResponseEntity<Campaign> processEndpoint5(@org.springframework.web.bind.annotation.RequestBody Campaign entity) {
        return org.springframework.http.ResponseEntity.ok(campaignService.processBusinessLogic5(entity));
    }

}
