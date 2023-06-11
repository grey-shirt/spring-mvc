package com.michael1142.springmvc.service;

import com.michael1142.springmvc.model.Product;
import com.michael1142.springmvc.respositoy.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public void addProduct(Product p) {
        productRepository.save(p);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    public Optional<List<Product>> findByName(String name) {
        return productRepository.findProductByName(name);
    }

    public Optional<List<Product>> searchProducts(String search) {
        return productRepository.findProductByNameContainingIgnoreCase(search);
    }
}
