package com.jgotechmaker.debut.services;

import com.jgotechmaker.debut.entities.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    public List<Product> getProducts() {
        return List.of(
                new Product("REF_01", "Lait", 12, 1500),
                new Product("REF_02", "Pain", 20, 1000),
                new Product("REF_03", "Fromage", 15, 2000),
                new Product("REF_04", "Pizza", 8, 800)

        );
    }
}
