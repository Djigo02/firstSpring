package com.jgotechmaker.debut.controllers;

import com.jgotechmaker.debut.entities.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @GetMapping("/products")
    public List<Product> getProducts() {
        return List.of(
                new Product("REF_01","Lait",12,1500),
                new Product("REF_02","Pain",20,1000),
                new Product("REF_03","Fromage",15,2000),
                new Product("REF_04","Pizza", 8, 800)

        );
    }
}
