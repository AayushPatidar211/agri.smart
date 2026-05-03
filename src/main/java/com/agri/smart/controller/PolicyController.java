package com.agri.smart.controller;

import com.agri.smart.entity.Policy;
import com.agri.smart.service.PolicyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/policies")
@CrossOrigin("*")
public class PolicyController {

    private final PolicyService service;

    public PolicyController(PolicyService service) {
        this.service = service;
    }

    @PostMapping
    public Policy addPolicy(@RequestBody Policy policy) {
        return service.addPolicy(policy);
    }

    @GetMapping
    public List<Policy> getPolicies() {
        return service.getAllPolicies();
    }
}