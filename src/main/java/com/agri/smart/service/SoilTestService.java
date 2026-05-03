package com.agri.smart.service;

import com.agri.smart.entity.SoilTest;
import com.agri.smart.repository.SoilTestRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoilTestService {

    private final SoilTestRepository repo;

    public SoilTestService(SoilTestRepository repo) {
        this.repo = repo;
    }

    public SoilTest saveTest(SoilTest test) {
        String recommendation;

        if (test.getPhValue() < 6.0) {
            recommendation = "Soil is acidic. Use lime and organic compost.";
        } else if (test.getPhValue() > 7.5) {
            recommendation = "Soil is alkaline. Use gypsum and organic manure.";
        } else {
            recommendation = "Soil pH is good. Use balanced NPK fertilizer.";
        }

        test.setRecommendation(recommendation);
        return repo.save(test);
    }

    public List<SoilTest> getAllTests() {
        return repo.findAll();
    }
}