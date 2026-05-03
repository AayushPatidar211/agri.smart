package com.agri.smart.service;

import com.agri.smart.entity.MandiRate;
import com.agri.smart.repository.MandiRateRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MandiService {

    private final MandiRateRepository repo;

    public MandiService(MandiRateRepository repo) {
        this.repo = repo;
    }

    public MandiRate addRate(MandiRate rate) {
        return repo.save(rate);
    }

    public List<MandiRate> getRatesByCity(String city) {
        return repo.findByCityIgnoreCase(city);
    }

    public List<MandiRate> getAllRates() {
        return repo.findAll();
    }
}