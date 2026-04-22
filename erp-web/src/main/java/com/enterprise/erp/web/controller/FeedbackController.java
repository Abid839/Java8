package com.enterprise.erp.web.controller;

import com.enterprise.erp.domain.entity.Feedback;
import com.enterprise.erp.core.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/feedbacks")
public class FeedbackController {

    private final FeedbackService feedbackService;

    @Autowired
    public FeedbackController(FeedbackService feedbackService) {
        this.feedbackService = feedbackService;
    }

    @PostMapping
    public org.springframework.http.ResponseEntity<Feedback> create(@RequestBody Feedback entity) {
        return org.springframework.http.ResponseEntity.ok(feedbackService.create(entity));
    }

    @GetMapping
    public org.springframework.http.ResponseEntity<List<Feedback>> getAll() {
        return org.springframework.http.ResponseEntity.ok(feedbackService.findAll());
    }

    @org.springframework.web.bind.annotation.PostMapping("/1")
    public org.springframework.http.ResponseEntity<Feedback> processEndpoint1(@org.springframework.web.bind.annotation.RequestBody Feedback entity) {
        return org.springframework.http.ResponseEntity.ok(feedbackService.processBusinessLogic1(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/2")
    public org.springframework.http.ResponseEntity<Feedback> processEndpoint2(@org.springframework.web.bind.annotation.RequestBody Feedback entity) {
        return org.springframework.http.ResponseEntity.ok(feedbackService.processBusinessLogic2(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/3")
    public org.springframework.http.ResponseEntity<Feedback> processEndpoint3(@org.springframework.web.bind.annotation.RequestBody Feedback entity) {
        return org.springframework.http.ResponseEntity.ok(feedbackService.processBusinessLogic3(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/4")
    public org.springframework.http.ResponseEntity<Feedback> processEndpoint4(@org.springframework.web.bind.annotation.RequestBody Feedback entity) {
        return org.springframework.http.ResponseEntity.ok(feedbackService.processBusinessLogic4(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/5")
    public org.springframework.http.ResponseEntity<Feedback> processEndpoint5(@org.springframework.web.bind.annotation.RequestBody Feedback entity) {
        return org.springframework.http.ResponseEntity.ok(feedbackService.processBusinessLogic5(entity));
    }

}
