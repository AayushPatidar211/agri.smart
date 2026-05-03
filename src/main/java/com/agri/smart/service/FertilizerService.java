package com.agri.smart.service;

import com.agri.smart.entity.Fertilizer;
import com.agri.smart.repository.FertilizerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FertilizerService {

    private final FertilizerRepository repo;

    public FertilizerService(FertilizerRepository repo) {
        this.repo = repo;
    }

    public Fertilizer addFertilizer(Fertilizer fertilizer) {
        return repo.save(fertilizer);
    }

    public List<Fertilizer> getAllFertilizers() {
        return repo.findAll();
    }

    public void deleteFertilizer(Long id) {
        repo.deleteById(id);
    }
}