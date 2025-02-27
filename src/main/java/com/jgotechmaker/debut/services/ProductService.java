package com.jgotechmaker.debut.services;

import com.jgotechmaker.debut.repositories.ProductRepository;
import com.jgotechmaker.debut.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    final ProductRepository productRepository;
    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Integer id) {
        return productRepository.findById(Long.valueOf(id)).orElse(null);
    }
    public void deleteProductById(Integer id) {
        productRepository.deleteById(Long.valueOf(id));
    }
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }
}
