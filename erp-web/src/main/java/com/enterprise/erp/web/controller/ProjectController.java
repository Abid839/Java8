package com.enterprise.erp.web.controller;

import com.enterprise.erp.domain.entity.Project;
import com.enterprise.erp.core.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {

    private final ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @PostMapping
    public org.springframework.http.ResponseEntity<Project> create(@RequestBody Project entity) {
        return org.springframework.http.ResponseEntity.ok(projectService.create(entity));
    }

    @GetMapping
    public org.springframework.http.ResponseEntity<List<Project>> getAll() {
        return org.springframework.http.ResponseEntity.ok(projectService.findAll());
    }

    @org.springframework.web.bind.annotation.PostMapping("/1")
    public org.springframework.http.ResponseEntity<Project> processEndpoint1(@org.springframework.web.bind.annotation.RequestBody Project entity) {
        return org.springframework.http.ResponseEntity.ok(projectService.processBusinessLogic1(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/2")
    public org.springframework.http.ResponseEntity<Project> processEndpoint2(@org.springframework.web.bind.annotation.RequestBody Project entity) {
        return org.springframework.http.ResponseEntity.ok(projectService.processBusinessLogic2(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/3")
    public org.springframework.http.ResponseEntity<Project> processEndpoint3(@org.springframework.web.bind.annotation.RequestBody Project entity) {
        return org.springframework.http.ResponseEntity.ok(projectService.processBusinessLogic3(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/4")
    public org.springframework.http.ResponseEntity<Project> processEndpoint4(@org.springframework.web.bind.annotation.RequestBody Project entity) {
        return org.springframework.http.ResponseEntity.ok(projectService.processBusinessLogic4(entity));
    }

    @org.springframework.web.bind.annotation.PostMapping("/5")
    public org.springframework.http.ResponseEntity<Project> processEndpoint5(@org.springframework.web.bind.annotation.RequestBody Project entity) {
        return org.springframework.http.ResponseEntity.ok(projectService.processBusinessLogic5(entity));
    }

}
