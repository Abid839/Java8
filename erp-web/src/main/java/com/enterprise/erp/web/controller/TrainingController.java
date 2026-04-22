package com.enterprise.erp.web.controller;

import com.enterprise.erp.domain.entity.Training;
import com.enterprise.erp.core.service.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/trainings")
public class TrainingController {

    private final TrainingService trainingService;

    @Autowired
    public TrainingController(TrainingService trainingService) {
        this.trainingService = trainingService;
    }

    @PostMapping
    public org.springframework.http.ResponseEntity<Training> create(@RequestBody Training entity) {
        return org.springframework.http.ResponseEntity.ok(trainingService.create(entity));
    }

    @GetMapping
    public org.springframework.http.ResponseEntity<List<Training>> getAll() {
        return org.springframework.http.ResponseEntity.ok(trainingService.findAll());
    }

    @org.springframework.web.bind.annotation.PostMapping("/1")
    public org.springframework.http.ResponseEntity<Training> processEndpoint1(@org.springframework.web.bind.annotation.RequestBody Training entity) {
        return org.springframework.http.ResponseEntity.ok(trainingService.processBusinessLogic1(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/2")
    public org.springframework.http.ResponseEntity<Training> processEndpoint2(@org.springframework.web.bind.annotation.RequestBody Training entity) {
        return org.springframework.http.ResponseEntity.ok(trainingService.processBusinessLogic2(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/3")
    public org.springframework.http.ResponseEntity<Training> processEndpoint3(@org.springframework.web.bind.annotation.RequestBody Training entity) {
        return org.springframework.http.ResponseEntity.ok(trainingService.processBusinessLogic3(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/4")
    public org.springframework.http.ResponseEntity<Training> processEndpoint4(@org.springframework.web.bind.annotation.RequestBody Training entity) {
        return org.springframework.http.ResponseEntity.ok(trainingService.processBusinessLogic4(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/5")
    public org.springframework.http.ResponseEntity<Training> processEndpoint5(@org.springframework.web.bind.annotation.RequestBody Training entity) {
        return org.springframework.http.ResponseEntity.ok(trainingService.processBusinessLogic5(entity));
    }

}
