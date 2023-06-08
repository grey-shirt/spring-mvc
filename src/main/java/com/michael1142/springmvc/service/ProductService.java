package com.michael1142.springmvc.service;

import com.michael1142.springmvc.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> productList = new ArrayList<>();

    public List<Product> findAll() {
        return productList;
    }

    public void addProduct(Product p) {
        productList.add(p);
    }

    public void deleteProduct(Long id) {
        productList.removeIf((Product p) -> p.getId().equals(id));
    }
}
