package com.michael1142.springmvc.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private Double price;
}
