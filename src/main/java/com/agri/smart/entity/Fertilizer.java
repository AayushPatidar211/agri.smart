package com.agri.smart.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Fertilizer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fertilizerName;
    private String category;
    private String suitableFor;
    private Double price;
    private Integer stock;
    private String imageUrl;
}