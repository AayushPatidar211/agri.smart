package com.agri.smart.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MandiRate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String city;
    private String mandiName;
    private String cropName;
    private Double minPrice;
    private Double maxPrice;
    private Double modalPrice;
    private String rateDate;
}