package com.michael1142.springmvc.controller;

import com.michael1142.springmvc.model.Product;
import com.michael1142.springmvc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/")
    public String products(Model model) {
        model.addAttribute("products", productService.findAll());
        return "products";
    }

    @PostMapping("/")
    // http://localhost:8080/products/?name=product&price=12.50
    public String addProduct(Model model,
                             Product p) {

        productService.addProduct(p);

        model.addAttribute("products", productService.findAll());

        return "products";
    }

    @GetMapping("/delete/{id}")
    //
    public String deleteProduct(Model model,
                                @PathVariable() long id) {

        productService.deleteProduct(id);

        model.addAttribute("products", productService.findAll());

        return "products";
    }
}
