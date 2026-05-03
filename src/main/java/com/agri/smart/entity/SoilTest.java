package com.agri.smart.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SoilTest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String farmerName;
    private String city;
    private Double phValue;
    private Double nitrogen;
    private Double phosphorus;
    private Double potassium;
    private String soilType;
    private String recommendation;
}