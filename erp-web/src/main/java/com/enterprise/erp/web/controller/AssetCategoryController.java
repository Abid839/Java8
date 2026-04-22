package com.enterprise.erp.web.controller;
import com.enterprise.erp.domain.entity.AssetCategory;
import com.enterprise.erp.core.service.AssetCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/assetcategorys")
public class AssetCategoryController {
    private final AssetCategoryService assetcategoryService;
    @Autowired
    public AssetCategoryController(AssetCategoryService assetcategoryService) {
        this.assetcategoryService = assetcategoryService;
    }
    @PostMapping
    public org.springframework.http.ResponseEntity<AssetCategory> create(@RequestBody AssetCategory entity) {
        return org.springframework.http.ResponseEntity.ok(assetcategoryService.create(entity));
    }
    @GetMapping
    public org.springframework.http.ResponseEntity<List<AssetCategory>> getAll() {
        return org.springframework.http.ResponseEntity.ok(assetcategoryService.findAll());
    }

    @org.springframework.web.bind.annotation.PostMapping("/1")
    public org.springframework.http.ResponseEntity<AssetCategory> processEndpoint1(@org.springframework.web.bind.annotation.RequestBody AssetCategory entity) {
        return org.springframework.http.ResponseEntity.ok(assetcategoryService.processBusinessLogic1(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/2")
    public org.springframework.http.ResponseEntity<AssetCategory> processEndpoint2(@org.springframework.web.bind.annotation.RequestBody AssetCategory entity) {
        return org.springframework.http.ResponseEntity.ok(assetcategoryService.processBusinessLogic2(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/3")
    public org.springframework.http.ResponseEntity<AssetCategory> processEndpoint3(@org.springframework.web.bind.annotation.RequestBody AssetCategory entity) {
        return org.springframework.http.ResponseEntity.ok(assetcategoryService.processBusinessLogic3(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/4")
    public org.springframework.http.ResponseEntity<AssetCategory> processEndpoint4(@org.springframework.web.bind.annotation.RequestBody AssetCategory entity) {
        return org.springframework.http.ResponseEntity.ok(assetcategoryService.processBusinessLogic4(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/5")
    public org.springframework.http.ResponseEntity<AssetCategory> processEndpoint5(@org.springframework.web.bind.annotation.RequestBody AssetCategory entity) {
        return org.springframework.http.ResponseEntity.ok(assetcategoryService.processBusinessLogic5(entity));
    }

}
