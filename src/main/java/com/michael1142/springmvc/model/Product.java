package com.michael1142.springmvc.model;

import lombok.Data;
import lombok.NonNull;

@Data
public class Product {
    @NonNull
    private Long id;
    @NonNull
    private String name;
    @NonNull
    private Double price;
}
