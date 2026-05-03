package com.agri.smart.controller;

import com.agri.smart.entity.Fertilizer;
import com.agri.smart.service.FertilizerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fertilizers")
@CrossOrigin("*")
public class FertilizerController {

    private final FertilizerService service;

    public FertilizerController(FertilizerService service) {
        this.service = service;
    }

    @PostMapping
    public Fertilizer addFertilizer(@RequestBody Fertilizer fertilizer) {
        return service.addFertilizer(fertilizer);
    }

    @GetMapping
    public List<Fertilizer> getFertilizers() {
        return service.getAllFertilizers();
    }

    @DeleteMapping("/{id}")
    public String deleteFertilizer(@PathVariable Long id) {
        service.deleteFertilizer(id);
        return "Fertilizer deleted";
    }
}