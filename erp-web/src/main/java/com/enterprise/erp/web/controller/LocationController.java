package com.enterprise.erp.web.controller;
import com.enterprise.erp.domain.entity.Location;
import com.enterprise.erp.core.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/locations")
public class LocationController {
    private final LocationService locationService;
    @Autowired
    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }
    @PostMapping
    public org.springframework.http.ResponseEntity<Location> create(@RequestBody Location entity) {
        return org.springframework.http.ResponseEntity.ok(locationService.create(entity));
    }
    @GetMapping
    public org.springframework.http.ResponseEntity<List<Location>> getAll() {
        return org.springframework.http.ResponseEntity.ok(locationService.findAll());
    }

    @org.springframework.web.bind.annotation.PostMapping("/1")
    public org.springframework.http.ResponseEntity<Location> processEndpoint1(@org.springframework.web.bind.annotation.RequestBody Location entity) {
        return org.springframework.http.ResponseEntity.ok(locationService.processBusinessLogic1(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/2")
    public org.springframework.http.ResponseEntity<Location> processEndpoint2(@org.springframework.web.bind.annotation.RequestBody Location entity) {
        return org.springframework.http.ResponseEntity.ok(locationService.processBusinessLogic2(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/3")
    public org.springframework.http.ResponseEntity<Location> processEndpoint3(@org.springframework.web.bind.annotation.RequestBody Location entity) {
        return org.springframework.http.ResponseEntity.ok(locationService.processBusinessLogic3(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/4")
    public org.springframework.http.ResponseEntity<Location> processEndpoint4(@org.springframework.web.bind.annotation.RequestBody Location entity) {
        return org.springframework.http.ResponseEntity.ok(locationService.processBusinessLogic4(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/5")
    public org.springframework.http.ResponseEntity<Location> processEndpoint5(@org.springframework.web.bind.annotation.RequestBody Location entity) {
        return org.springframework.http.ResponseEntity.ok(locationService.processBusinessLogic5(entity));
    }

}
