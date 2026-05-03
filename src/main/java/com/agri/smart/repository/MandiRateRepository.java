package com.agri.smart.repository;

import com.agri.smart.entity.MandiRate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MandiRateRepository extends JpaRepository<MandiRate, Long> {
    List<MandiRate> findByCityIgnoreCase(String city);
    List<MandiRate> findByCropNameIgnoreCase(String cropName);
}