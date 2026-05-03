package com.agri.smart.service;

import com.agri.smart.entity.Policy;
import com.agri.smart.repository.PolicyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolicyService {

    private final PolicyRepository repo;

    public PolicyService(PolicyRepository repo) {
        this.repo = repo;
    }

    public Policy addPolicy(Policy policy) {
        return repo.save(policy);
    }

    public List<Policy> getAllPolicies() {
        return repo.findAll();
    }
}