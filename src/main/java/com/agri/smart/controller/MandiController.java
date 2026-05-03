package com.agri.smart.controller;

import com.agri.smart.entity.MandiRate;
import com.agri.smart.service.MandiService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mandi")
@CrossOrigin("*")
public class MandiController {

    private final MandiService service;

    public MandiController(MandiService service) {
        this.service = service;
    }

    @PostMapping
    public MandiRate addRate(@RequestBody MandiRate rate) {
        return service.addRate(rate);
    }

    @GetMapping
    public List<MandiRate> getAllRates() {
        return service.getAllRates();
    }

    @GetMapping("/city/{city}")
    public List<MandiRate> getByCity(@PathVariable String city) {
        return service.getRatesByCity(city);
    }
}