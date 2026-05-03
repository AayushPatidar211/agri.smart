package com.agri.smart.controller;

import com.agri.smart.entity.SoilTest;
import com.agri.smart.service.SoilTestService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/soil")
@CrossOrigin("*")
public class SoilTestController {

    private final SoilTestService service;

    public SoilTestController(SoilTestService service) {
        this.service = service;
    }

    @PostMapping("/test")
    public SoilTest saveTest(@RequestBody SoilTest test) {
        return service.saveTest(test);
    }

    @GetMapping
    public List<SoilTest> getAllTests() {
        return service.getAllTests();
    }
}